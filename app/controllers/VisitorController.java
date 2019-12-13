package controllers;

import models.Restaurant;
import models.Visitor;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.createvisitor;
import views.html.editvisitor;
import views.html.visitorcard;
import javax.inject.Inject;
import java.util.List;

public class VisitorController extends Controller {

    @Inject
    FormFactory formFactory;

    public Result createVisitor() {
        Form<Visitor> visitorForm = formFactory.form(Visitor.class);
        return ok(createvisitor.render(visitorForm));
    }

    public Result saveVisitorChanges() {

        // Getting created visitor from the previous form.
        // TODO: remove deprecated method bindFromRequest
        Form<Visitor> visitorForm = formFactory.form(Visitor.class).bindFromRequest();

        if (visitorForm.hasErrors()){
            return badRequest(createvisitor.render(visitorForm));
        }

        Visitor newVisitor = visitorForm.get();

        // Checking the uniqueness of the INN.
        for (Visitor visitor : Visitor.visitorFinder.all()) {
            if (visitor.getPhoneNumber().equals(newVisitor.getPhoneNumber())) {
                return redirect(routes.HomeController.showError("A visitor with this phone number already exists!"));
            }
        }
        for (Visitor visitor : Visitor.visitorFinder.all()) {
            if (visitor.getEmail().equals(newVisitor.getEmail())) {
                return redirect(routes.HomeController.showError("A visitor with this email already exists!"));
            }
        }

        newVisitor.setId((long) (Math.random()*10000));
        newVisitor.save();

        return redirect(routes.HomeController.greetings());
    }

    public Result editVisitor(String visitorName) {

        Visitor visitor = searchVisitorByName(visitorName);

        if (visitor == null) {
            return redirect(routes.HomeController.showError("Editing error!"));
        }

        Form<Visitor> visitorForm = formFactory.form(Visitor.class).fill(visitor);
        return ok(editvisitor.render(visitorForm, visitorName));

    }

    public Result updateVisitor(String visitorName) {

        Visitor updatedVisitor = formFactory.form(Visitor.class).bindFromRequest().get();
        Visitor oldVisitor = searchVisitorByName(visitorName);

        if (oldVisitor == null) {
            return redirect(routes.HomeController.showError("Updating error!"));
        }

        // If the phone number has been changed, a check is performed.
        if (!updatedVisitor.getPhoneNumber().equals(oldVisitor.getPhoneNumber())) {
            for (Visitor existingVisitor : Visitor.visitorFinder.all()) {
                if (existingVisitor.getPhoneNumber().equals(updatedVisitor.getPhoneNumber()) &
                        !updatedVisitor.getPhoneNumber().equals(oldVisitor.getPhoneNumber())) {
                    return redirect(routes.HomeController.showError("A visitor with this phone number already exists!"));
                }
            }
        }

        // If the email has been changed, a check is performed.
        if (!updatedVisitor.getEmail().equals(oldVisitor.getEmail())){
            for (Visitor existingVisitor : Visitor.visitorFinder.all()) {
                if (existingVisitor.getEmail().equals(updatedVisitor.getEmail())) {
                    return redirect(routes.HomeController.showError("A visitor with this email already exists!"));
                }
            }
        }

        oldVisitor.setFirstName(updatedVisitor.getFirstName());
        oldVisitor.setLastName(updatedVisitor.getLastName());
        oldVisitor.setEmail(updatedVisitor.getEmail());
        oldVisitor.setPhoneNumber(updatedVisitor.getPhoneNumber());
        oldVisitor.update();

        return redirect(routes.VisitorController.showVisitorCard(updatedVisitor.getFirstName()));
    }

    public Result destroyVisitor(String visitorName) {

        Visitor destroyingVisitor = searchVisitorByName(visitorName);

        if (destroyingVisitor == null) {
            return redirect(routes.HomeController.showError("Deleting error!"));
        }

        destroyingVisitor.delete();

        return redirect(routes.HomeController.greetings());
    }

    public Result showVisitorCard(String visitorName) {

        Visitor visitor = searchVisitorByName(visitorName);

        if (visitor == null) {
            return redirect(routes.HomeController.showError("Visitor not found!"));
        }

        List<Restaurant> newRestaurants = Restaurant.restaurantFinder.all();
        newRestaurants.removeAll(visitor.getVisitedRestaurants());

        return ok(visitorcard.render(visitor, newRestaurants));

    }

    private Visitor searchVisitorByName(String visitorName) {
        long id = 0;

        for (Visitor visitor : Visitor.visitorFinder.all()) {
            if (visitor.getFirstName().equals(visitorName)) id = visitor.getId();
        }

        return Visitor.visitorFinder.byId(id);
    }

}
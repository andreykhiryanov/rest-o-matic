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
        newVisitor.setId((long) (Math.random()*10000));
        newVisitor.save();

        return redirect(routes.HomeController.greetings());
    }

    public Result editVisitor(String visitorName) {

        // Searching requested restaurant
        Visitor visitor = searchVisitorByName(visitorName);

        // If the requested restaurant was not found, the method 'getRestaurantByName' returns null.
        if (visitor == null) {
            return notFound("Visitor not found!");
        }

        Form<Visitor> visitorForm = formFactory.form(Visitor.class).fill(visitor);
        return ok(editvisitor.render(visitorForm, visitorName));

    }

    public Result updateVisitor(String visitorName) {

        Visitor visitor = formFactory.form(Visitor.class).bindFromRequest().get();
        Visitor oldVisitor = searchVisitorByName(visitorName);

        if (oldVisitor == null) {
            return notFound("You cannot change the name of the visitor, because it is the ID!");
        }

        oldVisitor.setFirstName(visitor.getFirstName());
        oldVisitor.setLastName(visitor.getLastName());
        oldVisitor.setEmail(visitor.getEmail());
        oldVisitor.setPhoneNumber(visitor.getPhoneNumber());
        oldVisitor.update();

        return redirect(routes.VisitorController.showVisitorCard(visitor.getFirstName()));
    }

    public Result destroyVisitor(String visitorName) {

        Visitor destroyingVisitor = searchVisitorByName(visitorName);

        if (destroyingVisitor == null) {
            return notFound("Visitor not found!");
        }

        destroyingVisitor.delete();

        return redirect(routes.HomeController.greetings());
    }

    public Result showVisitorCard(String visitorName) {

        Visitor visitor = searchVisitorByName(visitorName);

        if (visitor == null) {
            return notFound("Visitor not found!");
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
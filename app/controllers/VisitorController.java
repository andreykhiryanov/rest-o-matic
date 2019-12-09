package controllers;

import entities.Restaurant;
import entities.Visitor;
import models.Manager;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.home.createvisitor;
import views.html.home.editvisitor;
import views.html.home.visitorcard;
import javax.inject.Inject;

public class VisitorController extends Controller {

    private Manager manager = Manager.getManager();

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

        // Transferring new restaurant to the manager for storage in the collection.
        manager.addNewVisitor(visitorForm.get());

        return redirect(routes.HomeController.greetings());
    }

    public Result editVisitor(String visitorName) {

        // Searching requested restaurant
        Visitor visitor = manager.getVisitorByName(visitorName);

        // If the requested restaurant was not found, the method 'getRestaurantByName' returns null.
        if (visitor == null) {
            return notFound("Visitor not found!");
        }

        Form<Visitor> visitorForm = formFactory.form(Visitor.class).fill(visitor);
        return ok(editvisitor.render(visitorForm));

    }

    public Result updateVisitor() {

        Visitor visitor = formFactory.form(Visitor.class).bindFromRequest().get();
        Visitor oldVisitor = manager.getVisitorByName(visitor.getFirstName());

        if (oldVisitor == null) {
            return notFound("You cannot change the name of the visitor yet!");
        }

        oldVisitor.setFirstName(visitor.getFirstName());
        oldVisitor.setLastName(visitor.getLastName());
        oldVisitor.setEmail(visitor.getEmail());
        oldVisitor.setPhoneNumber(visitor.getPhoneNumber());

        return redirect(routes.VisitorController.showVisitorCard(visitor.getFirstName()));
    }

    public Result destroyVisitor(String visitorName) {

        Visitor destroyingVisitor = manager.getVisitorByName(visitorName);

        for (Restaurant restaurant : manager.getAllRestaurants()) {
            restaurant.getAcceptedVisitors().remove(destroyingVisitor);
        }

        manager.getAllVisitors().remove(destroyingVisitor);

        return redirect(routes.HomeController.greetings());
    }

    public Result showVisitorCard(String visitorName) {

        Visitor visitor = manager.getVisitorByName(visitorName);

        if (visitor == null) {
            return notFound("Visitor not found!");
        }

        return ok(visitorcard.render(visitor));

    }

}
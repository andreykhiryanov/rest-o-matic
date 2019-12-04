package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.home.index;

public class HomeController extends Controller {

    public Result greetings() {
        return ok(index.render());
    }



}
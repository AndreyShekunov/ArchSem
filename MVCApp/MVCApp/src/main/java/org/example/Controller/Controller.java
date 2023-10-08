package org.example.Controller;

import org.example.Model.Model;
import org.example.View.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void update() {
        //MVC

        //Логика контроллера

        view.printAllStudent(model.getAllStudents());
    }
}

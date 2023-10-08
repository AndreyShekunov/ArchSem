package org.example.View;

import org.example.Controller.Controller;
import org.example.Controller.iGetController;
import org.example.Controller.iGetView;
import org.example.Model.Domen.Student;

import java.util.List;

public class View implements iGetView {

    private iGetController controller;

    public void setController(iGetController controller) {
        this.controller = controller;
    }

    public void callModel(){
        controller.update();
    }

    public void printAllStudent(List<Student> students){
        System.out.println("---------- Список студентов ----------");
        for (Student s : students){
            System.out.println(s);
        }
    }
}

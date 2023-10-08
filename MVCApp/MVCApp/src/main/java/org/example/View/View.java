package org.example.View;

import org.example.Controller.Controller;
import org.example.Model.Domen.Student;

import java.util.List;

public class View {

    private Controller controller;

    public void setController(Controller controller) {
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

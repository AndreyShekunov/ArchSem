package org.example.Controller;

import org.example.Model.Domen.Student;

import java.util.List;

public class Controller implements iGetController{
    private iGetModel model;
    private iGetView view;
    private List<Student> students;  //хранилище презентора

    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    //модель тестирования для презентора
    private boolean test(List<Student> studs){
        if(studs.size() > 0){
            return true;
        } else {
            return false;
        }
    }

    public void update() {
        //MVP
        students = model.getAllStudents();

        if (test(students)){
            view.printAllStudent(students);
        }else {
            System.out.println("Модель не доступна!");
        }


        //MVC

        //Логика контроллера

        //view.printAllStudent(model.getAllStudents());
    }
}

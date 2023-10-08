package org.example;

import org.example.Controller.Controller;
import org.example.Model.Domen.Student;
import org.example.Model.Model;
import org.example.View.View;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Сергей",  21, 101);
        Student s2 = new Student("Андрей",  22, 111);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 23, 301);
        Student s5 = new Student("Даша",  25, 171);
        Student s6 = new Student("Лена",  23, 104);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        //создание модели
        Model model = new Model(students);
        //Создание представления
        View view = new View();

        //Создание экземпляра контроллера
        Controller controller = new Controller(model, view);

        view.setController(controller);

        //Запуск работы модели
        controller.update();
    }
}
package pe.edu.tecsup.lab03.pe.edu.tecsup.lab03.controllers;

public class StudentController {

    public void init() {
        System.out.println("Hola");
    }

    public void execute() {
        System.out.println("Buenas Noches");
    }

    public static void main(String[] args) {
        StudentController stuc = new StudentController();
        stuc.init();
        stuc.execute();
    }
}

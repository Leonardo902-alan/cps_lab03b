package pe.edu.tecsup.lab03.controllers;

public class StudentController {

    // Métodos agregados en sprint-2
    public String getAllStudents() {
        return "Lista de todos los estudiantes";
    }

    public String getStudentById(Long id) {
        return "Estudiante con ID: " + id;
    }

    public String createStudent() {
        return "Crear nuevo estudiante";
    }
}
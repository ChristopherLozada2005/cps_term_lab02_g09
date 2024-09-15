package pe.edu.tecsup.lab02;

import java.util.ArrayList;
import java.util.List;

public class StudentController {

    // Lista para almacenar los estudiantes
    private List<String> students;

    // Constructor
    public StudentController() {
        this.students = new ArrayList<>();
    }

    // Método para agregar un estudiante
    public void addStudent(String student) {
        students.add(student);
        System.out.println("Estudiante " + student + " agregado.");
    }

    // Método para eliminar un estudiante
    public void removeStudent(String student) {
        if (students.remove(student)) {
            System.out.println("Estudiante " + student + " eliminado.");
        } else {
            System.out.println("Estudiante " + student + " no encontrado.");
        }
    }

    // Método para listar todos los estudiantes
    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("Lista de estudiantes:");
            for (String student : students) {
                System.out.println("- " + student);
            }
        }
    }

    // Método principal para probar el controlador
    public static void main(String[] args) {
        StudentController controller = new StudentController();

        controller.addStudent("Juan Perez");
        controller.addStudent("Maria Gomez");

        controller.listStudents();

        controller.removeStudent("Juan Perez");
        controller.listStudents();
    }
}


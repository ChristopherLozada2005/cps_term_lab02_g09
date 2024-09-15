package pe.edu.tecsup.lab02;

public class StudentModel {

    // Atributos del estudiante
    private String name;
    private String studentId;
    private int age;

    // Constructor vacío
    public StudentModel() {
    }

    // Constructor con parámetros
    public StudentModel(String name, String studentId, int age) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Método para mostrar la información del estudiante
    @Override
    public String toString() {
        return "StudentModel{" +
                "name='" + name + '\'' +
                ", studentId='" + studentId + '\'' +
                ", age=" + age +
                '}';
    }
}


package Lab4;

public class Person {
    private String name;
    private String email;
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public static void main(String[] args) {
        Person persoana = new Person("Persoana", "persoana@gmail.com");
        Student student = new Student(10, new int[]{10, 2, 5});
        Profesor profesor = new Profesor("matematica", new String[]{"Romana", "Chimie", "Matematica"});
        System.out.println("Numele persoanei este: " + persoana.getName());
        System.out.println("Email-ul persoanei este: " + persoana.getEmail());


        System.out.println("Numele studentului este: " + student.getName());
        System.out.println("Email-ul studentului este: " + student.getEmail());
        System.out.println("Nota studentului este: " + student.getGrades());


        System.out.println("Numele profesorului este: " + profesor.getName());
        System.out.println("Email-ul profesorului este: " + profesor.getEmail());
        System.out.println("Materia predata de profesor este: " + profesor.getCourses());
    }
}
class Student extends Person {
    private int grades;
    private int[] array;
    public Student(int grades, int[] array) {
        super("Andrei", "ciobanandrei@gmail.com");
        this.grades = grades;
        this.array = array;
    }
    public int getGrades() {
        return grades;
    }
    public int[] getArray() {
        return array;
    }
}
class Profesor extends Person {
    private String courses;
    private String[] array;
    public Profesor(String courses, String[] array) {
        super("Popescu", "popescu@gmail.com");
        this.courses = courses;
        this.array = array;
    }

    public String getCourses() {
        return courses;
    }

    public String[] getArray() {
        return array;
    }
}

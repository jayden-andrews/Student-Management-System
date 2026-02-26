package students.jaydenandrews;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Student", "Jordan", "Smith", "jordan.smith@gmail.com", 2, 3.8);
        Student student2 = new Student("Student", "Marcus", "Brown", "marcus.brown@gmail.com", 1, 2.9);
        Instructor instructor = new Instructor("Instructor", "Jose", "Rivera", "jose.rivera@ud.edu", "Computer Science");

        student1.getSummary();
        student2.getSummary();
        instructor.getSummary();
    }
}

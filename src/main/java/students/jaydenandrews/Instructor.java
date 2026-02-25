package students.jaydenandrews;
import java.util.ArrayList;

public class Instructor extends Person {
    private String department;
    private ArrayList<Student> students;

    public Instructor(String id, String firstName, String lastName, String email, String department) {
        super(id, firstName,lastName, email);
        this.department = department;
        this.students = new ArrayList<>();
    }

    @Override
    public void getSummary() {
        System.out.println("[Instructor] Dr."+ this.getLastName() + " | Department: " + this.department);
    }

    public void createAnnouncement(String message) {
        System.out.println("Dr." + this.getLastName() + " announces: " + message);
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void printRoster() {
        System.out.println("Dr." + this.getLastName() + "'s Roster:\n");
        for (Student student : this.students) {
            System.out.println("- " + student.getFirstName() + " " + student.getLastName() +
                    " | Grade Level: " + student.getGradeLevel() + " | GPA: " + student.getGpa());
        }
    }

}

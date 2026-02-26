package students.jaydenandrews;

public class Student extends Person {
    private int gradeLevel;
    private double gpa;

    public Student(String id, String firstName, String lastName, String email, int gradeLevel, double gpa) {
        super(id, firstName,lastName, email);
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
    }

    @Override
    public void getSummary() {
        System.out.println("[Student] " + this.getFirstName() + " " + this.getLastName() + " | " +
                "Grade Level: " + this.gradeLevel + " | GPA: " + this.gpa + " | Honor Roll: " + isOnHonorRoll());
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public String isOnHonorRoll() {
        return (this.gpa > 3.0 ? "Yes" : "No");
    }
}

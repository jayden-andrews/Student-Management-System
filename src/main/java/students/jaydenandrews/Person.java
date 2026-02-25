package students.jaydenandrews;

public abstract class Person {
    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public Person(String id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public abstract void getSummary();
}

package registration;

public class Student extends Person {

    private String major;
    private double gpa;

    public Student(String name, int age, String email, String major, double gpa) {
        super(name, age, email);
        this.major = major;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student: " +
                "major=" + major +
                ", gpa= " + gpa + ", " + super.toString();
    }

    public void registerCourse(Course course) {
        course.addStudent(this);

    }


}

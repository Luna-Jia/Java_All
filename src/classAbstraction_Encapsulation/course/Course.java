package classAbstraction_Encapsulation.course;

public class Course {
    private String courseName;
    private String[] students = new String[100]; // uses an array to store the students in the course
    private int numberOfStudents;

    public Course(String courseName) { // course constructor
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        //
    }
}

// The Course class is implemented in Listing 10.6. It uses an array to store the students in the course. For simplicity,
// assume the maximum course enrollment is 100. The array is created using new String[100] in line 5. The addStudent
// method (line 12) adds a student to the array. Whenever a new student is added to the course, numberOfStudents is
// increased (line 14). The getStudents method returns the array. The dropStudent method (line 27) is left as an exercise.

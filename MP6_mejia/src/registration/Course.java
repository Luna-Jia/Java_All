package registration;

public class Course {
    private String department;
    private String courseName;

    private int maxClassSize;
    private Student[] roster;
    private int enrollmentNumber;
    private Faculty instructor;

    public Course(String department, String courseName, int maxClassSize) {
        this.department = department;
        this.courseName = courseName;

        this.maxClassSize = maxClassSize;
        this.roster = new Student[maxClassSize];
        this.enrollmentNumber = 0;
    }

    @Override
    public String toString() {
        return "Course: " +
                "department='" + department + '\'' +
                ", courseName='" + courseName + '\'' +
                ", maxClassSize=" + maxClassSize +
                ", enrollmentNumber=" + enrollmentNumber + (instructor != null? ", "+ instructor: "");
    }

    public void addStudent(Student student ){
        if (enrollmentNumber< maxClassSize) {
            for (int i = 0; i < enrollmentNumber; i++) {
                if (student.equals(roster[i])) {
                    System.out.println(student.getName() + " is already in the class.");
                    return;
                }
            }
            roster[enrollmentNumber++] = student;
        }else {
            System.out.println(student.getName() + " cannot be added to the roster. Class is full.");
        }
    }

    public void displayRoster(){
        if (enrollmentNumber > 0) {
            System.out.println("class roster: ");
            for (int i = 0; i < enrollmentNumber; i++) {
                System.out.println(roster[i]);
            }
        }else{
            System.out.println("No student currently enrolled.");
        }
    }

    public void assignInstructor(Faculty faculty){
        if (faculty.getDepartment().equals(this.department)){
            instructor = faculty;
            System.out.println(faculty.getName() + " has been assigned to teach this course.");
        } else {
            System.out.println(faculty.getName()+" cannot be assigned to this course. Only faculties from " + this.department +" department can be assigned to teach this course.");
        }
    }

}

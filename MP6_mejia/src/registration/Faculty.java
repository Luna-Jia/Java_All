package registration;

import java.util.Objects;

public class Faculty extends Person {

    private String department;
    private String office;

    public Faculty(String name, int age, String email, String department,String office ) {
        super(name, age, email);
        this.department = department;
        this.office = office;
    }

    @Override
    public String toString() {
        return "Faculty: " +
                "department=" + department +
                ", office=" + office + super.toString();
    }

    public String getDepartment() {
        return department;
    }

    public boolean equals(Object object){
        if (object==null){
            return false;
        }else if (object.getClass() != this.getClass()){
            return false;
        }else {
            Faculty faculty = (Faculty)object;
            return getName().equals(faculty.getName()) && this.getAge()== faculty.getAge() && this.getEmail().equals(faculty.getEmail())
                     && this.department.equals(faculty.department);
        }
    }
}

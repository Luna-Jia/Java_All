package objectsAndClass;

public class Test356 {

    public static void main(String[] args) {
        Student356 student = new Student356(111223333, "John");
        java.util.Date dateCreated = student.getDateCreated();
        dateCreated.setTime(200000); // Now dateCreated field is changed!
    }
}

// As shown in the following code, the data field dateCreated is returned using the getDateCreated() method. This is a
// reference to a Date object. Through this reference, the content for dateCreated can be changed.

// For a class to be immutable, it must meet the following requirements:
//■■ All data fields must be private.
//■■ There can’t be any mutator methods for data fields.
//■■ No accessor methods can return a reference to a data field that is mutable.
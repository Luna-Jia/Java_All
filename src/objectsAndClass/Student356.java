package objectsAndClass;

public class Student356 {

    private int id;
    private String name;
    private java.util.Date dateCreated;

    public Student356(int ssn, String newName) {
        id = ssn;
        name = newName;
        dateCreated = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }
}

// If a class is immutable, then all its data fields must be private and it cannot contain public setter methods for any
// data fields. A class with all private data fields and no mutators is not necessarily immutable. For example, the
// following Student class has all private data fields and no setter methods, but it is not an immutable class:
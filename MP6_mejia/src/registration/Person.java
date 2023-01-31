package registration;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "name=" + name +
                ", age=" + age +
                ", email=" + email + " ";
    }

    public boolean equals(Object object){
        if (object==null){
            return false;
        }else if (object.getClass() != this.getClass()){
            return false;
        }else {
            Person person = (Person)object;
            return this.name.equals(person.name) && this.age == person.age && this.email.equals(person.email);
        }
    }


}

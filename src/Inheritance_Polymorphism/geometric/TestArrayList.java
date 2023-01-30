package Inheritance_Polymorphism.geometric;
import java.util.ArrayList;
public class TestArrayList {
    public static void main(String[] args) {
        // Create a list to store cities
        ArrayList<String> cityList = new ArrayList<>(); //  The program creates an ArrayList of strings using its no-arg constructor and assigns the reference to cityList (line 6).

        // Add some cities in the list
        cityList.add("London"); //  The add method (lines 9) adds strings to the end of list. Thus, after cityList.add("London") (line 9), the list contains [London]
        // cityList now contains [London]
        cityList.add("Denver");
        // cityList now contains [London, Denver]
        cityList.add("Paris");
        // CityList now contains [London, Denver, Paris]
        cityList.add("Miami");
        // cityList now contains [London, Denver, Paris, Miami]
        cityList.add("Seoul");
        // Contains [London, Denver, Paris, Miami, Seoul]
        cityList.add("Tokyo");
        // Contains [London, Denver, Paris, Miami, Seoul, Tokyo]

        System.out.println("List size? " + cityList.size()); // Invoking size() (line 22) returns the size of the list, which is currently 6.
        System.out.println("Is Miami in the list? " + cityList.contains("Miami")); // Invoking contains("Miami") (line 23) checks whether the object is in the list. In this case, it returns true, since Miami is in the list.
        System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver")); // Invoking indexOf("Denver") (line 24) returns the index of Denver in the list, which is 1. If Denver were not in the list, it would return –1.
        System.out.println("Is the list empty? " + cityList.isEmpty()); // The isEmpty() method (line 25) checks whether the list is empty. It returns false, since the list is not empty.

        // Insert a new city at index 2
        cityList.add(2,"Xian"); // The statement cityList.add(2, "Xian") (line 28) inserts an object into the list at the specified index. After this statement, the list becomes
        // Contains [London, Denver, Xian, Paris, Miami, Seoul, Tokyo]

        // Remove a city from the list
        cityList.remove("Miami"); // The statement cityList.remove("Miami") (line 32) removes the object from the list. After this statement, the list becomes
        // Contains [London, Denver, Xian, Paris, Seoul, Tokyo]

        // Remove a city at index 1
        cityList.remove(1); // The statement cityList.remove(1) (line 36) removes the object at the specified index from the list. After this statement, the list becomes
        // Contains[London, Xian, Paris, Seoul, Tokyo]

        // Display the contents in the list
        System.out.println(cityList.toString()); // The statement in line 40 is same as: System.out.println(cityList); // The toString() method returns a string representation of the list in the form of [e0.toString(), e1.toString(), ..., ek.toString()], where e0, e1, . . . , and ek are the elements in the list.

        // Display the contents in the list in reverse order
        for (int i = cityList.size()-1; i >=0; i--)
            System.out.print(cityList.get(i) + " "); // The get(index) method (line 44) returns the object at the specified index.
        System.out.println();

        // Create a list to store two circles
        ArrayList<Circle> list = new ArrayList<>();

        // Add two circles
        list.add(new Circle(2));
        list.add(new Circle(3));

        // Display the area of the first circle in the list
        System.out.println("The area of the circle? " + list.get(0).getArea());
    }
}

// ArrayList objects can be used like arrays, but there are many differences. Table 11.1 lists their similarities and differences.
//Once an array is created, its size is fixed. You can access an array element using the square-bracket notation (e.g., a[index]). When an ArrayList is created, its size is 0.

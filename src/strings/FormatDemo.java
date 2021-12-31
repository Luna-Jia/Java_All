package strings;
public class FormatDemo {
    public static void main(String[] args) {
        // Display the header of the table // The statements in lines 6 display the column names of the table.
        // The column names are strings. Each string is displayed using the specifier %−10s, which left-justifies the string.
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","Degrees", "Radians","Sine", "Cosine", "Tangent");

        // Display values for 30 degrees
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n",degrees, radians, Math.sin(radians),Math.cos(radians),Math.tan(radians));
    } // The statements in lines 11 display the degrees as an integer and four float values. The integer is displayed using the
    // specifier %−10d, and each float is displayed using the specifier %−10.4f, which specifies four digits after the decimal point.
}

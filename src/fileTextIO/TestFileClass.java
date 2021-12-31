package fileTextIO;
public class TestFileClass {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("image/us.txt"); // create a File
        System.out.println("Does it exist?" + file.exists());
        System.out.println("The file has " + file.length() + " bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("is it hidden? " + file.isHidden());
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("Last modified on " + new java.util.Date(file.lastModified())); // The lastModified() method returns the date and time when the file was last modified, measured in milliseconds since the beginning of UNIX time (00:00:00 GMT, January 1, 1970). The Date class is used to display it in a readable format in lines 14.
    }
}

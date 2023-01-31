package book_class;

import java.time.LocalDate;

public class BookDemo {
    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter and the Sorcerer's Stone",
                new Author("J.K","Rowling", LocalDate.of(1965,7,31)),
                "B017V4IMVQ", 11.99);
        System.out.println(book1);
        Book book2 = new Book("Harry Potter and the Chamber of Secrets",
                new Author("J.K","Rowling",LocalDate.of(1965,7,31)),
                "B017V4IPPO", 13.0);
        System.out.println(book2);

        if (book1.equals(book2)) {
            System.out.println("they are the same books");
        }else{
            System.out.println("they are different books");
        }

    }
}

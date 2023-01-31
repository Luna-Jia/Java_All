package book_class;

import java.time.LocalDate;

class Author {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    public String getFirstNameName() {
        return firstName;
    }
    public void setFirstName(String fName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Author(String firstName, String lastName, LocalDate birthday){

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;

    }


    @Override
    public String toString() {
        return "Author{" + firstName  +
                "," + lastName + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public boolean equals (Author otherAuthor) {
        return firstName.equals(otherAuthor.firstName)
                && lastName.equals(otherAuthor.lastName)
                && birthday.equals(otherAuthor.birthday);
    }
}

public class Book {
    private String name;
    private Author author;
    private String isbn;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(String name, Author author, String isbn, double price) {
        this.price = price;
        this.name = name;
        this.isbn = isbn;
        this.author = author;
    }


    public boolean equals(Book otherBook) {
        return name.equals(otherBook.name) && author.equals(otherBook.author) && isbn.equals(otherBook.isbn) &&
                price == otherBook.price;
    }

    @Override
    public String toString() {
        return "Book{" + name +" "+ author +
                ", isbn='" + isbn + '\'' +
                ", price=$" + price +
                '}';
    }
}
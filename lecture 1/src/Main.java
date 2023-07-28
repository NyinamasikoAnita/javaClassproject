import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Book book1 = new Book("kidnapped", "anita","89564");
        Book book2 = new Book("donald trump", "ngigu", "5632417896");
        Book book3 = new Book("things fall apart","ramsey","6571368");

//        ADDING BOOKS INTO A LIBRARY
        Book.addBook(book1);
        Book.addBook(book2);
        Book.addBook(book3);

//        getting all books
        ArrayList<Book>Library = Book.getLibrary();

//                removing a book
        Book.removeBook(book2);

//        printing out the list of books in the library using for each
        for (Book book:Library){
            System.out.println();
            System.out.println("title :" + book.getTitle() + "\nauthor:" + book.getAuthor() + "\nISBN:" + book.getISBN());
        }
    }
}

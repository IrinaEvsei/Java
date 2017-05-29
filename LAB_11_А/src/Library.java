import java.util.*;

/**
 * Created by Skori on 18.05.2017.
 */
public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    Library(Book... arr) {
        for (Book b : arr) {
            books.add(b);
        }
    }


    Book get(int id) {
        Book b = null;
        for (Book book : books) {
            if (book.getId() == id) {
                b = book;
            }
        }
        return b;
    }


}

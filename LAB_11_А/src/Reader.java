import java.util.concurrent.TimeUnit;

/**
 * Created by Skori on 24.05.2017.
 */
public class Reader extends Thread {
    private String name;
    private Book book;
    Reader(String name, Book b) {
        this.name = name;
        this.book = b;
    }

    @Override
    public void run() {
        book.read(name);
    }
}

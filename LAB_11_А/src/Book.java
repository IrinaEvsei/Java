import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Skori on 18.05.2017.
 */
public class Book{
    private String nameBook;
    private int id;
    private String nameAvtor;
    ExecutorService executor = Executors.newFixedThreadPool(1);
    ReentrantLock lock = new ReentrantLock();


    public Book(String nameBook, int id, String nameAvtor) {
        this.nameBook = nameBook;
        this.id = id;
        this.nameAvtor = nameAvtor;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameAvtor() {
        return nameAvtor;
    }

    public void setNameAvtor(String nameAvtor) {
        this.nameAvtor = nameAvtor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (id != book.id) return false;
        if (!nameBook.equals(book.nameBook)) return false;
        return nameAvtor.equals(book.nameAvtor);
    }

    @Override
    public int hashCode() {
        int result = nameBook.hashCode();
        result = 31 * result + id;
        result = 31 * result + nameAvtor.hashCode();
        return result;
    }

    public void read(String name) {
        lock.lock();
        System.out.println(name + " читает '" + nameBook + "'");
        try {
            TimeUnit.SECONDS.sleep(4);
            System.out.println(name + " дочитал '" + nameBook + "'");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

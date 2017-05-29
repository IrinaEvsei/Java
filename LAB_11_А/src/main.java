/**
 * Created by Skori on 18.05.2017.
 */
public class main {
    public static void main(String... args) {
        Book b0 = new Book("Мастер и Маргарита", 0 , "Булгаков");
        Book b1 = new Book("Рассказы", 1 , "О.Генри");
        Book b2 = new Book("Вино из одуванчиков", 2 , "Брэдберри");

        Library library = new Library(b0, b1, b2);

        Thread r0 = new Reader("Maria", library.get(0));
        r0.start();
        Thread r1 = new Reader("Ekaterina", library.get(1));
        r1.start();
        Thread r2 = new Reader("Ihor", library.get(2));
        r2.start();
        Thread r4 = new Reader("Vasilii", library.get(0));
        r4.start();
    }
}

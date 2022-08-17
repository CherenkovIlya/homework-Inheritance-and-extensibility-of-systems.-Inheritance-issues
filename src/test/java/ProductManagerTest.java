import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {

    Repository repo = new Repository();
    ProductManager manager = new ProductManager(repo);

    Book book1 = new Book(1, "book1", 100, "Author1");
    Book book2 = new Book(2, "book2", 100, "Author1");
    Book book3 = new Book(3, "book3", 100, "Author3");
    Book book4 = new Book(4, "Magazine4", 100, "Author4");


    Smartphone smartphone1 = new Smartphone(5, "S6", 1000, "Samsung");
    Smartphone smartphone2 = new Smartphone(6, "S7", 1000, "Samsung");
    Smartphone smartphone3 = new Smartphone(7, "S8", 1000, "Samsung");
    Smartphone smartphone4 = new Smartphone(8, "IPhone 11 Pro", 1000, "Apple");



    @Test
    public void searchBooks() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);

        Product[] expected = { book1, book2, book3};
        Product[] actual = manager.searchBy("book");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchSmartphones() {
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        manager.add(smartphone4);

        Product[] expected = { smartphone4};
        Product[] actual = manager.searchBy("IPhone");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAll() {
        manager.add(book1);
        manager.add(book2);
        repo.findAll();
        Product[] expected = { book1, book2};
        Product[] actual = repo.findAll();
    }


    @Test
    public void removeById() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);

        Assertions.assertThrows(NotFoundException.class,
                () -> manager.removeById(10)
                );
    }

    @Test
    public void removeByIdSuccess() {
        manager.add(book1);
        manager.add(book2);
        manager.removeById(2);
        Product[] expected = { book1};
        Product[] actual = repo.findAll();
    }



}

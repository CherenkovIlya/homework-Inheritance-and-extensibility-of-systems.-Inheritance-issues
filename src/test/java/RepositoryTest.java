import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {

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
    public void removeById() {
        manager.add(book1);
        manager.add(book2);
        repo.removeById(1);
        Product[] expected = { book2};
        Product[] actual = repo.findAll();
    }


}
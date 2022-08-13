import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Book book = new Book(1, "Fire", 100, "Russell");


    @Test
    public void setAuthor() {
        book.setAuthor("Black");

        String expected = "Black";
        String actual = book.getAuthor();
        Assertions.assertEquals(expected, actual);
    }
}
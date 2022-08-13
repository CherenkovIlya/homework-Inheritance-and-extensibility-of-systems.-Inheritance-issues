import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product product = new Product(1, "TShirt", 800);

    @Test
    public void setId() {
        product.setId(18);

        int expected = 18;
        int actual = product.getId();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setName() {
        product.setName("Boots");

        String expected = "Boots";
        String actual = product.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrice() {
        product.setPrice(900);

        int expected = 900;
        int actual = product.getPrice();

        Assertions.assertEquals(expected, actual);
    }
}
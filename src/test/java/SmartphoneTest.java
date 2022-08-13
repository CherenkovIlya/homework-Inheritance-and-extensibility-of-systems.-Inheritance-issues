import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    Smartphone smartphone = new Smartphone(5, "S6", 1000, "Samsung");



    @Test
    public void setProducer() {
        smartphone.setProducer("Apple");
        String expected = "Apple";
        String actual = smartphone.getProducer();

        Assertions.assertEquals(expected, actual);


    }

}
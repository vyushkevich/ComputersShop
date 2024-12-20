package factoria5f.computersshop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import factoria5f.computersshop.Model.Computer;
import factoria5f.computersshop.Model.Shop;

public class ShopTest {
    @Test
    public void testAddComputer() {
        Shop shop = new Shop("TestShop", "John Doe", "12345");
        Computer computer = new Computer("Dell", 16, "Intel i5", "Windows 10", 800.0);

        shop.addComputer(computer);
        assertEquals(1, shop.listComputers().size());
    }
}

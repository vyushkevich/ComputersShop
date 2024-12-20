package factoria5f.computersshop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
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

    @Test
    public void testRemoveComputer() {
        Shop shop = new Shop("TestShop", "John Doe", "12345");
        Computer computer = new Computer("Dell", 16, "Intel i5", "Windows 10", 800.0);

        shop.addComputer(computer);
        assertTrue(shop.removeComputer("Dell"));
        assertEquals(0, shop.listComputers().size());
    }

    @Test
    public void testFindComputer() {
        Shop shop = new Shop("TestShop", "John Doe", "12345");
        Computer computer = new Computer("Dell", 16, "Intel i5", "Windows 10", 800.0);

        shop.addComputer(computer);
        assertNotNull(shop.findComputer("Dell"));
        assertNull(shop.findComputer("Apple"));
    }
}

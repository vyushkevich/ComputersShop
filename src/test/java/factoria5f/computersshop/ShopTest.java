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

    @Test
public void testAddMultipleComputers() {
    Shop shop = new Shop("Tech Haven", "Alice", "12345-TX");
    Computer computer1 = new Computer("Dell", 16, "Intel i7", "Windows 10", 1200.0);
    Computer computer2 = new Computer("Apple", 8, "M1", "macOS", 1500.0);

    shop.addComputer(computer1);
    shop.addComputer(computer2);

    assertEquals(2, shop.listComputers().size());
}

@Test
public void testRemoveNonExistentComputer() {
    Shop shop = new Shop("Tech Haven", "Alice", "12345-TX");
    assertFalse(shop.removeComputer("NonExistent"));
}

@Test
public void testSetOwner() {
    Shop shop = new Shop("Tech Haven", "Alice", "12345-TX");
    shop.setOwner("Bob");
    assertEquals("Bob", shop.getOwner());
}

}

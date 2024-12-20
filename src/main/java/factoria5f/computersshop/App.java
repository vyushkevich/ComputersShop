package factoria5f.computersshop;

import factoria5f.computersshop.Controller.ShopController;
import factoria5f.computersshop.Model.Computer;
import factoria5f.computersshop.Model.Shop;
import factoria5f.computersshop.View.ShopView;

public class App {
    public static void main(String[] args) {
        Shop shop = new Shop("Tech Haven", "Alice", "12345-TX");
        shop.addComputer(new Computer("Dell", 16, "Intel i7", "Windows 10", 1200.0));
        shop.addComputer(new Computer("Apple", 8, "M1", "macOS", 1500.0));

        ShopView view = new ShopView();
        ShopController controller = new ShopController(shop, view);

        controller.start();
    }
}

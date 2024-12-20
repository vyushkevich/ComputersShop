package factoria5f.computersshop;

import factoria5f.computersshop.Controller.ShopController;
import factoria5f.computersshop.Model.Shop;
import factoria5f.computersshop.View.ShopView;

public class App {
    public static void main(String[] args) {
        Shop shop = new Shop("TechWorld", "Alice", "123456789");
        ShopView view = new ShopView();
        ShopController controller = new ShopController(shop, view);

        controller.start();
    }
}

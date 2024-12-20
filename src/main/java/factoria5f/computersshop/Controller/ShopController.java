package factoria5f.computersshop.Controller;

import factoria5f.computersshop.Model.Shop;
import factoria5f.computersshop.View.ShopView;

import java.util.Scanner;

public class ShopController {
    private final Shop shop;
    private final ShopView view;

    public ShopController(Shop shop, ShopView view) {
        this.shop = shop;
        this.view = view;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            view.displayMessage("Welcome to " + shop.getShopName() + "!");
            view.displayMessage("1. View Shop Details");
            view.displayMessage("2. Update Owner");
            view.displayMessage("3. View All Computers");
            view.displayMessage("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    view.displayMessage("Shop Details:");
                    view.displayMessage("Name: " + shop.getShopName());
                    view.displayMessage("Owner: " + shop.getOwner());
                    view.displayMessage("Tax ID: " + shop.getTaxId());
                    break;
                case 2:
                    System.out.print("Enter new owner's name: ");
                    String newOwner = scanner.nextLine();
                    shop.setOwner(newOwner);
                    view.displayMessage("Owner updated successfully!");
                    break;
                case 3:
                    view.displayComputers(shop.listComputers());
                    break;
                case 4:
                    view.displayMessage("Thank you for visiting " + shop.getShopName() + "!");
                    scanner.close();
                    return;
                default:
                    view.displayMessage("Invalid option. Please try again.");
            }
        }
    }
}

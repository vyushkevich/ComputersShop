// ShopController.java
package factoria5f.computersshop.Controller;

import factoria5f.computersshop.Model.Computer;
import factoria5f.computersshop.Model.Shop;
import factoria5f.computersshop.View.ShopView;

import java.util.Scanner;

public class ShopController {
    private Shop shop;
    private ShopView view;

    public ShopController(Shop shop, ShopView view) {
        this.shop = shop;
        this.view = view;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            view.displayMessage("""
                    Select an option:
                    1. Add a computer
                    2. Remove a computer by brand
                    3. Find a computer by brand
                    4. List all computers
                    5. Exit
                    """);
            option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1 -> addComputer(scanner);
                case 2 -> removeComputer(scanner);
                case 3 -> findComputer(scanner);
                case 4 -> listComputers();
                case 5 -> view.displayMessage("Exiting...");
                default -> view.displayMessage("Invalid option. Please try again.");
            }
        } while (option != 5);
    }

    private void addComputer(Scanner scanner) {
        view.displayMessage("Enter brand:");
        String brand = scanner.nextLine();
        view.displayMessage("Enter memory (in GB):");
        int memory = scanner.nextInt();
        scanner.nextLine(); // consume newline
        view.displayMessage("Enter processor:");
        String processor = scanner.nextLine();
        view.displayMessage("Enter operating system:");
        String os = scanner.nextLine();
        view.displayMessage("Enter price:");
        double price = scanner.nextDouble();

        Computer computer = new Computer(brand, memory, processor, os, price);
        shop.addComputer(computer);
        view.displayMessage("Computer added successfully!");
    }

    private void removeComputer(Scanner scanner) {
        view.displayMessage("Enter brand to remove:");
        String brand = scanner.nextLine();
        if (shop.removeComputer(brand)) {
            view.displayMessage("Computer removed successfully!");
        } else {
            view.displayMessage("No computer found with that brand.");
        }
    }

    private void findComputer(Scanner scanner) {
        view.displayMessage("Enter brand to search:");
        String brand = scanner.nextLine();
        Computer computer = shop.findComputer(brand);
        if (computer != null) {
            view.displayMessage("Computer found: " + computer);
        } else {
            view.displayMessage("No computer found with that brand.");
        }
    }

    private void listComputers() {
        view.displayComputers(shop.listComputers());
    }
}

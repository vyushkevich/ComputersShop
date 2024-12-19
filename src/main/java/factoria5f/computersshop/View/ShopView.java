package factoria5f.computersshop.View;

import factoria5f.computersshop.Model.Computer;

import java.util.List;

public class ShopView {
    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayComputers(List<Computer> computers) {
        if (computers.isEmpty()) {
            System.out.println("No computers available in the shop.");
        } else {
            System.out.println("Computers in the shop:");
            for (Computer computer : computers) {
                System.out.println(computer);
            }
        }
    }
}

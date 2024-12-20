package factoria5f.computersshop.Model;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String shopName;
    private String owner;
    private String taxId;
    private List<Computer> computers;

    public Shop(String shopName, String owner, String taxId) {
        this.shopName = shopName;
        this.owner = owner;
        this.taxId = taxId;
        this.computers = new ArrayList<>();
    }

    public String getShopName() {
        return shopName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTaxId() {
        return taxId;
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public boolean removeComputer(String brand) {
        return computers.removeIf(computer -> computer.getBrand().equalsIgnoreCase(brand));
    }

    public Computer findComputer(String brand) {
        for (Computer computer : computers) {
            if (computer.getBrand().equalsIgnoreCase(brand)) {
                return computer;
            }
        }
        return null;
    }

    public List<Computer> listComputers() {
        return new ArrayList<>(computers);
    }
}

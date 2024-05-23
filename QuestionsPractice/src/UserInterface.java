
import java.util.*;
class LaptopInfo {
    private String laptopId;
    private String modelName;
    private String brandName;
    private double cost;
 
    public LaptopInfo(String laptopId, String modelName, String brandName, double cost) {
        this.laptopId = laptopId;
        this.modelName = modelName;
        this.brandName = brandName;
        this.cost = cost;
    }
 
    public String getLaptopId() {
        return laptopId;
    }
 
    public void setLaptopId(String laptopId) {
        this.laptopId = laptopId;
    }
 
    public String getModelName() {
        return modelName;
    }
 
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
 
    public String getBrandName() {
        return brandName;
    }
 
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
 
    public double getCost() {
        return cost;
    }
 
    public void setCost(double cost) {
        this.cost = cost;
    }
 
    public double calculateLaptopCost() {
        if (cost <= 0) {
            return -1;
        }
 
        double discountPercentage;
        switch (brandName.toLowerCase()) {
            case "apple":
                discountPercentage = 5;
                break;
            case "dell":
                discountPercentage = 10;
                break;
            case "samsung":
                discountPercentage = 15;
                break;
            case "lenovo":
                discountPercentage = 20;
                break;
            default:
                return -1;
        }
 
        return cost - ((cost * discountPercentage) / 100);
    }
}
 
class UserInterface {
    public static LaptopInfo extractDetails(String laptopDetails) {
        String[] details = laptopDetails.split(":");
        if (details.length == 4) {
            return new LaptopInfo(details[0], details[1], details[2], Double.parseDouble(details[3]));
        } else {
            return null;
        }
    }
 
    public static void main(String[] args) {
        System.out.println("Enter the laptop details");
       // String input1 = "LAP101:FX506IdeaPad:Lenovo:50000";
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        LaptopInfo laptopInfo1 = extractDetails(input1);
 
        if (laptopInfo1 != null) {
            System.out.println("Laptop Details");
            System.out.println("Laptop Id: " + laptopInfo1.getLaptopId());
            System.out.println("Model Name: " + laptopInfo1.getModelName());
            System.out.println("Brand Name: " + laptopInfo1.getBrandName());
            System.out.println("Laptop cost: " + laptopInfo1.calculateLaptopCost());
        }
}
}

package lv.lu.gatis.kretulnieks.finalwork.model;

public class ProductInputData {

    private String name;
    private Double price;
    private static String category;
    private static Double discount;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

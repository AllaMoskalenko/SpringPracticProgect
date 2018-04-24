package ua.alla.shop.dao.model;

public class Product {

    private Long id;
    private String name;
    private int price;
    private String gender;
    private String color;
    private int size;
    private int remainder;

    public Product() {
    }

    public Product(Long id, String name, int price, String gender, String color, int size, int remainder) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.remainder = remainder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getRemainder() {
        return remainder;
    }

    public void setRemainder(int remainder) {
        this.remainder = remainder;
    }

    @Override
    public String toString() {
        return "Product {" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", gender='" + gender + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", remainder=" + remainder +
                '}' +'\n';
    }
}

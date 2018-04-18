package ua.alla.shop.dao.model;

public class Product {

    private Long id;
    private String name;
    private int price;
    private Gender gender;
    private Color color;
    private Size size;
    private int remainder;

    public enum Gender{
        MALE, FEMALE, UNISEX, BOYS, GIRLS
    }

    public enum Size {
        XS, S, M, L, XL, XXL
    }

    public enum Color{
        WHITE, YELLOW, ORANGE, RED, PURPLE, BLUE, GREEN, BROWN, GREY, BLACK
    }

    public Product() {
    }

    public Product(Long id, String name, int price, Gender gender, Color color, Size size, int remainder) {
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
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
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

package ua.alla.shop.services.dto;

import ua.alla.shop.dao.model.Product;

public class ProductDto {
    private String name;
    private int price;
    private String gender;
    private String color;
    private String size;
    private int remainder;

    public ProductDto() {
    }

    public ProductDto(String name, int price, String gender, String color, String size, int remainder) {
        this.name = name;
        this.price = price;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.remainder = remainder;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
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
                ", size='" + size + '\'' +
                ", remainder=" + remainder +
                '}'+ '\n';
    }
}
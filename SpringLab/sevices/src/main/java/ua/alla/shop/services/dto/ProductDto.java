package ua.alla.shop.services.dto;

import ua.alla.shop.dao.model.Product;

public class ProductDto {
    private String name;
    private int price;
    private Product.Gender gender;
    private Product.Color color;
    private Product.Size size;
    private int remainder;

    public ProductDto() {
    }

    public ProductDto(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public ProductDto(String name, int price, Product.Gender gender, Product.Color color, Product.Size size, int remainder) {
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

    public Product.Gender getGender() {
        return gender;
    }

    public void setGender(Product.Gender gender) {
        this.gender = gender;
    }

    public Product.Color getColor() {
        return color;
    }

    public void setColor(Product.Color color) {
        this.color = color;
    }

    public Product.Size getSize() {
        return size;
    }

    public void setSize(Product.Size size) {
        this.size = size;
    }

    public int getRemainder() {
        return remainder;
    }

    public void setRemainder(int remainder) {
        this.remainder = remainder;
    }
}

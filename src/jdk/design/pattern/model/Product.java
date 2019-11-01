package jdk.design.pattern.model;

/**
 * @author zhangke
 * @version 1.0
 * @className Product
 * @description TODO
 * @date 2019/5/16 4:13 PM
 **/
public class Product {
    private  String color;
	private int price;

	public Product(String color, int price) {
		this.color = color;
		this.price = price;
	}

	public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

	@Override
	public String toString() {
		return "Product{" +
				"color='" + color + '\'' +
				", price=" + price +
				'}';
	}
}
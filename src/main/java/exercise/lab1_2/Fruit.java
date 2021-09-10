package exercise.lab1_2;

import java.util.Comparator;

public class Fruit implements Comparator<Fruit> {
	private String name;
	private int price;
	private int stock_num;
	
	
	public Fruit() {
	}

	public Fruit(String name, int price, int stock_num) {
		super();
		this.name = name;
		this.price = price;
		this.stock_num = stock_num;
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
	public int getStock_num() {
		return stock_num;
	}
	public void setStock_num(int stock_num) {
		this.stock_num = stock_num;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + ", stock_num=" + stock_num + "]";
	}

	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}

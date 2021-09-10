package exercise.lab1_2;

import java.util.Comparator;

public class Fruit implements Comparator<Fruit> {
	private int number;
	private String name;
	private int price;
	
	
	public Fruit() {
	}

	public Fruit(int number, String name, int price) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
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
	public int getNumber() {
		return number;
	}
	public void setStock_num(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Fruit [number=" + number + ", name=" + name + ", price=" + price + "]";
	}

	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}

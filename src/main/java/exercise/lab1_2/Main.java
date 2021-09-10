package exercise.lab1_2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main I = new Main();
		I.run();
	}
	
	void run() {
		ArrayList<Fruit> array = new ArrayList<Fruit>();
		String[] name = {"apple", "mango", "banana", "watermelon", "peach", "grape", "kiwi", "strawberry", "orange", "cherry"};
		int[] price = {3000, 5000, 4000, 6000, 4000, 4500, 3900, 7000, 4200, 3500};
		
		for(int i=0; i<10; i++) {
			array.add(new Fruit(i+1, name[i], price[i]));
		}
		
		Collections.sort(array, new FruitComparator());
		for (Fruit f : array) {
			System.out.println(f.toString());
		}
	}
}

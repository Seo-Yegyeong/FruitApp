package exercise.lab1_2;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {
	public int compare(Fruit o1, Fruit o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

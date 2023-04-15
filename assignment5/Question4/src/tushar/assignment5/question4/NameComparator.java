package tushar.assignment5.question4;

import java.util.Comparator;

public class NameComparator implements Comparator<Menu>{
	@Override
	public int compare(Menu o1,Menu o2) {
		return o1.dishName.compareTo(o2.dishName);
	}
}

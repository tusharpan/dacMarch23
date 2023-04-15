package tushar.assignment5.question4;

import java.util.Comparator;

public class CalorieCompoarator implements Comparator<Menu> {
	@Override
	public int compare(Menu o1, Menu o2) {
		return  o1.cal-o2.cal;

	}
	}
package tushar.assignment5.question4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		
	
	int choice;
	Menu menu [] =  {
		new Menu("Shahi Paneer",200,1000),
		new Menu("Butter Paneer Masala",180,1500),
		new Menu("Dudh Sev",90,1000),
		new Menu ("Nan",35,800)
	};

	while( ( choice = Menu.menuList( ) ) != 0 ) {
		Comparator<Menu> comparator = null;
		switch( choice ) {
		case 1:
			comparator = new NameComparator();
			break;
		case 2:
			comparator = new PriceComparator();
			break;
		case 3:
			comparator = new CalorieCompoarator();
			break;
		
		}
		Arrays.sort(menu, comparator);
		Menu.print(menu);
	}
	}
}

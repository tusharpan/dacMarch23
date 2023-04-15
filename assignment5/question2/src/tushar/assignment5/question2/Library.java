package tushar.assignment5.question2;

import java.time.LocalDate;
import java.util.Arrays;

public class Library {
public static void main(String[] args) {
//	Book b2= new Book("","",LocalDate.parse(""));
	Book [] b1 = {
			new Book("how to win friends e","Dale carnegie",LocalDate.parse("1980-12-17")),
			new Book("the secret ","Rhonda Byrne",LocalDate.parse("2000-12-17")),
			new Book("48 Laws of power","james simons",LocalDate.parse("2010-12-17")),
			new Book("ikigai","funsuk ysufzai",LocalDate.parse("2020-12-17")),
			new Book("atomic habits","name bhul gaya",LocalDate.parse("1560-12-17"))
	};
	Book.printRecord(b1);
	Arrays.sort(b1);
	Book.printRecord(b1);
}
}

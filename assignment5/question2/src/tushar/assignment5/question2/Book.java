package tushar.assignment5.question2;

import java.time.LocalDate;

public class Book implements Comparable<Book> {
String name;
String authorname;
LocalDate PY;

public Book(String name, String authorname, LocalDate pY) {
	
	this.name = name;
	this.authorname = authorname;
	this.PY = pY;
}

@Override
	public int compareTo(Book other) {
	return this.PY.compareTo(other.PY);
		
	}

public static void printRecord(Book [] b1) {
	if (b1 != null) {
		for (Book book : b1) 
		System.out.println(book.toString());
			
		System.out.println();
	}
	System.out.println();
}

@Override
public String toString() {
	return String.format("%-40s %-15s %-10s",this.name ,this.authorname,this.PY);
}


}

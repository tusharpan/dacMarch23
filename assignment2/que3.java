import java.util.Scanner;

class Book{
    String title;
    String author;
    String publisher;
    String isbn;
    int year;
    double price;
    int quantity;
Scanner sc = new Scanner (System.in);

//paramterless constructor
Book(){
    this.title="no title given";
    this.author="unknown author";
    this.publisher="unknown";
    this.isbn="unknown";
    this.year=0000;
    this.price=0.0;
    this.quantity=-1;
}
    //parameterized constructor
    Book ( String title , String author , String publisher ,String isbn ,int year ,double price ,int quantity ){

    this.title=title;
    this.author=author;
    this.publisher=publisher;
    this.isbn=isbn;
    this.year=year;
    this.price=price;
    this.quantity=quantity;

  }
    //getter
    public void getDetails(){
    System.out.println("title     : " +this.title);
    System.out.println("author    : " +this.author);
    System.out.println("publisher : " +this.publisher);
    System.out.println("isbn      : " +this.title);
    System.out.println("year      : " +this.year);
    System.out.println("price     : " +this.price);
    System.out.println("quantity  : " +this.quantity);
  }
  //setter
  public void setDetails (){
    System.out.println("Enter Title     :");
    this.title=sc.nextLine();
    System.out.println("Enter Author    :");
    this.author=sc.nextLine();
    System.out.println("Enter Publisher :");
    this.publisher=sc.nextLine();
    System.out.println("Enter ISBN      :");
    this.isbn=sc.nextLine();
    System.out.println("Enter Year      :");
    this.year=sc.nextInt();
    System.out.println("Enter Price     :");
    this.price=sc.nextDouble();
    System.out.println("Enter Quantity  :");
    this.quantity=sc.nextInt();

  }
  public void increaseQuantiy(int quantity){
    this.quantity+=quantity;
    System.out.println("Quantity increased , current Quantity is "+this.quantity);

  }
  public void decreaseQuantiy(int quantity){
    this.quantity-=quantity;
    System.out.println("Quantity decreased , current Quantity is "+this.quantity);

  }
    public int getInventoryValue(){
        return quantity;
    }

}
public class que3 {
    public static void main(String[] args) {
        System.out.printf("---------- WELCOME TO THE BOOK MANAGMENT SYSTEM------------\n");
        Book bookobj1 = new Book();
        bookobj1.setDetails();
        bookobj1.getDetails();
        bookobj1.increaseQuantiy(110);
        bookobj1.decreaseQuantiy(10);
        System.out.println("Inventory value is"+ bookobj1.getInventoryValue());

        Book bookobj2 = new Book("HOW TO WIN FRIENDS AND INFLUENCE PEOPLE","DALE CARNEGIE","Simon & Schuster" ,"9781982171452.",1936 ,3045.50,10);
        bookobj2.getDetails();
        bookobj2.increaseQuantiy(10);
        

       
    }
}

class Publication
{
String title;
double price;
int copies;
public Publication(String title, double price, int copies)
{
this.title = title;
this.price = price;
this.copies = copies; // ₹
}
public double saleCopy(int copiesSold)
{
this.copies = copiesSold;
return copiesSold * price;
}
public void display()
{
System.out.println("Title: "+title);
System.out.println("Price: "+price);
System.out.println("Copies: "+copies);
}
}
class Book extends Publication
{
String author;
public Book(String title, double price, int copies, String author)
{
super(title, price, copies);
this.author = author;
}
public void orderCopies(int numOfCopies)
{
this.copies += numOfCopies;
}
public void display()
{
super.display();
System.out.println("Author: "+author);
}
}
class Magazine extends Publication
{
String currentIssue;
public Magazine(String title, double price, int copies, String currentIssue)
{
super(title, price, copies);
this.currentIssue = currentIssue;
}
public void orderQty(int qty)
{
this.copies += qty;
}
public void receiveIssue(String issue)
{
this.currentIssue = issue;
}
public void display()
{
super.display();
System.out.println("Current Issue: "+currentIssue);
}
}
public class Assign2
{
public static void main(String[] args)
{
Book book1 = new Book("Java Programming", 500, 100, "James Gosling");
book1.orderCopies(20);
double bookSales = book1.saleCopy(120);
book1.display();
System.out.println("Total sales for the book: " + bookSales);
System.out.println("----------------------------------------------");
Magazine mag1 = new Magazine("Tech Today", 100, 50, "August 2024");
mag1.orderQty(10);
mag1.receiveIssue("September 2024");
double magSales = mag1.saleCopy(60);
mag1.display();
System.out.println("Total sales for the magazine: " + magSales);
System.out.println("----------------------------------------------");
System.out.println("Total copies of the book ordered: " + book1.copies);
System.out.println("Total sales of Publications: " + (bookSales + magSales));
}
}

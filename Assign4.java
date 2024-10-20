import java.util.Scanner;
abstract class Shape
{
abstract public void compute(int a, int b);
abstract public void area();
}
class Triangle extends Shape
{
int base;
int height;
public void compute(int base, int height)
{
this.base=base;
this.height=height;
}
public void area()
{
System.out.println("The Area of Triangle is:"+0.5*base*height);
}
}
class Rectangle extends Shape
{
int length;
double breadth;
public void compute(int length, int breadth)
{
this.length=length;
this.breadth=breadth;
}
public void area()
{
System.out.println("The Area of Rectangle is:"+length*breadth);
}
}
public class Assign4
{
public static void main(String[] args)
{
int ch;
Scanner sc=new Scanner(System.in);
do{
System.out.println("---------*********-----------");
System.out.println("MENU\n1.Area of Triangle\n2.Area of Reactangle");
System.out.println("Enter your choice(1/2):");
ch=sc.nextInt();
switch (ch)
{
case 1:
System.out.print("Enter base of triangle:");
int k1=sc.nextInt();
System.out.print("Enter height of triangle:");
int k2=sc.nextInt();
Triangle n1=new Triangle();
n1.compute(k1,k2);
n1.area();
break;
case 2:
System.out.print("Enter length of rectangle:");
int k3=sc.nextInt();
System.out.print("Enter breadth of rectangle:");
int k4=sc.nextInt();
Rectangle n2=new Rectangle();
n2.compute(k3,k4);
n2.area();
break;
default:
System.out.println("please enter valid choice");
break;
}
}while(ch!=3);
}
}

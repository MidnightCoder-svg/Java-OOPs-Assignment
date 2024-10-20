import java.util.Scanner;
class complex_num
{
float real;
float img;
public complex_num(float a,float b)
{
real=a;
img=b;
}
static void addnum(complex_num c1,complex_num c2)
{
float real=c1.real+c2.real;
float img=c1.img+c2.img;
System.out.println("Addition of complex no = ("+real+")+("+img+")i");
}
static void subnum(complex_num c1,complex_num c2)
{
float real=c1.real-c2.real;
float img=c1.img-c2.img;
System.out.println("Subtraction of complex no = ("+real+")+("+img+")i");
}
static void multnum(complex_num c1,complex_num c2)
{
float real=c1.real*c2.real-c1.img*c2.img;
float img=c1.img*c2.real+c1.real*c2.img;
System.out.println("Multiplictaion of complex no =("+real+")+("+img+")i");
}
static void divnum(complex_num c1,complex_num c2)
{
float denom=c2.real*c2.real+c2.img*c2.img;
float real=(c1.real*c2.real-c1.img*c2.img)/denom;
float img=(c1.real*c2.img+c1.img*c2.real)/denom;
System.out.println("Divisiom of complex no = ("+real+")+("+img+")i");
}
}
public class Assign1
{
public static void main(String[] args)
{
Scanner s1 = new Scanner(System.in);
System.out.print("Enter 1 real number: ");
float r1 = s1.nextInt();
System.out.print("Enter 1 imaginary number: ");
float i1 = s1.nextInt();
System.out.print("Enter 2 real number: ");
float r2 = s1.nextInt();
System.out.print("Enter 2 imaginary number: ");
float i2 = s1.nextInt();
complex_num n1=new complex_num(r1,i1);
complex_num n2=new complex_num(r2,i2);
complex_num.addnum(n1,n2);
complex_num.subnum(n1,n2);
complex_num.multnum(n1,n2);
complex_num.divnum(n1,n2);
}
}

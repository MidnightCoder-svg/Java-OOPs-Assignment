import java.util.Scanner;
public class Assign6 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int ch;
do{
System.out.println("Enter your choice:");
System.out.println("1.Arithmatic Exception");
System.out.println("2.NullPointer Exception");
System.out.println("3.NumberFormat Exception");
System.out.println("4.ArrayIndexOutOfBounds Exception");
System.out.println("5.Exit");
ch = sc.nextInt();
switch (ch) {
case 1:
try {
int a = 100 / 0;
} catch (ArithmeticException e) {
System.out.println(e);
}
System.out.println("---------------------------------------------");
break;
case 2:
try {
String s = null;
System.out.println(s.length());
} catch (NullPointerException e) {
System.out.println(e);
}
System.out.println("------------------------------------------------");
break;
case 3:
try {
String m = "abc";
int i = Integer.parseInt(m);
} catch (NumberFormatException e) {
System.out.println(e);
}
System.out.println("--------------------------------------------------");
break;
case 4:
try {
int a[] = new int[5];
a[10] = 50;
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println(e);
}
System.out.println("-------------------------------------------------");
break;
case 5:
System.exit(0);
System.out.println("-------------------------------------------------");
break;
default:
System.out.println("Invalid choice");
break;
}
}while(ch!=6);
sc.close();
}
}

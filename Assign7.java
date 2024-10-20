import java.util.*;
class Generic {
int fact, r, temp;
int sum;
int evenoddnum;
int primenumber;
int palnum;
public void evenodd(int evenoddnum) {
ArrayList<Integer> list = new ArrayList<>();
list.add(evenoddnum);
if (list.get(0) % 2 == 0) {
System.out.println(evenoddnum + " is even");
} else {
System.out.println(evenoddnum + " is odd");
}
}
public void prime(int primenumber) {
ArrayList<Integer> list1 = new ArrayList<>();
list1.add(primenumber);
int fact = 0;
if (list1.get(0) <= 1) {
fact = 1; // Not prime if <= 1
} else {
for (int i = 2; i <= list1.get(0); i++) {
if (list1.get(0) % i == 0) {
fact = 1;
break;
}
}
}
if (fact == 1) {
System.out.println(primenumber + " is not a prime number");
} else {
System.out.println(primenumber + " is a prime number");
}
}
public void pal(int palnum) {
ArrayList<Integer> list2 = new ArrayList<>();
list2.add(palnum);
int r, sum = 0;
int n = list2.get(0);
temp = n;
while (n > 0) {
r = n % 10;
sum = (sum * 10) + r;
n = n / 10;
}
if (temp == sum) {
System.out.println(palnum + " is a palindrome number");
} else {
System.out.println(palnum + " is not a palindrome number");
}
}
}
public class Assign7 {
public static void main(String args[]) {
Generic g = new Generic();
Scanner sc = new Scanner(System.in);
int choice;
do {
System.out.println("1 FOR EVEN/ODD NUMBER");
System.out.println("2 FOR CHECKING OF PRIME NUMBER.");
System.out.println("3 FOR CHECKING OF PALINDROME");
System.out.println("4 FOR END.");
System.out.print("Enter your choice: ");
choice = sc.nextInt();
switch (choice) {
case 1: {
System.out.print("Enter the number: ");
int evenoddnum = sc.nextInt();
g.evenodd(evenoddnum);
System.out.println();
break;
}
case 2: {
System.out.print("Enter the number: ");
int pn = sc.nextInt();
g.prime(pn);
System.out.println();
break;
}
case 3: {
System.out.print("Enter the number: ");
int paln = sc.nextInt();
g.pal(paln);
System.out.println();
break;
}
case 4: {
System.out.println("END");
break;
}
default: {
System.out.println("Please enter a valid choice");
break;
}
}
} while (choice != 4);
sc.close();
}
}

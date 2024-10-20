import java.util.Scanner;
class Employee
{
String name, mail_id, address;
int id;
long mobile_no;
double bp;
void info()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Name of the Employee: ");
name = sc.nextLine();
System.out.println("Enter the ID of Employee: ");
id = sc.nextInt();
System.out.println("Enter Mobile No of Employee: ");
mobile_no = sc.nextLong();
System.out.println("Enter Mail ID of the Employee: ");
mail_id = sc.next();
System.out.println("Enter address of Employee: ");
address = sc.next();
System.out.println("Enter your basic pay:");
bp = sc.nextInt();
}
void display()
{
System.out.println("-----------------*******------------");
System.out.println("Employee ID: "+id);
System.out.println("Employee name is :"+name);
System.out.println("Employee Mobile no is:"+mobile_no);
System.out.println("Employee mail id is: "+mail_id);
System.out.println("Employee address is: "+address);
System.out.println("Employee Basic pay is: "+bp);
}
}
class Programmer extends Employee
{
double hra, club, pf, da, gross_salary ,net_salary;
void psalary()
{
da = (0.97*bp);
hra = (0.10*bp);
pf = (0.12*bp);
club = (0.001*bp);
gross_salary = bp + da + hra;
net_salary = gross_salary - (pf + club);
System.out.println("Gross salary: "+gross_salary);
System.out.println("Net salary: "+net_salary);
}
}
class Team_Leader extends Employee
{
double hra, club, pf, da, gross_salary ,net_salary;
void tlsalary()
{
da = (0.97*bp);
hra = (0.10*bp);
pf = (0.12*bp);
club = (0.001*bp);
gross_salary = bp + da + hra;
net_salary = gross_salary - (pf + club);
System.out.println("Gross salary: "+gross_salary);
System.out.println("Net salary: "+net_salary);
}
}
class Asst_Proj_Manager extends Employee
{
double hra, club, pf, da, gross_salary ,net_salary;
void apmsalary()
{
da = (0.97*bp);
hra = (0.10*bp);
pf = (0.12*bp);
club = (0.001*bp);
gross_salary = bp + da + hra;
net_salary = gross_salary - (pf + club);
System.out.println("Gross salary: "+gross_salary);
System.out.println("Net salary: "+net_salary);
}
}
class Project_manager extends Employee
{
double hra, club, pf, da, gross_salary ,net_salary;
void pmsalary()
{
da = (0.97*bp);
hra = (0.10*bp);
pf = (0.12*bp);
club = (0.001*bp);
gross_salary = bp + da + hra;
net_salary = gross_salary - (pf + club);
System.out.println("Gross salary: "+gross_salary);
System.out.println("Net salary: "+net_salary);
}
}
class Assign3
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your Designation");
System.out.println("1. Programmer\n2.Team Leader\n3.Assistant Project Manager\n4.Project Manager");
int ch = sc.nextInt();
switch(ch)
{
case 1:
Programmer p1 = new Programmer();
p1.info();
p1.display();
p1.psalary();
break;
case 2:
Team_Leader t1 = new Team_Leader();
t1.info();
t1.display();
t1.tlsalary();
break;
case 3:
Asst_Proj_Manager a1 = new Asst_Proj_Manager();
a1.info();
a1.display();
a1.apmsalary();
break;
case 4:
Project_manager m1 = new Project_manager();
m1.info();
m1.display();
m1.pmsalary();
break;
}
}
}

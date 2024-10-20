interface Vehicle
{
void changeGear(int gear);
void speedup(int speed);
void applyBrakes(int brake);
void printStates();
}
class Bicycle implements Vehicle
{
int speed = 0;
int gear;
public void changeGear(int newGear) {
gear = newGear;
}
public void speedup(int increment)
{
speed += increment;
}
public void applyBrakes(int decrement)
{
speed -= decrement;
}
public void printStates()
{
System.out.println("Speed Of Bicycle : "+ speed+ "km/hr\nGear : " +
gear);
}
}
class Car implements Vehicle
{
int speed = 0;
int gear;
public void changeGear(int newGear) {
gear = newGear;
}
public void speedup(int increment)
{
speed += increment;
}
public void applyBrakes(int decrement)
{
speed -= decrement;
}
public void printStates()
{
System.out.println("Speed Of Car : " +speed+ "km/hr\nGear : " +
gear +"\n");
}
}
class Bike implements Vehicle
{
int speed = 0;
int gear;
public void changeGear(int newGear) {
gear = newGear;
}
public void speedup(int increment)
{
speed += increment;
}
public void applyBrakes(int decrement)
{
speed -= decrement;
}
public void printStates()
{
System.out.println("Speed Of Bike: " +speed+ "km/hr\nGear : " +
gear +"\n");
}
}
public class Assign5
{
public static void main(String[] args)
{
Bicycle b1 = new Bicycle();
b1.changeGear(4);
b1.speedup(15);
b1.applyBrakes(5);
System.out.println("---------------------------");
System.out.println("Present State of Bicycle: ");
b1.printStates();
Car c1 = new Car();
c1.changeGear(5);
c1.speedup(80);
c1.applyBrakes(50);
System.out.println("---------------------------");
System.out.println("Present State of Car: ");
c1.printStates();
Bike b2 = new Bike();
b2.changeGear(4);
b2.speedup(70);
b2.applyBrakes(50);
System.out.println("---------------------------");
System.out.println("Present State of Bike: ");
b2.printStates();
}
}

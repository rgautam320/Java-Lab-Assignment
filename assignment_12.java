public class assignment_12 
{
	public static void main(String[] args) 
	{
		// Creating Instance of Bicycle
		Bicycle bicycle = new Bicycle();
		bicycle.changeGear(4);
		bicycle.speedUp(5);
		bicycle.applyBrakes(1);
		
		System.out.println("Bicycle's Present State: ");
		bicycle.printStates();
		
		// Creating Instance of Bike
		Bike bike = new Bike();
		bike.changeGear(3);
		bike.speedUp(12);
		bike.applyBrakes(4);
		
		System.out.println("Bike's Present State: ");
		bike.printStates();
		
		// Creating Instance of Car
		Car car = new Car();
		car.changeGear(5);
		car.speedUp(15);
		car.applyBrakes(8);
		
		System.out.println("Car's Present State: ");
		car.printStates();
	}
}
interface Vehicle
{
	void changeGear(int a);
	void speedUp(int a);
	void applyBrakes(int a);
}
class Bicycle implements Vehicle
{
	int speed, gear;
	
	@Override
	public void changeGear(int newGear)
	{
		gear = newGear;
	}
	@Override
	public void speedUp(int increment)
	{
		speed = speed + increment;
	}
	@Override
	public void applyBrakes(int decrement)
	{
		speed = speed - decrement;
	}
	public void printStates()
	{
		System.out.println("Speed: "+ speed + "\nGear : " + gear);
	}
}
class Bike implements Vehicle
{
	int speed, gear;
	
	@Override
	public void changeGear(int newGear)
	{
		gear = newGear;
	}
	@Override
	public void speedUp(int increment)
	{
		speed = speed + increment;
	}
	@Override
	public void applyBrakes(int decrement)
	{
		speed = speed - decrement;
	}
	public void printStates()
	{
		System.out.println("Speed: "+ speed + "\nGear : " + gear);
	}
}
class Car implements Vehicle
{
	int speed, gear;
	
	@Override
	public void changeGear(int newGear)
	{
		gear = newGear;
	}
	@Override
	public void speedUp(int increment)
	{
		speed = speed + increment;
	}
	@Override
	public void applyBrakes(int decrement)
	{
		speed = speed - decrement;
	}
	public void printStates()
	{
		System.out.println("Speed: "+ speed + "\nGear : " + gear);
	}
}
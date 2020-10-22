public class assignment_11 
{
	public static void main(String[] args) 
	{
		Rect rect = new Rect();
		Circle circle = new Circle();
		Diamond diamond = new Diamond();
		rect.draw();
		circle.draw();
		diamond.draw();
	}
}
// Creating an abstract class Shape
abstract class Shape
{
	public abstract void draw();
}
// Extending class Shape by class Rect 
class Rect extends Shape
{
	public void draw()
	{
		System.out.println("Rectangle's drawn.");
		System.out.println("***********");
		System.out.println("*         *");
		System.out.println("*         *");
		System.out.println("*         *");
		System.out.println("***********\n");
	}
}
//Extending class Shape by class Circle
class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Circle's drawn.");
		System.out.println("     *     ");
		System.out.println(" *       * ");
		System.out.println("*         *");
		System.out.println(" *       * ");
		System.out.println("     *   \n");
	}
}
//Extending class Shape by class Diamond
class Diamond extends Shape
{
	public void draw()
	{
		System.out.println("Diamond's drawn.");
		System.out.println("   *****   ");
		System.out.println(" *       * ");
		System.out.println("*         *");
		System.out.println(" *       * ");
		System.out.println("   *   *   ");
		System.out.println("     *   \n");
	}
}
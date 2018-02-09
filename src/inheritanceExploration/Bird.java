package inheritanceExploration;

public class Bird
{
	public void fly()
	{
		System.out.println("The bird flies");
	}

	public void layEgg()
	{
		System.out.println("The bird layed an egg.");
	}

	public void doStuff()
	{
		System.out.println("Doing some stuff...");
		fly();
		layEgg();
	}
}


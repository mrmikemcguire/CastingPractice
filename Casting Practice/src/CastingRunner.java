public class CastingRunner
	{
	public static void main(String[] args)
		{
//		Vehicle x = new Car();
//		x.displaySpeed();
//		Vehicle x = new Bicycle();
//		((Bicycle)x).ringBell();
//		((Bicycle)x).displaySpeed();
		Vehicle x = new Car();
//		System.out.println(x.type);
		System.out.println(((Car)x).type);
		}
	}

public class CastingRunner
	{
	public static void main(String[] args)
		{
			
//		Vehicle x = new Vehicle();
//		x.displaySpeed();
//		x.doASuperClassSomething();
//		x.honkHorn();
		
//		Car x = new Car();
//		x.displaySpeed();
//		x.doASuperClassSomething();
//		x.honkHorn();
			
//		Vehicle x = new Car();
//		x.displaySpeed();
//		x.doASuperClassSomething();
//		x.honkHorn();

		Vehicle x = new Car();
		((Car) x).displaySpeed();
		((Car) x).doASuperClassSomething();
		((Car) x).honkHorn();
		
//		Vehicle x = new Car();
//		System.out.println(x.type);
			
//		Car x = new Car();
//		System.out.println(x.type);
		
//		Vehicle x = new Car();
//		System.out.println((Car)x).type);
		}
	}

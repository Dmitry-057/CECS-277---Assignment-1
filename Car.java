//Dmitry Merezhko	ID: 025-947-712
public class Car extends Vehicle 
{
	private int carMilesPerGallon;
	private Radio carRadio;
	private static final int fuelCost = 3; 
	
	public Car()
	{
		this("No name Car");
	}
	public Car(String name)
	{
		this(name,20);
	}
	public Car(String name, int mpg)
	{
		this(name, mpg, new Engine("Chevy","Gas"));
	}
	public Car(String name, int mpg, Engine eng)
	{
		super(name,eng);
		carMilesPerGallon = mpg;
		carRadio = new Radio();
		
	}
	public Car(Car c)
	{
		this(c.getName(),c.carMilesPerGallon,c.getEngine());
		
	}
	@Override
	public int getTripCost(int miles) {
		
		int tripCost = (miles / carMilesPerGallon) * fuelCost;
		return tripCost;
	}
	
	@Override
	public String toString() {
		return "Car: " + super.toString() + 
				", MPG = " + carMilesPerGallon + ", " + carRadio;
	}
	

	
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Car)) return false;
		else {
			Car c = (Car)other;
			return super.getName()==c.getName() && 
				   carMilesPerGallon == c.carMilesPerGallon;					
		}
	}
	
	public void setRadio(Radio r)
	{
		carRadio = r;
	}
}

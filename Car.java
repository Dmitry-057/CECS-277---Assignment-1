
public class Car extends Vehicle 
{
	//private String carName;
	private int carMilesPerGallon;
	//private Engine carEngine;
	private Radio carRadio;
	private static final int fuelCost = 3; 
	
	public Car()
	{
		/*Name = "No name Car";
		carMilesPerGallon = 15;
		carEngine = new Engine("Chevy"); */
		
		this("No name Car");
	}
	public Car(String name)
	{
		/*carName = car;
		carMilesPerGallon = 15;
		carEngine = new Engine("Chevy");
		carRadio = new Radio(); */
		
		this(name,20);
	}
	public Car(String name, int mpg)
	{
		/*carName = car;
		carMilesPerGallon = mpg;
		carEngine = new Engine("Chevy");
		carRadio = new Radio();*/
		
		this(name, mpg, new Engine("Chevy","Gas"));
	}
	public Car(String name, int mpg, Engine eng)
	{
		/*carName= car;
		carMilesPerGallon = mpg;
		carEngine = new Engine(eng);
		carRadio = new Radio();*/
		
		super(name,eng);
		carMilesPerGallon = mpg;
		carRadio = new Radio();
		
	}
	public Car(Car c)
	{
		/*carName= c.carName;
		carMilesPerGallon = c.carMilesPerGallon;
		carEngine = c.carEngine;
		carRadio = c.carRadio; */
		
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
	
	public void setRadio(Radio r)
	{
		carRadio = r;
	}
}

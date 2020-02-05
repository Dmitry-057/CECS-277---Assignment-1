
public class Car extends Vehicle 
{
	private String carName;
	private int carMilesPerGallon;
	private Engine carEngine;
	private Radio carRadio;
	private static final int fuelCost = 3; 
	
	public Car()
	{
		carName = "No name Car";
		carMilesPerGallon = 15;
		carEngine = new Engine("Chevy");
	}
	public Car(String car)
	{
		carName = car;
		carMilesPerGallon = 15;
		carEngine = new Engine("Chevy");
		carRadio = new Radio();
	}
	public Car(String car, int mpg)
	{
		carName = car;
		carMilesPerGallon = mpg;
		carEngine = new Engine("Chevy");
		carRadio = new Radio();
	}
	public Car(String car, int mpg, Engine eng)
	{
		carName= car;
		carMilesPerGallon = mpg;
		carEngine = new Engine(eng);
		carRadio = new Radio();
	}
	public Car(Car c)
	{
		carName= c.carName;
		carMilesPerGallon = c.carMilesPerGallon;
		carEngine = c.carEngine;
		carRadio = c.carRadio;
		
	}
	@Override
	public int getTripCost(int miles) {
		
		int tripCost = (miles / carMilesPerGallon) * fuelCost;
		return tripCost;
	}
	public void setRadio(Radio r)
	{
		carRadio = r;
	}
}

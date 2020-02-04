
public class Car extends Vehicle 
{
	private String carName;
	private double carMilesPerHour;
	private Engine carEngine;
	private Radio carRadio;
	private static final int fuelCost = 3; 
	
	public Car()
	{
		carName = "No name Car";
		carMilesPerHour = 500;
		carEngine = new Engine("Chevy");
	}
	public Car(String car)
	{
		carName = car;
		carMilesPerHour = 0;
		carEngine = new Engine("Chevy");
		carRadio = new Radio();
	}
	public Car(String car, double MPH)
	{
		carName = car;
		carMilesPerHour = MPH;
		carEngine = new Engine("Chevy");
		carRadio = new Radio();
	}
	public Car(String car, double MPH, Engine eng)
	{
		carName= car;
		carMilesPerHour = MPH;
		carEngine = new Engine(eng);
		carRadio = new Radio();
	}
	public Car(Car c)
	{
		carName= c.carName;
		carMilesPerHour = c.carMilesPerHour;
		carEngine = c.carEngine;
		carRadio = c.carRadio;
		
	}
	@Override
	public int getTripCost(int miles) {
		
		int tripCost = miles * fuelCost;
		return tripCost;
	}
	public void setRadio(Radio r)
	{
		carRadio = r;
	}
}

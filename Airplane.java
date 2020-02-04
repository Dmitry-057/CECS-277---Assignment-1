
public class Airplane extends Vehicle {
	public Airplane() {
		this("No Name Airplane");
	}
	public Airplane(String name) {
		this(name,500);
	}
	public Airplane(String name, int costPerHour) {
		this(name, costPerHour, new Engine());
	}
	public Airplane(String name, int costPerHour, Engine engine) {
		super(name, engine);
		mCostPerHour = costPerHour;
		mEngine = new Engine(engine);
		
	}
	public Airplane(Airplane a) {
		this("Copy of " + a.getName(), a.getCostPerHour(), 
				new Engine(a.getEngine()));
	}
	@Override
	public int getTripCost(int numOfMiles) {
		return numOfMiles;
	}
	@Override
	public String toString() {
		return "Airplane: Name = " + super.getName() + ", " + mEngine +
				", Cost per hour = " + mCostPerHour;
	}
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Airplane)) return false;
		else {
			Airplane a = (Airplane)other;
			return mEngine.equals(a.mEngine) && mCostPerHour == a.mCostPerHour;					
		}
	}
	public int getCostPerHour() {
		return mCostPerHour;
	}
	public Engine getEngine() {
		return mEngine;
	}
	
	private int mCostPerHour;
	private Engine mEngine;
	
	private static final int speed = 500;
}


public class Airplane extends Vehicle {
	public Airplane() {
		this("No Name Airplane");
	}
	public Airplane(String name) {
		this(name,500);
	}
	public Airplane(String name, int costPerHour) {
		this(name, costPerHour, new Engine("PrattAndWhitney","Kerosene"));
	}
	public Airplane(String name, int costPerHour, Engine engine) {
		super(name, engine);
		mCostPerHour = costPerHour;
		
	}
	public Airplane(Airplane a) {
		this( a.getName(), a.mCostPerHour, 
				new Engine(a.getEngine()));
	}
	@Override
	public int getTripCost(int numOfMiles) {
		return numOfMiles/speed*mCostPerHour;
	}
	@Override
	public String toString() {
		return "Airplane: " + super.toString() + 
				", Cost per hour = " + mCostPerHour;
	}
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Airplane)) return false;
		else {
			Airplane a = (Airplane)other;
			return super.getName()==a.getName() && 
				   super.getEngine().equals(a.getEngine()) && 
				   mCostPerHour == a.mCostPerHour;					
		}
	}
	private int mCostPerHour;
	
	private static final int speed = 500;
}

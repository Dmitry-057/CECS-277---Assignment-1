
public class Engine 
{
	public Engine() {
		this("PrattAndWhitney", "Gas");
	}
	public Engine(String maker) {
		this(maker, "Gas");
	}
	public Engine(String input_maker, String input_fuel) {
		maker = input_maker;
		fuel = input_fuel;
	}
	public Engine(Engine e) {
		this(e.maker,e.fuel);
	}
	
	public String toString() {
		return "Maker = " + maker + ", Fuel = " + fuel;
	}
	
	public boolean equals(Object other) {
		if(!(other instanceof Engine)) return false;
		else {
			Engine e = (Engine)other;
			return maker == e.maker && fuel == e.fuel;
		}
	}
	private String maker;
	private String fuel;
	
}


public class HealthyBurger extends HamBurger {
	
	 private String lettuce;

	public HealthyBurger(String breadType, String patty, boolean ranch) {
		super(breadType, patty, ranch);
		this.lettuce = "Iceberg";//only can order Iceberg
		}
	
	public HealthyBurger(String breadType, String patty, boolean ranch,String lettuce) {
		super(breadType, patty, ranch);
		this.lettuce = lettuce;// Iceberg is included in lettuce
 
}
	public String toString() {
		return "HamBurger [breadType=" + breadType + ", patty=" + patty
				 + ", ranch=" + ranch + "]";
}
}


public class CheeseBurger extends HamBurger {
	private String cheeseType;

	public CheeseBurger(String breadType, String patty,
			boolean ranch,String cheese) {
		super(breadType, patty,ranch);
		this.cheeseType = cheeseType;
		
			}


	public String toString() {
		return "HamBurger [breadType=" + breadType + ", patty=" + patty
				 + ", ranch=" + ranch + "]";

	
	}

		}

	
	
	


/* This program was to learn inheritance and subclasses
 *Date: 8/16/18
 */

public class HamBurger {
    protected String breadType;
    protected String patty;
    private boolean mayo;//Customer wants mayo on top?
    boolean ranch; //Customer wants ranch on top?
    
    
	public HamBurger(String breadType, String patty, boolean mayo, boolean ranch) {
		super();
		this.breadType = breadType;
		this.patty = patty;
		this.mayo = mayo;
		this.ranch = ranch;
	}


	public HamBurger(String breadType, String patty, boolean ranch) {
		super();
		this.breadType = breadType;
		this.patty = patty;
		this.ranch = ranch;
	}


	public String toString() {
		return "HamBurger [breadType=" + breadType + ", patty=" + patty
				+ ", mayo=" + mayo + ", ranch=" + ranch + "]";
	}
	
	
}


public class DeluxeBurger extends HamBurger{
	
		private String soda;
		private String chips;

		public DeluxeBurger(String breadType, String patty,
				boolean ranch,String soda,String chips) {
			super(breadType, patty,ranch);
			this.soda = soda;
			this.chips = chips;
			
			
}

		public String toString() {
			return "DeluxeBurger [soda=" + soda + ", chips=" + chips + "]";
		}
}

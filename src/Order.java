import java.util.Scanner;;

public class Order {
	

	static final String menu = "What do you want to have? \n1. HamBurger 2.CheeseBurger 3.HealthyBurger 4.DeluxeBurger";
	static final String questionBread = "What kind of bread";
	static final String questionPatty = "What kind of patty";
	static final String questionMayo = "Do you want mayo on top?";
	static final String questionRanch = "Do you want ranch on top?";
	static final String questionCheese = "What kind of cheese do you want?";
	static final String questionLettuce = "What kind of lettuce do you want?";
	static final String questionSoda = "What kind of soda do you want?";
	static final String questionChips = "What kind of chips do you want?";
	
	//Building a counter
	public static void main(String[] args) {
	//Declaring burger here
		HamBurger hb;
	//Taking customer's order
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println(Order.menu);
		int Order = keyboard.nextInt();
	
			System.out.println(questionBread);
			String bread = keyboard.next();
			System.out.println(questionPatty);
			String patty = keyboard.next();
			System.out.println(questionRanch);
			boolean ranch = keyboard.nextBoolean();
		
			if (Order ==1){
				System.out.println(questionMayo);
				boolean mayo =keyboard.nextBoolean();
				//public HamBurger(String breadType, String patty, boolean mayo, boolean ranch)
				hb = new HamBurger(bread,patty,mayo,ranch);
				
				
			}
			else if(Order ==2){
				System.out.println(questionCheese);
				String cheese = keyboard.next();
				//public CheeseBurger(String breadType, String patty,boolean ranch,String cheese)
				hb = new CheeseBurger (bread,patty,ranch,cheese);
			
			}	
			else if(Order ==3){
				System.out.println(questionLettuce);
				String lettuce = keyboard.next();
				//public HealthyBurger(String breadType, String patty,boolean ranch,String lettuce)
				hb = new HealthyBurger (bread,patty,ranch,lettuce);
				
			}
			else if(Order ==4){
					System.out.println(questionSoda+questionChips);
					String chips = keyboard.next();
					String soda = chips;
					//public DeluxeBurger(String breadType, String patty,boolean ranch,String soda,String chips)
					hb = new DeluxeBurger (bread,patty,ranch,soda,chips);
			}
			else{
				hb = null;
				
			}
			System.out.println("Here is your order \n" + hb);
				
		//Customer wants to buy a cheese burger
		//CheeseBurger(String breadType, String patty,boolean ranch,String cheeseType) 
//		CheeseBurger naresh = new CheeseBurger("Italian","Chicken",true,"Swiss");
//		System.out.println("Hey! Here's your order:");
//		System.out.println(naresh);
		 

}
	}

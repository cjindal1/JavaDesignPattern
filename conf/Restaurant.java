package designConf.conf;


/**
 * @author Chetan_jindal
 *
 */
public class Restaurant {
	

	private Interface_Calculate_cost_time_co2 calc = new Cost_Time_Co2();
	
	
	private String restaurant_name;
	private double Carbon_footprint, Dinr_time;
	private int dinner_cost;
	
	
	/**
	 * @param Restaurant_name
	 */
	public Restaurant(String Restaurant_name) {

		
		try {
			this.restaurant_name=Restaurant_name;
			
			if(restaurant_name.equals("PS Restaurant"))
			{
				Carbon_footprint = calc.Calculate_Carbon_FootPrint(0.01);
				Dinr_time = calc.Calculate_time(35);
				dinner_cost = calc.calculate_Cost(50);
			}
			else
				if(restaurant_name.equals("Number 5 Restaurant"))
				{
					Carbon_footprint = calc.Calculate_Carbon_FootPrint(0.02);
					Dinr_time = calc.Calculate_time(40);
					dinner_cost = calc.calculate_Cost(40);
				}
				else
					if(restaurant_name.equals("Lemongrass Restaurant"))
				{
						Carbon_footprint= calc.Calculate_Carbon_FootPrint(0.03);
						Dinr_time = calc.Calculate_time(50);
						dinner_cost = calc.calculate_Cost(35);
				}
			
		} catch (Exception e) {
			System.err.println("Unable to proceed. Please check the inputs provided.");
			System.exit(0);
		}			
	}
	
	

	public void display_attendee_choice()
	{	
		
		try {

			System.out.println(toString("\n\nConference - Closing Event - Dinner\n"));
			System.out.println(toString("Restaurant to be visited: " + restaurant_name));
			System.out.println(toString("Dinner cost is: $" + dinner_cost + "\nTime taken for dinner : " + Dinr_time + " mins" + "\nCarbon Footprint is: " + Carbon_footprint + " tonns"));
			
		}catch (Exception e) {
			System.err.println("Could not print the required output. Check the inputs again.");
			System.exit(0);
		}
	}

	
	

	/**
	 * @param printVal
	 * @return
	 */
	public String toString(String printVal){

			return printVal;
		}


}


package designConf.conf;

/**
 * @author Chetan_jindal
 *
 */
public class Registration {
	

	private Interface_Calculate_cost_time_co2 calc = new Cost_Time_Co2();
	
	private int registration_cost, registration_no;
	private String name, card_type;
	
	
	/**
	 * @param name
	 * @param registration_no
	 * @param card_type
	 */
	
	public Registration(String name, int registration_no, String card_type) {
		
		try {
			
			this.name=name;
			this.registration_no=registration_no;
			this.card_type=card_type;
			calculate_cost();
		
		} catch (Exception e) {
			System.err.println("Could not read the required value. Please enter again.");
			System.exit(0);
		}
	}

	
	
	public void calculate_cost()
		{
		
		try {
			if(card_type.equals("BU Alumni Platinum Visa Credit card"))
			{	
				registration_cost=calc.calculate_Cost(9);
			}		
			else 
			{	
				registration_cost= calc.calculate_Cost(10);
			}
						
		} catch (Exception e) {
			System.err.println("Unable to proceed. Please check the inputs provided.");
			System.exit(0);
		}
	}
	

	
	public void display_attendee_choice()
	{	

		try {
			
			System.out.println(toString("\nConference - First Event - Registration\n"));
			System.out.println(toString("Original registration fees is $10"));
			System.out.println(toString("Name is " + name + "\nRegistration number is " + registration_no + "\nCredit Card Type is " + card_type + "\nFee is $" + registration_cost));
			
			
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




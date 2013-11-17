package designConf.conf;


/**
 * @author Chetan_jindal
 *
 */
public class Presentation {
	

	private Interface_Calculate_cost_time_co2 calc = new Cost_Time_Co2();
	
	
	private String presentation_detail;
	private double Carbon_footprint;
	
	
	/**
	 * @param presentation
	 */
	public Presentation(String presentation) {
		
				
		try {
			this.presentation_detail=presentation;
			
			if(presentation_detail.equals("Presentation A"))
			{
				Carbon_footprint= calc.Calculate_Carbon_FootPrint(0.01);
			}
			else
				if(presentation_detail.equals("Presentation B"))
				{
					Carbon_footprint= calc.Calculate_Carbon_FootPrint(0.02);
				}
				else
					if(presentation_detail.equals("Presentation C"))
				{
						Carbon_footprint= calc.Calculate_Carbon_FootPrint(0.03);
				}
		} catch (Exception e) {
			System.err.println("Unable to proceed. Please check the inputs provided.");
			System.exit(0);
		}			
	}
	
	

	public void display_attendee_choice()
	{	
		
		try {

			System.out.println(toString("\n\nConference - Third Event - Presentation\n"));
			System.out.println(toString("Presentation to be attended: " + presentation_detail));
			System.out.println(toString("Carbon Footprint is: " + Carbon_footprint + " tonns")); 
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

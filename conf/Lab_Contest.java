package designConf.conf;


/**
 * @author Chetan_jindal
 *
 */
public class Lab_Contest {
	
	private Interface_Calculate_cost_time_co2 calc = new Cost_Time_Co2();
	
	
	private String lab_name, mode_transport;
	private double Carbon_footprint_lab,  Carbon_footprint_transport, total_carbFootprint;
	private double contest_time;
	
	
	/**
	 * @param lab_name
	 * @param mode_transport
	 */
	public Lab_Contest(String lab_name, String mode_transport) {
		

		try {
			this.lab_name=lab_name;
			this.mode_transport=mode_transport;
			
			Carbon_footprint_transport = footprint_transposrt(mode_transport);
			
			if(lab_name.equals("Lab A"))
			{
				Carbon_footprint_lab= calc.Calculate_Carbon_FootPrint(0.01);
				contest_time = calc.Calculate_time(30);			
			}
			else
				if(lab_name.equals("Lab B"))
				{
					Carbon_footprint_lab = calc.Calculate_Carbon_FootPrint(0.02);
					contest_time = calc.Calculate_time(40);				
				}
				else
					if(lab_name.equals("Lab C"))
				{
					Carbon_footprint_lab = calc.Calculate_Carbon_FootPrint(0.03);
					contest_time = calc.Calculate_time(45);				
				}
		} catch (Exception e) {
			System.err.println("Unable to proceed. Please check the inputs provided.");
			System.exit(0);
		}			
		
		total_carbFootprint = Carbon_footprint_lab + Carbon_footprint_transport;
	}
	
	
	
	/**
	 * @param mode_transport
	 * @return
	 */
	public double footprint_transposrt(String mode_transport)
	{
		try {
			if(mode_transport.equals("Campus-Bus"))
				{
				Carbon_footprint_transport = calc.Calculate_Carbon_FootPrint(0.05);
				}
			else
				if(mode_transport.equals("Campus-Bus"))
				{
					Carbon_footprint_transport = calc.Calculate_Carbon_FootPrint(0.04);
				}
			else
				if(mode_transport.equals("Campus-Bus"))
				{
					Carbon_footprint_transport = calc.Calculate_Carbon_FootPrint(0.02);
				}
			else
				if(mode_transport.equals("Campus-Bus"))
				{
					Carbon_footprint_transport = calc.Calculate_Carbon_FootPrint(0.03);
				}
		} catch (Exception e) {
			System.err.println("Unable to proceed. Please check the inputs provided.");
			System.exit(0);
		}
		return Carbon_footprint_transport;
	}
	
	
	

	public void display_attendee_choice()
	{	
		
		try {
			
			System.out.println(toString("\n\nConference - Second Event - Lab Contest\n"));
			System.out.println(toString("Lab to be visited: " + lab_name));
			System.out.println(toString("Mode of transport to be taken is: " + mode_transport));
			System.out.println(toString("Contest time is : " + contest_time + " mins" + "\nCarbon Footprint based on energy star certified computers is : " + Carbon_footprint_lab + " tonns" + "\nCarbon Footprint based on mode of transportation to " + lab_name + " is: "+ Carbon_footprint_transport + " tonns" + "\nTotal Carbon Footprint is: " + total_carbFootprint + " tonns"));
			
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

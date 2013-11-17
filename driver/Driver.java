
package designConf.driver;

import designConf.conf.Conference_builder;
import designConf.conf.DPConference;
import designConf.conf.Interface_AttendeeData;
import designConf.conf.AttendeeData;
import designConf.conf.Interface_Builder_Conference;
import designConf.conf.Interface_workshop_Conference;


		
/**
 * @author Chetan_jindal
 *
 */
public class Driver
{
	

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		try {

				Interface_AttendeeData attendeeDetails = new AttendeeData("John Walker",101,"BU Alumni Platinum Visa Credit card","Lab C","Presentation B","Number 5 Restaurant","Campus-Bus"); 			
				Interface_Builder_Conference details = new DPConference(attendeeDetails);		
				Interface_workshop_Conference conf = new Conference_builder();
				conf.construct_conference(details);
				
				
			} catch (Exception e) {
				System.err.println("Not all inputs are provided");
				System.exit(0);
			}
	}

}
				
		

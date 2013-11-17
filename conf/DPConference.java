
package designConf.conf;


/**
 * @author Chetan_jindal
 * Get and Set methods for attendees' choices and methods for contruction of the conference.
 */
public class DPConference implements Interface_Builder_Conference
{		
	
	private Interface_AttendeeData attendeeDetails;
	
	
	/**
	 * @param attendeeDetails
	 */
	public DPConference(Interface_AttendeeData attendeeDetails){
		this.attendeeDetails = attendeeDetails;
		System.out.println("Welcome to the conference.\nStarting registration process..");
	}


	public void registration() {
		
		try {
			
			Registration register = new Registration(attendeeDetails.getName(),attendeeDetails.getRegistration_no(), attendeeDetails.getCard_type());			
			register.display_attendee_choice();
		
		} catch (Exception e) {
			System.err.println("Unable to register. Please check inputs provided.");
			System.exit(0);
		}
	}
	
	
	/**
	 * @param lab_name
	 * @param mode_transport
	 */
		public void lab_contest() {
		
		try {
			Lab_Contest lab_const= new Lab_Contest(attendeeDetails.getLab_contest(), attendeeDetails.getTransport());
			lab_const.display_attendee_choice();
		
		} catch (Exception e) {
			System.err.println("Unable to proceed further. Please check inputs provided.");
			System.exit(0);
		}
	}
	
	

	/* (non-Javadoc)
	 * @see designConf.conf.Interface_Builder_Conference#presentation()
	 */
	public void presentation() {	
		try {
			Presentation prsntatn = new Presentation(attendeeDetails.getPresentation());	
			prsntatn.display_attendee_choice();
		} catch (Exception e) {
			System.err.println("Unable to proceed further. Please check inputs provided.");
			System.exit(0);
		}
	}
	 
	
	

	/* (non-Javadoc)
	 * @see designConf.conf.Interface_Builder_Conference#restaurant()
	 */
	public void restaurant() {
		
		try {
			Restaurant rstaurnt = new Restaurant(attendeeDetails.getRestaurant_name());
			rstaurnt.display_attendee_choice();
		
		} catch (Exception e) {
			System.err.println("Unable to proceed further. Please check inputs provided.");
			System.exit(0);
		}

	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
 		
		return "";
	}

	
}




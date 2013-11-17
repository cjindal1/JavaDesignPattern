package designConf.conf;


/**
 * @author Chetan_jindal
 * Phases of conference called from this class which implements I_Conference_builder
 */
public class Conference_builder implements Interface_workshop_Conference
{

	/* (non-Javadoc)
	 * @see designConf.conf.Interface_workshop_Conference#construct_conference(designConf.conf.Interface_Builder_Conference)
	 */
	public void construct_conference(Interface_Builder_Conference details) {
		try {
			details.registration();
			details.lab_contest();
			details.presentation();
			details.restaurant();
		} catch (Exception e) {
			System.err.println("Unable to build conference as call to the methods failed.");
			System.exit(0);
		}
	}

	
	public String toString(){
 		
		return "";
	}


}	

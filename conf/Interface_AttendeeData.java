

package designConf.conf;


/**
 * @author Chetan_jindal
 *
 */
public interface Interface_AttendeeData{

	public String getCard_type();

	public void setCard_type(String card_type);

	public String getName();
	
	public void setName(String name);

	public int getRegistration_no();

	public void setRegistration_no(int registration_no);
	
	public String getLab_contest();

	public void setLab_contest(String lab_name);
	
	public String getPresentation();
	
	public void setPresentation(String presentation);
	
	public String getRestaurant_name();
	
	public void setRestaurant_name(String rest_name);
	
	public String getTransport() ;
	
	public void setTransport(String transport);
	
	public String toString();
	

}



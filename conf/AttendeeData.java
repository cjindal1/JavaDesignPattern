
package designConf.conf;


/**
 * @author Chetan_jindal
 *
 */
public class AttendeeData implements Interface_AttendeeData{


	private String name, card_type, lab_name, presentation, rest_name, transport;
	private int registration_no;
	
	
	
	/**
	 * @param A_name
	 * @param A_RegNo
	 * @param A_CardType
	 * @param A_Lab
	 * @param A_Presen
	 * @param A_Rest
	 * @param A_Transport
	 */
	public AttendeeData(String A_name, int A_RegNo, String A_CardType, String A_Lab,
			String A_Presen, String A_Rest, String A_Transport) {

		setName(A_name); 
		setRegistration_no(A_RegNo);
		setCard_type(A_CardType);
		setLab_contest(A_Lab);
		setPresentation(A_Presen);
		setRestaurant_name(A_Rest);
		setTransport(A_Transport);
		
	}
	

	/**
	 * @return Get and Set methods for Attendee choices
	 */
	public String getCard_type() {
		return card_type;
	}

	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegistration_no() {
		return registration_no;
	}

	public void setRegistration_no(int registration_no) {
		this.registration_no = registration_no;
	}
	
	public String getLab_contest() {
		return lab_name;
	}

	public void setLab_contest(String lab_name) {
		this.lab_name=lab_name;
	}
	
	public String getPresentation() {
		return presentation;
	}
	
	public void setPresentation(String presentation) {
		this.presentation=presentation;
	}
	
	public String getRestaurant_name() {
		return rest_name;
	}
	
	public void setRestaurant_name(String rest_name) {
		this.rest_name=rest_name;
	}
	
	public String getTransport() {
		return transport;
	}
	
	public void setTransport(String transport) {
		this.transport=transport;
	}
	


/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
public String toString(){
	 		
		return "";
	}


}

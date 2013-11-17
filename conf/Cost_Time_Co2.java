package designConf.conf;

/**
 * @author Chetan_jindal 
 * To calculate Cost, Time and Carbon Footprint. Implements I_cost_time_co2.
 */
public class Cost_Time_Co2 implements Interface_Calculate_cost_time_co2{

	

	/* (non-Javadoc)
	 * @see designConf.conf.Interface_Calculate_cost_time_co2#calculate_Cost(int)
	 */
	@Override
	public int calculate_Cost(int cost) {	
		return cost;
	}

	
	/* (non-Javadoc)
	 * @see designConf.conf.Interface_Calculate_cost_time_co2#Calculate_time(double)
	 */
	@Override
	public double Calculate_time(double time) {		
		return time;
	}
	

	
	/* (non-Javadoc)
	 * @see designConf.conf.Interface_Calculate_cost_time_co2#Calculate_Carbon_FootPrint(double)
	 */
	@Override
	public double Calculate_Carbon_FootPrint(double Carbon_footprint) {
	
		return Carbon_footprint;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
 		
		return "";
	}


}

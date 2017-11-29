/**
 * This class "Customer" holds the name, number, and plan information for the
 * customer.
 * 
 * @author Meghan Cowan
 *
 */
public class Customer {
	private String name;
	private String telephone;
	private double planPrice;
	private double extraMin = .35;
	private int peakMinutes = 100;
	private int offPeakMinutes = 300;
	private int peakMinUsed;
	private int offPeakUsed;


	/**
	 * Creates a Constructor using name, telephone number, plan price, extra
	 * minutes rate, peak minutes included, off peak minutes included, peak
	 * minutes used and off peak minutes used.
	 * 
	 * @param name - initializes customer name
	 * @param telephone - initializes customer phone number
	 * @param planPrice - initializes customer plan price
	 * @param extraMin - initializes the price for extra minutes
	 * @param peakMinutes - initializes the peak minutes included
	 * @param offPeakMinutes - initializes off peak minutes included
	 * @param peakMinUsed - initializes peak minutes used
	 * @param offPeakUsed - initializes off peak minutes used.
	 */
	public Customer(String name, String telephone, double planPrice,
			double extraMin, int peakMinutes, int offPeakMinutes,
			int peakMinUsed, int offPeakUsed) {
		super();
		this.name = name;
		this.telephone = telephone;
		this.planPrice = planPrice;
		this.extraMin = extraMin;
		this.peakMinutes = peakMinutes;
		this.offPeakMinutes = offPeakMinutes;
		this.peakMinUsed = peakMinUsed;
		this.offPeakUsed = offPeakUsed;
	}
/**
 * Method to return name.
 * @return name
 */
	public String getName() {
		return name;
	}
	/**
	 * Method to set name.
	 * @return name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Method to return telephone number.
	 * @return telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * Method to set telephone number.
	 * @return telephone
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * Method to return plan price.
	 * @return planPrice
	 */
	public double getPlanPrice() {
		return planPrice;
	}
	/**
	 * Method to set plan price
	 * @return planPrice
	 */
	public void setPlanPrice(double planPrice) {
		this.planPrice = planPrice;
	}
	/**
	 * Method to return peak minutes.
	 * @return peakMinutes
	 */
	public int getPeakMinutes() {
		return peakMinutes;
	}
	/**
	 * Method to set peak minutes
	 * @return peakMinutes
	 */
	public void setPeakMinutes(int peakMinutes) {
		this.peakMinutes = peakMinutes;
	}
	/**
	 * Method to return off peak minutes
	 * @return offPeakMinutes;
	 */
	public int getOffPeakMinutes() {
		return offPeakMinutes;
	}
	/**
	 * Method to set off peak minutes
	 * @return offPeakMinutes
	 */
	public void setOffPeakMinutes(int offPeakMinutes) {
		this.offPeakMinutes = offPeakMinutes;
	}
	/**
	 * Method to return extra minutes
	 * @return extraMin
	 */
	public double getExtraMin() {
		return extraMin;
	}
	/**
	 * Method to return peak minutes used
	 * @return peakMinUsed
	 */
	public int getPeakMinUsed() {
		return peakMinUsed;
	}
	/**
	 * Method to return off peak minutes used
	 * @return offPeakUsed
	 */
	public int getOffPeakUsed() {
		return offPeakUsed;
	}
}



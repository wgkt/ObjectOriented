
public class Customer {
	

	private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    /**
     * Holds Name and address of Customer
     * @param name - name of customer
     * @param street - House number and Street of customer
     * @param city - City of customer
     * @param state - State of customer
     * @param zip - Zip code of customer
     */
    public Customer(String name, String street, String city, String state, String zip) {
    	this.name = name;
    	this.street = street;
    	this.state = state;
    	this.city = city;
    	this.zip = zip;
    }
    /**
     * 
     * @param name Sets name of customer
     */
    public void setName(String name) {
    	this.name = name;
    }
    /**
     * 
     * @return Returns name
     */
    public String getName() {
    	return name;
    }
    /**
     * 
     * @param street - sets street of customer
     */
    public void setStreet(String street) {
    	this.street = street;
    }
    /**
     * 
     * @return - Returns street name
     */
    public String getStreet() {
    	return street;
    }
    /**
     * 
     * @param city - Sets city of customer
     */
    public void setCity(String city) {
    	this.city = city;
    }
    /**
     * 
     * @return - returns city of customer
     */
    public String getCity() {
    	return city;
    }
    /**
     * 
     * @param state - sets state of customer
     */
    public void setState(String state) {
    	this.state = state;
    }
    /**
     * 
     * @return - returns state of customer
     */
    public String getState() {
    	return state;
    }
    /**
     * 
     * @param zip - sets zip code of customer
     */
    public void  setZip(String zip) {
    	this.zip = zip;
    }
    /**
     * 
     * @return - returns zip code of customer
     */
    public String getZip() {
    	return zip;
    }
    /**
     * Prints customer name and address
     */
    public void printCustomer() {
    	System.out.printf("To: %14s \n %21s \n %18s, %s  %s\n", getName(), getStreet(), getCity(), getState(), getZip());
    }

}

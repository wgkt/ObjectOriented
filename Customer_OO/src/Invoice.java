import java.util.Date;

public class Invoice {
	
	private Date date = new Date();
	int days;
	static double taxRate = .06;
	Customer customer;
	Video video;

	
	/**
	 * Creates invoice with customer and video info, the price before and after tax as well as the date.
	 * @param customer - customer name and address
	 * @param video - video information
	 * @param date - date of invoice
	 * @param days - days the video has been rented
	 */
    public Invoice(Customer customer, Video video, Date date, int days){
    	this.customer = customer; 
    	this.video = video;
    	this.date = date;
    	this.days = days;
    }
    /**
     * 
     * @return - returns the subtotal (price before tax)
     */

    public double getSubtotal() {
    	return days * video.getRate();
   }
    
    /**
     * 
     * @return - returns the amount of tax to be added
     */
    public double getTax() {
    	return getSubtotal() * .06;
    }
    /**
     * 
     * @return - returns total including tax
     */
    public double getTotal() {
    	return getTax() + getSubtotal();
    }
    /**
     * prints the date as well as customer and video information
     */
    public void printInvoice(){
    	System.out.println("\nINVOICE\n");
    	System.out.printf("Date: %tm/%td/%tY\n\n", date, date, date);
    	System.out.printf("To: \n %s\n %s\n %s, %s \n %s\n\n", customer.getName(), customer.getStreet(), customer.getCity(), customer.getState(), customer.getZip());
    	System.out.printf("%s (%s) \nCopy Number %s at $%5.2f a day\nDays rented: %d\n", video.getVideo(), video.getYear(), video.getCopyNo(), video.getRate(), days);
    	System.out.printf("Subtotal: $%5.2f \n", getSubtotal());
    	System.out.printf("Tax:      $%5.2f \n", getTax());
    	System.out.printf("Total:    $%5.2f \n", getTotal());
    }
    
    
	
  
    }
    
    
	
	
	


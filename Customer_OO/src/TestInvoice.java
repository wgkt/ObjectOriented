import java.util.Date;


public class TestInvoice {
	
	public static void main (String[] args) {
	/**
	 * Prints Invoice containing the information of customer1, their video, and the price.
	 */
	Customer customer1 = new Customer("John Green", "99 Main St", "Pittsburgh", "PA", "15000");
	Video video1 = new Video("Matrix", 1989, 3, 1.99);
	Date date = new Date(2015 - 1900, 9-1,7);
	Invoice invoice = new Invoice(customer1, video1, date, 3);

	invoice.printInvoice();
	
	/**
	 * Prints Invoice containing the information of customer2, their video, and the price.
	 */
	
	Customer customer2 = new Customer("Max Logan", "152 Berry Ln", "Cranberry", "WV", "15860");
	Video video2 = new Video("Fight Club", 1993, 8, 2.10);
	Date date2 = new Date(2015 - 1900, 9-1,5);
	Invoice invoice2 = new Invoice(customer2, video2, date2, 5);
	
	invoice2.printInvoice();
	
	
	/**
	 * Prints Invoice containing the information of customer3, their video, and the price.
	 */
	Customer customer3 = new Customer("Jamie Smith", "616 Warwick Rd", "Charlotte", "NC", "18605");
	Video video3 = new Video("Eternal Sunshine of a Spotless Mind", 1998, 4, 2.05);
	Date date3 = new Date(2015 - 1900, 9-1,4);
	Invoice invoice3 = new Invoice(customer3, video3, date3, 6);
	
	invoice3.printInvoice();
	}
}

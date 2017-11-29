import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Prints an invoice containing customer and Call Log information
 * @author Meghan Cowan
 *
 */
public class TestInvoice {
	public static void main(String[] args) {
		
		Customer customer = new Customer("Bill Jones", "800-555-8594", 45.00, .35, 100, 300, 153, 223);
		
        Invoice invoice = new Invoice(customer);
        
        invoice.addCallLog(new CallLog(new Date(2007-1900, 8, 12, 17, 8, 11), "809-324-8278", 65));
        invoice.addCallLog(new CallLog(new Date(2007-1900, 8, 12, 18, 21, 11), "809-324-3435", 20));
        invoice.addCallLog(new CallLog(new Date(2007-1900, 8, 13, 12, 20, 10), "809-324-8287", 75));
        invoice.addCallLog(new CallLog(new Date(2007-1900, 8, 14, 13, 21, 11), "809-324-8278", 13));
        invoice.addCallLog(new CallLog(new Date(2007-1900, 8, 12, 18, 21, 11), "809-324-3435", 203));
        
        invoice.printInvoice();

		System.out.println();
        
        Customer customer2 = new Customer("Sam Thompson", "865-495-2615", 45.00, .35, 100, 300, 56, 305);
		
        Invoice invoice2 = new Invoice(customer2);
        
        invoice2.addCallLog(new CallLog(new Date(2007-1900, 5, 18, 11, 6, 12), "508-564-2341", 46));
        invoice2.addCallLog(new CallLog(new Date(2007-1900, 5, 10, 4, 30, 48), "508-567-2648", 5));
        invoice2.addCallLog(new CallLog(new Date(2007-1900, 5, 12, 8, 32, 24), "508-967-3598", 58));
        invoice2.addCallLog(new CallLog(new Date(2007-1900, 5, 15, 13, 7, 13), "508-861-3679", 49));
        invoice2.addCallLog(new CallLog(new Date(2007-1900, 5, 21, 20, 53, 6), "508-946-3354", 152));
        
        invoice2.printInvoice();
        
        System.out.println();
        
        Customer customer3 = new Customer("Adam Smith", "495-623-1589", 45.00, .35, 100, 300, 100, 258);
		
        Invoice invoice3 = new Invoice(customer3);
        
        invoice3.addCallLog(new CallLog(new Date(2007-1900, 2, 2, 8, 6, 13), "409-486-9536", 25));
        invoice3.addCallLog(new CallLog(new Date(2007-1900, 2, 4, 14, 51, 32), "409-589-1466", 15));
        invoice3.addCallLog(new CallLog(new Date(2007-1900, 2, 6, 2, 43, 23), "409-635-5864", 10));
        invoice3.addCallLog(new CallLog(new Date(2007-1900, 2, 8, 16, 24, 8), "409-487-2625", 16));
        invoice3.addCallLog(new CallLog(new Date(2007-1900, 2, 15, 12, 54, 21), "409-854-7825", 45));
        
        invoice3.printInvoice();
        
        
	}
	

}

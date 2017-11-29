import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * This class creates a printed invoice containing the customer information,
 * call log information, amount due on the bill, and 
 * whether the call was on or off peak.
 * @author Meghan Cowan
 *
 */
public class Invoice {
	private Customer customer;
	private CallLog[] callLogs = new CallLog[5];
	private int noCallLogs = 0;
	private CallLog callLog;
/**
 * Creates a constructor containing the customer information.
 * @param customer
 */
	public Invoice(Customer customer) {
		this.customer = customer;
	}
/**
 * gets Customer information
 * @return customer
 */
	public Customer getCustomer() {
		return customer;
	}
/**
 * adds a CallLog to the invoice.  Contains the information
 * given in CallLog constructor
 * @param callLog
 */
	public void addCallLog(CallLog callLog) {
		callLogs[noCallLogs++] = callLog;
	}
/**
 * gets the number of callLogs
 * @return noCallLogs
 */
	public int getNoCallLogs() {
		return noCallLogs;
	}
/**
 * gets the callLog itself
 * @param n
 * @return callLogs
 */
	public CallLog getCallLog(int n) {
		return callLogs[n];
	}
/**
 * gets the hours of the date
 * @param hour
 * @return hour
 */
	public int getHours(int hour) {
		return hour;
	}
	/**
	 * finds whether call was on or off peak
	 * @param hour
	 * @return result
	 */
	public static boolean findPeak (int hour) {
		boolean result;
		
		if (hour > 6  && hour < 18) {
	        result =  true;
		}
		else {result = false;}
		
		return result;
	}
	
	/**
	 * Finds the total amount due for the bill
	 * @return total
	 */
	
	
	public double getTotal() {
		double peakPrice;
		double offPeakPrice;
		double total;

		if (customer.getPeakMinUsed() < customer.getPeakMinutes()) {
			peakPrice = 0;
		} else {
			peakPrice = ((customer.getPeakMinUsed() - customer
					.getPeakMinutes()) * customer.getExtraMin());
		}

		if (customer.getOffPeakUsed() < customer.getOffPeakMinutes()) {
			offPeakPrice = 0;
		} else {
			offPeakPrice = (customer.getOffPeakUsed() - customer
					.getOffPeakMinutes()) * customer.getExtraMin();
		}

		total = peakPrice + offPeakPrice + customer.getPlanPrice();
		return total;
	}
/**
 * Method to print an invoice containing customer info, Call log information,
 * amount due, and whether it is off or on peak.
 */
	public void printInvoice() {
		System.out.print("CellsRUs");
		System.out.println("     Invoice");


		System.out.printf("Customer: %s \n", customer.getName());
		System.out.printf("Telephone: %s \n", customer.getTelephone());
		System.out.printf("Plan Price: $%5.2f \n", customer.getPlanPrice());
		System.out.printf("Rate for extra minutes: %3.2f \n",
				customer.getExtraMin());
		System.out.printf("Peak Minutes Included: %d \n",
				customer.getPeakMinutes());
		System.out.printf("Off-Peak Minutes Included: %d \n",
				customer.getOffPeakMinutes());
		System.out
				.printf("Peak Minutes Used: %d \n", customer.getPeakMinUsed());
		System.out.printf("Off Peak Minutes Used: %d \n\n",
				customer.getOffPeakUsed());

		System.out.printf("Amount Due: $%5.2f \n", getTotal());

		System.out
				.println("Call To/From    Date                          Minutes      Off-Peak ");
		for (int i = 0; i < getNoCallLogs(); i++) {
			CallLog callLog = getCallLog(i);
			System.out.printf("%s  ", callLog.getCaller());
			System.out.printf("%s", callLog.getDate());
			System.out.printf("        %d       ", callLog.getMinutes());
			
			System.out.printf(" %s \n", findPeak(i));


		}

	}

}

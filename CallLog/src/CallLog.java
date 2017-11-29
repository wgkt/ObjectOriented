import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * This class creates a call log holding information
 * including the date of the call, the phone number to/from the caller,
 * and how long it lasted.
 * @author Meghan Cowan
 *
 */
public class CallLog {
	private Date date = new Date();
    private String caller;
    private int minutes;
    
 /**
  * Creates a constructor holding the date, caller, and minutes.
  * @param date - date call was made
  * @param caller - the number that was received or dialed
  * @param minutes - amount of time spent on call
  */
	public CallLog(Date date, String caller, int minutes) {
		super();
		this.date = date;
		this.caller = caller;
		this.minutes = minutes;
	}
/**
 * method to get the date
 * @return date
 */


	public Date getDate() {
		return date;
	}

/**
 * method to get the caller
 * @return caller
 */
	

	public String getCaller() {
		return caller;
	}
/**
 * method to get the minutes
 * @return minutes
 */
	public int getMinutes() {
		return minutes;
	}
    
	
    
}

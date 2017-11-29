

public class Video {
	
	private String video;
	private int year;
	private int copyNo;
	private double rate;

	/**
	 * Information of the video rented
	 * @param video - Title of video
	 * @param year - Year of video
	 * @param copyNo - Copy of video
	 * @param rate - Daily rate
	 */
	public Video(String video, int year, int copyNo, double rate) {
		this.video = video;
		this.year = year;
		this.copyNo = copyNo;
		this.rate = rate;
	}
	/**
	 * 
	 * @return - returns video name
	 */
	public String getVideo() {
		return video;
	}
	/**
	 * 
	 * @return - returns year of video
	 */
	public int getYear() {
		return year;
	}
	/**
	 * 
	 * @return - returns video copy number
	 */
	public int getCopyNo() {
		return copyNo;
	}
	/**
	 * 
	 * @param rate - sets daily rate of video
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}
	/**
	 * 
	 * @return - returns daily rate of video
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * prints video information
	 */
	public void printVideo() {
		System.out.println("Renting: ");
		System.out.printf(" %13s (%d)", getVideo(), getYear());
		System.out.printf("copy %d ", getCopyNo());
		System.out.printf("at: $%.2f / day \n ", getRate());

	}
	

}

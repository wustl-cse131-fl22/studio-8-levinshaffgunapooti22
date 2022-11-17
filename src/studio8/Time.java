package studio8;


public class Time {
	private int hour;
	private int minute;
	private boolean is12;
	/**
	 * 
	 * @param hour
	 * @param minute
	 * @param format
	 */
	public Time(int hour, int minute, boolean is12) {
		this.hour = hour;
		this.minute = minute;
		this.is12 = is12;
	}
	public String toString() {
		if(is12 == false) {
			return hour+ ":" + minute;
		}else {
			if(hour>12) {
				return (hour-12) + ":" + minute;
			}else {
				return hour+ ":" + minute;
			}
			
		}
	}

	public static void main(String[] args) {
		Time a = new Time(1, 13, true);
		Time b = new Time(23, 14, true);
		Time c = new Time(1, 13, false);
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
 
    	
    }

}
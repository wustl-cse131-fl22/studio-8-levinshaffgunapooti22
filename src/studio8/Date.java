package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	
	private int month;
	private int day;
	private int year;
	private boolean isHoliday;
	/**
	 * 
	 * @param month
	 * @param day
	 * @param year
	 */
	public Date(int month, int day, int year, boolean holiday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}
	
	
	//made by Source Generate hashcode(), printed out in the last print statement in main method 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public String toString() {
		return month + "/" + day +"/" + year;
	}


    public static void main(String[] args) {
    	Date a = new Date(11,17,22, false);
    	Date b = new Date(11,17,22, false);
    	Date c = new Date(11,15,21, false);
    	Date d = new Date(12,4,23, false);
    	Date e = new Date(05,9,07, true);
    	System.out.println(a.hashCode()); //gives index of where the value is, every object has their own hascode
    	System.out.println(b.hashCode());
    	System.out.println(a.equals(b)); //seeing if they are equal to each other 
    	LinkedList<Date> list = new LinkedList<Date>();
    	//adding dates into the new list, prints duplicates
    	list.add(a);
    	list.add(b);
    	list.add(c);
    	list.add(d);
    	list.add(e);
    	System.out.println(list);
    	
    	HashSet<Date> set = new HashSet<Date>();
    	//adding dates into new set; doesn't print duplicates
    	set.add(a);
    	set.add(b);
    	set.add(c);
    	set.add(d);
    	set.add(e);
    	System.out.println(set);
    }

}

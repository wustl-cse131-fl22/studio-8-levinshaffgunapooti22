package studio8;

import java.util.HashSet;
import java.util.Objects;

public class Appointment {
	
	private Date d;
	private Time t;
	
	public Appointment(int month, int day, int year, int hour, int minute) {
		this.d = new Date(month, day, year, false);
		this.t = new Time(hour, minute, false);
	
	}

	public static void main(String[] args) {
		Appointment a = new Appointment(11,17,22,1,38);
		Appointment b = new Appointment(11,17,22,1,00);
		Appointment c = new Appointment(11,22,22,1,38);
		Appointment d = new Appointment(12,10,22,1,40);
		Appointment e = new Appointment(11,17,22,1,38);
		HashSet<Appointment> calendar = new HashSet<Appointment>();
		calendar.add(a);
		calendar.add(b);
		calendar.add(c);
		calendar.add(d);
		calendar.add(e);

	}

	@Override
	public int hashCode() {
		return Objects.hash(d, t);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(d, other.d) && Objects.equals(t, other.t);
	}


	}



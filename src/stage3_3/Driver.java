package stage3_3;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	
	public static void main(String[] args) {
		
		List<Appointment> appointments = new ArrayList<>();
		
		appointments.add(new Yearly("Bob's Birthday", 1970, 11, 26));
		appointments.add(new Monthly("Group Meeting", 2010, 4, 26));
		appointments.add(new OneTime("Fly Away", 2018, 5, 26));
		appointments.add(new OneTime("Do Things", 2018, 4, 26));
		appointments.add(new Yearly("Fluffy's Day", 2011, 4, 21));
		
		for (Appointment a : appointments) {
			System.out.println(a + " - " + a.occursOn(2018, 04, 21));
			
		}
		
		System.out.println();
		
		for (Appointment a : appointments) {
			System.out.println(a + " - " + a.occursOn(2018, 04, 26));
			
		}
		
		System.out.println();
		
		for (Appointment a : appointments) {
			System.out.println(a + " - " + a.occursOn(2018, 11, 26));
			
		}
		
		
		
	}

}

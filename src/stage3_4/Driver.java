package stage3_4;

import java.io.FileNotFoundException;
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
			System.out.println(a);
		}
		
		System.out.println();
		
		
		AppointmentDataManager manager = new AppointmentDataManager("test.data");
		
		try {
			manager.save(appointments);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			List<Appointment> newAppointments = manager.load();
			
			for (Appointment a : newAppointments) {
				System.out.println(a);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}

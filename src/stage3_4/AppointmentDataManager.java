package stage3_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppointmentDataManager {

	private File dataFile;

	public AppointmentDataManager(File dataFile) {
		this.dataFile = dataFile;
	}

	public AppointmentDataManager(String fileName) {
		this.dataFile = new File(fileName);
	}

	public void save(List<Appointment> appointments) throws FileNotFoundException {

		PrintWriter save = new PrintWriter(dataFile);
		for (Appointment a : appointments) {
			save.println(a.getSaveString());
		}
		save.close();

	}

	public List<Appointment> load() throws FileNotFoundException {
		List<Appointment> data = new ArrayList<>();
		Scanner s = new Scanner(dataFile);

		int line = 0;
		
		while (s.hasNextLine()) {
			String input = s.nextLine();
			String[] split = input.split(",");
			
			
			line++;
			
			switch (split[0]) {
			case "O":
				data.add(new OneTime(split[4], 
						Integer.parseInt(split[1].trim()), 
						Integer.parseInt(split[2].trim()),
						Integer.parseInt(split[3].trim())));
				break;
			case "M":
				data.add(new Monthly(split[4], 
						Integer.parseInt(split[1].trim()), 
						Integer.parseInt(split[2].trim()),
						Integer.parseInt(split[3].trim())));
				break;
			case "Y":
				data.add(new Yearly(split[4], 
						Integer.parseInt(split[1].trim()), 
						Integer.parseInt(split[2].trim()),
						Integer.parseInt(split[3].trim())));
				break;
				default:
					System.out.println("Not able to read line " + line);
			}

		}
		s.close();
		return data;
	}

}

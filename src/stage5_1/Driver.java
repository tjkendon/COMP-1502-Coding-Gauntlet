package stage5_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		SalesData sales = new SalesData();

		sales.addData("Dinner", 17.50);
		sales.addData("Dinner", 170.00);
		sales.addData("Coffee", 5.75);
		sales.addData("Coffee", 10.00);
		sales.addData("Lodging", 800.00);

		sales.printData();

		SalesData newSales = loadData();

		newSales.printData();

	}

	public static SalesData loadData() {
		Scanner kb = new Scanner(System.in);
		SalesData salesData = new SalesData();

		System.out.println("Please enter the file name: ");
		String file = kb.nextLine();

		int lineNumber = 1;
		

		try (Scanner reader = new Scanner(new File(file))){
			
			while (reader.hasNextLine()) {
				try {

					String line = reader.nextLine();
					String[] lineParts = line.split(";");
					if (lineParts.length != 3) {
						System.out.println("On line " + lineNumber + " Not able to parse data: " + line);
					} else {
						salesData.addData(lineParts[1].trim(), Double.parseDouble(lineParts[2].trim()));
					}

				} catch (NumberFormatException nfe) {
					System.out.println("On line " + lineNumber + " Not able to read number " + nfe.getMessage());
				} finally {
					lineNumber++;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Not able to open file: " + file);
		} 
	

		kb.close();
		return salesData;

	}

}

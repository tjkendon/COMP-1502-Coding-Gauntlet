package stage3_1;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main (String[] args) {
		
		
		List<Media> media = new ArrayList<>();
		
		media.add(new Media("A Something", "Someone", 2018));
		media.add(new Book("A Book", "Someone", 2017, "A Writer", 40000));
		media.add(new FictionBook("A Fiction", "Someone", 2016, "Another Writer", 60000, "LaserPunk"));
		media.add(new NonFictionBook("A Serious", "Science", 1872, "An Old Person", 17000, "Seriousness", "651.17 OLD"));
		
		for (Media m : media) {
			System.out.println(m);
		}
		
	}
	
}

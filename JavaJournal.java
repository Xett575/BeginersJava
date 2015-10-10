import java.util.Scanner;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;
public class JavaJournal {
	public static void main(String[] args) {
		System.out.println("Thank you for using the Java Journal, please type your entry and when finished hit enter to save it to a specific location");
		
		Date foobar = new Date();
		Scanner input = new Scanner(System.in);
		String entry = input.nextLine();
		System.out.println("Please enter the path to where you want to save your file.");
		Scanner save = new Scanner(System.in);
		String location = save.nextLine();
		
		try{
			FileWriter file = new FileWriter(location + foobar + ".txt");
			file.write(entry);
			file.close();
		}
		catch (IOException e) 
        {
        e.printStackTrace();
        }
	}
}

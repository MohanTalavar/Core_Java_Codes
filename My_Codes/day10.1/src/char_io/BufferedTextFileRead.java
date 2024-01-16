package char_io;

import java.io.BufferedReader;                                  //JAVA IO
import java.io.FileReader;                           // while in console give: whole path\filename.txt
import java.util.Scanner;

public class BufferedTextFileRead {

	public static void main(String[] args) {
		
		
		System.out.println("Enter file name");
		try (Scanner sc = new Scanner(System.in);
				// Java App <---- BR <--- FR <--- text file
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) // try resources end
		
		{
			// chain of i/o : success
			String s = null;
			while ((s = br.readLine()) != null)
				System.out.println(s);
			System.out.println("File reading complete!!!!!");

		}  //JVM : br.close() , sc.close
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}

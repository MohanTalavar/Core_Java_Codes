package char_io;

import java.io.BufferedReader;                                  //JAVA IO
import java.io.FileReader;                           // while in console give: whole path\filename.txt
import java.util.Scanner;

public class BufferedTextFileReadFTest4 {                    // Ques: accept a keyword and find in the file
															// and upper case the first character | or all upper case

	public static void main(String[] args) {
		System.out.println("Enter file name");
		try (Scanner sc = new Scanner(System.in);
				// Java App <---- BR <--- FR <--- text file
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {
			// chain of i/o : success
			
			// changing over here
			///--=======================================================================================
			
			System.out.println("Enter the keyword");             // Actual logic
			String Keyword = sc.next();                                  
			br.lines()
			.filter( b-> b.contains( Keyword ) )                 // dont use sc.next in filter as it will iterate and will get blocked!!
//			.map(s -> s.toUpperCase())
			
			.map(s-> s.substring(0,1).toUpperCase().concat(s.substring(1)) )
			.forEach(b -> System.out.println(b));          
			
			//============================================================================================
			System.out.println("File reading complete!!!!!");

		}  //JVM : br.close() , sc.close
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}

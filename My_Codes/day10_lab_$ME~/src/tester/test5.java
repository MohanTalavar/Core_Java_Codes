package tester;

import java.util.List;
import java.util.Scanner;
import com.app.core.*;

import com.app.core.Student;
import static utils.StudentCollectionUtils.*;

public class test5 { // 5 Print name of specified subject topper

	public static void main(String[] args) {
		
		List<Student> studentList = populateList();
		
		System.out.println("Stduent list: ");
		
		System.out.println("Enter the subject: ");
		Scanner sc =new Scanner(System.in);
		
		Subject sub = Subject.valueOf(sc.next().toUpperCase());
		
		studentList.stream()         // conerter list to stream
		
		.filter(s-> s.getSubject()==sub)
		.sorted((s1,s2) -> ( (Double)  s2.getGpa() ).compareTo(s2.getGpa()))
		.limit(1)
		.forEach(System.out::println);

	}

}

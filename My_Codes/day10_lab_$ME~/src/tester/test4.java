package tester;

import static utils.StudentCollectionUtils.populateList;

import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;
import com.*;

import com.app.core.Student;
import com.app.core.Subject;

public class test4 {            // 4. Write a tester to print average of  gpa of 
	                            //    students for the specified subject eg : i/p : subject     
	                                

	public static void main(String[] args) {
		
		List<Student> studentList = populateList();
		Scanner sc= new Scanner(System.in);
		//==========================================================================
		System.out.println("Enter subject");
		Subject sub = Subject.valueOf(sc.next().toUpperCase());
	
		System.out.println("Average: ");
		 OptionalDouble q1= studentList.stream()
		.filter( s -> s.getSubject()==sub)
		.mapToDouble(s-> s.getGpa())
		.average();
		 System.out.println(q1);
	}

}

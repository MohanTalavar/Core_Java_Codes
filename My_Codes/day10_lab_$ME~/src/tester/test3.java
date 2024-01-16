package tester;

import java.util.List;

import com.app.core.Student;
import static utils.StudentCollectionUtils.*;

public class test3 {                  // 3. Display all student details(list) sorted as per GPA 
	                                  //    Use custom ordering

	public static void main(String[] args) {
		
		List<Student> studentList = populateList();
		
		System.out.println("Stduent list: ");
		studentList.stream()
		.sorted( (s1,s2) ->  ((Double)s2.getGpa()).compareTo(s1.getGpa()) )
		.forEach(s ->System.out.println(s) );

	}

}

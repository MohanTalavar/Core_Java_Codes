package tester;

import java.util.List;

import com.app.core.Student;
import static utils.StudentCollectionUtils.*;

public class test1 {                             //    1. Display all student details from a student list

	public static void main(String[] args) {
		
		List<Student> studentList = populateList();
		
		System.out.println("Stduent list: ");
		studentList.forEach(s ->System.out.println(s) );

	}

}

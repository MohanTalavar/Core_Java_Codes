package tester;

import static utils.StudentCollectionUtils.populateList;
import static utils.StudentCollectionUtils.populateMap;

import java.util.List;
import java.util.Map;

import com.app.core.Student;

public class test2 {                             //2. Display all student details from a student map

	public static void main(String[] args) {
		
//		List<Student> studentList = populateList();
//		Map<String,Student> studentMap = populateMap(studentList); 
		
		Map<String, Student> studentMap = populateMap(populateList()); // One Liner
		
		System.out.println("StduentMap : ");
		
		studentMap.forEach( (k,v) -> System.out.println(v));   // Why Not studentMap.values().forEach ??

	}

}

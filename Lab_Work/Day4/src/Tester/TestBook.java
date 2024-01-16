//4:  Create a class Book with data members as bname,id,author,price. 
//Write getters and setters for all the data members. Also add the display function.  
//Create the object of this class in main method and invoke all the methods in that class.


package Tester;

import java.util.Scanner;

import Logic.Book;

public class TestBook {
	
	public static void main(String[] args) {
		
		Book obj = new Book();
		obj.display();
		System.out.println("------------------");
		
		System.out.println("Enter BookName Author BookId Price:");
		Scanner sc = new Scanner(System.in);
		
		obj = new Book(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());
		obj.display();
		System.out.println("------------------");
		
		System.out.println("Enter Book Name to Update:");
		obj.setBookName(sc.next());
		System.out.println("Updated Author Name : "+obj.getBookName());
		
		System.out.println("Enter Author Name to Update:");
		obj.setAuthorName(sc.next());
		System.out.println("Updated Author Name : "+obj.getAuthorName());
		
		
		System.out.println("Enter Book Id to Update:");
		obj.setBookId(sc.nextInt());
		System.out.println("Updated Book Name : "+obj.getBookId());
		
		System.out.println("Enter Book Price to Update:");
		obj.setPrice(sc.nextDouble());
		System.out.println("Updated Book Name : "+obj.getPrice());
		obj.display();
		
	
		
		
		
		
		
		
		
	}

}

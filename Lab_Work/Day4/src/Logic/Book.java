//4:  Create a class Book with data members as name,id,author,price.
//Write getters and setters for all the data members. Also add the display function.  
//Create the object of this class in main method and invoke all the methods in that class.


package Logic;

public class Book {

	 	private String bookName,authorName;
	 	private int bookId;
	 	private Double price;
	 	
	
	 	
	 	public Book() {
			System.out.println("Default Constructor:");
			
			this.bookName = "Ddata";
			this.authorName = "R. D. Sharma";
			this.bookId = 0007;
			this.price = 550.0;
		}
	 	
		public Book(String bookName, String authorName, int bookId, Double price) {
			System.out.println("Parameterized Constructor:");
			this.bookName = bookName;
			this.authorName = authorName;
			this.bookId = bookId;
			this.price = price;
		}
		
		public void display()
		{
			System.out.println(bookName +" "+ authorName +" " +bookId +" "+price);
		}

		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		public String getAuthorName() {
			return authorName;
		}

		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}

		public int getBookId() {
			return bookId;
		}

		public void setBookId(int bookId) {
			this.bookId = bookId;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
}

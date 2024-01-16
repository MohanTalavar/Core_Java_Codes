//3. Create a class Person with data members as name, age, city. Write getters and setters 
//for all the data 
//members. Also add the display function. Create Default and Parameterized constructors. 
//Create the 
//object of this class in main method and invoke all the methods in that class.
package Logic;

public class Person_L3_Q3 {
	
		private String name, city ;
		private int age;
		
		public Person_L3_Q3() {
			
			System.out.println("Deafult Constructor");
			name= "Mohan_Pranay";
			city= "Pune";
			age= 20;
			
			
		}
		
		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public Person_L3_Q3(String name, String city, int age) {
//			super();
			System.out.println("Inside Parameterized constructor");
			this.name = name;
			this.city = city;
			this.age = age;
		}
		
		public void setName(String name) {
			
			System.out.println("----In Setter----------");
			this.name= name;
//			System.out.println("Updated Name= " + name); // check this
			
		}
		
		public String getName() {
			
			System.out.println("--------IN Getter--------");
			return name;
		}
		
		public void display() {
			
			System.out.println("-----------In display fun------------");
			System.out.println(name+ " " +city+ " " + age);
			
		}

}

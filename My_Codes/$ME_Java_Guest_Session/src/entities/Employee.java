package entities;

import java.time.LocalDate;

public class Employee {

		private static int idCounter=0;
		
		private int id;
		private String firstName;
		private String lastName;
		private LocalDate joiningDate;
		private double salary;
		
		// all args const
		
		public Employee(String firstName, String lastName, LocalDate joiningDate, double salary) {
			super();
			this.id= ++idCounter;
			this.firstName = firstName;
			this.lastName = lastName;
			this.joiningDate = joiningDate;
			this.salary = salary;
		}

		
		
		//
		
		@Override
		public String toString() {
			return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", joiningDate="
					+ joiningDate + ", salary=" + salary + "]";
		}



		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public LocalDate getJoiningDate() {
			return joiningDate;
		}

		public void setJoiningDate(LocalDate joiningDate) {
			this.joiningDate = joiningDate;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		
		//
		
		
		
		
}

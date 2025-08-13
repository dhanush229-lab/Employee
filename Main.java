package employeeDetails;

public class Main {

	public static void main(String[] args) {
		Employee e1=new Employee("jhon",1234 , 2500);
		Employee e2=new Employee("sham",1256, 3500);
		
		System.out.println("initial employee details");
		e1.display_details();
		e2.display_details();
		
	
		e1.increase_salary(0);
		e2.increase_salary(0);
		
		
		System.out.println("updated employee details");	
		e1.display_details();
		e2.display_details();
		
		e1.increase_salary(0);
		e2.increase_salary(0);
	}
}
		
		

	

		
		
			
		
	
		
		 
		

	



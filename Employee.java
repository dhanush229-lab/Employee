package employeeDetails;

public class Employee {
	
	String  name;
	int id;
	double salary;


	Employee(String name,int id,double salary){
		this.name=name;
		this.id=id;
		this.salary= salary;
		}
void display_details(){
	System.out.println("employee name: "+this.name);
	System.out.println("employee id:"+this.id);
	System.out.println("employee salary: "+this.salary);
	}
void increase_salary(double percentage){
	
	double increment=(this.salary*30)/100;
	salary = this.salary+increment;
	System.out.println(this.name+"salary is incresed by"+salary);
}
}
	
	
	
	

	



import java.util.*;
public class Employee{
	static String name;
	static int id;
	static int salary;
	
	public Employee(String name, int id, int salary){
		this.name= name;
		this.id= id;
		this.salary= salary;
	}
	
	public static void display(){
	    System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		System.out.println("Salary: "+salary);
	}
	
	
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		String s= adi.nextLine();
		int id= adi.nextInt();
		int salary= adi.nextInt();
		
		Employee emp= new Employee(s,id,salary);
		emp.display();
	}
}
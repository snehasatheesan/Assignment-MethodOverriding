
1. Add getEmployeeDetails method to the class 'Employee' and extend it in subclasses representing different types of employees such as HourlyEmployee and SalariedEmployee and overload getEmployeeDetails.
  Demonstrate polymorphism by printing various types of Employees by using Parent Class reference.package Inheritence;

public class Employee {
	
	   
	    String name;
	    int EmployeeId;
	    Employee(String name,int EmployeeId){
	        this.name=name;
	        this.EmployeeId=EmployeeId;
	    }

	    public String getEmployeeDetails(){
	        return "Employee Name: "+name+" "+"EmployeeId: "+EmployeeId;
	    }

	}


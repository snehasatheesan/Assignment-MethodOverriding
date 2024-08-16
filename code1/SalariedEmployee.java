
1. Add getEmployeeDetails method to the class 'Employee' and extend it in subclasses representing different types of employees such as HourlyEmployee and SalariedEmployee and overload getEmployeeDetails.
  Demonstrate polymorphism by printing various types of Employees by using Parent Class reference.

package MethodOverriding;
	public class SalariedEmployee extends Employee{
	    
	    String name;
	    int EmployeeId;
	    double salary;
	    SalariedEmployee(String name,int EmployeeId,double salary){
	        super(name,EmployeeId);
	        this.salary=salary;
	    }
	    public String getEmployeeDetails(){
	        return super.getEmployeeDetails()+" "+"Salary: "+salary;

	    }
	}

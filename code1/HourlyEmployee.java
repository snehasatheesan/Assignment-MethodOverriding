
1. Add getEmployeeDetails method to the class 'Employee' and extend it in subclasses representing different types of employees such as HourlyEmployee and SalariedEmployee and overload getEmployeeDetails. 
  Demonstrate polymorphism by printing various types of Employees by using Parent Class reference.

  package methodOverriding;
	public class HourlyEmployee extends Employee{
	    
	    String name;
	    int Employeeid;
	    double hourlyRate;
	    HourlyEmployee(String name,int Employeeid,double hourlyRate){
	        super(name,Employeeid);
	        this.hourlyRate=hourlyRate;
	    }


	    public String getEmployeeDetails(){
	        return super.getEmployeeDetails()+" "+"Hourly Rate: "+hourlyRate;
	    }
	}

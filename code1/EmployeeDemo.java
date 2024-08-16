
1. Add getEmployeeDetails method to the class 'Employee' and extend it in subclasses representing different types of employees such as HourlyEmployee and SalariedEmployee and overload getEmployeeDetails.
  Demonstrate polymorphism by printing various types of Employees by using Parent Class reference.

  package MethodOverriding;

public class EmployeeDemo {


    public static void main(String[] args) {
        Employee [] sc=new Employee[]{new SalariedEmployee("Sneha",101,100000),
                new HourlyEmployee("Jen",102,100)};
        for (Employee t:sc){
            System.out.println(t.getEmployeeDetails());
            System.out.println();
        }
    }
}

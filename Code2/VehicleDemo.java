2. In Vehicle hierarchy, add methods like start and stop in Vehicle and override them in Child classes.
  
package Inheritence;

public class vehicleDemo {
	    public static void main(String[] args) {
	        vehicle sc=new vehicle();
	        train a=new train();
	        bus b=new bus();
	        sc.start();
	        sc.stop();
	        a.start();
	        a.stop();
	        b.start();
	        b.stop();
	    }
	}


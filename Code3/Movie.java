3. Create hierarchy from Movie class with Child classes of different genre movies like RomComMovie, ThrillerMovie, etc. Demonstrate polymorphism using them.

  package MethodOverriding;

public class Movie {
	
	    String title;
	    double hours;
	    Movie(String title,double hours){
	        this.title=title;
	        this.hours=hours;
	    }
	    public String details(){
	        return "The movie " + title + " is " + hours + "hours long.";
	    }
	}

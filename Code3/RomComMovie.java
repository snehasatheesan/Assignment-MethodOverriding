3. Create hierarchy from Movie class with Child classes of different genre movies like RomComMovie, ThrillerMovie, etc. Demonstrate polymorphism using them.

  package MethodOverriding;
	public class RomComMovie extends Movie{
		
	    String name;
	    double Duration;
	    RomComMovie(String name,double Duration){
	        super(name,Duration);
	    }

	    public String details() {
	        return super.details()+" It's a RomCom movie.";
	    }
	}

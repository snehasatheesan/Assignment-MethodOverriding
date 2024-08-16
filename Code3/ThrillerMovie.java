3. Create hierarchy from Movie class with Child classes of different genre movies like RomComMovie, ThrillerMovie, etc. Demonstrate polymorphism using them.

  package MethodOverriding;
	public class ThrillerMovie extends Movie{
	 
	    String name;
	    double duration;
	    ThrillerMovie(String name,double duration){
	        super(name,duration);
	    }

	    @Override
	    public String details() {
	        return super.details()+" It's a Thriller Movie.";
	    }
	}

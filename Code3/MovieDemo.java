3. Create hierarchy from Movie class with Child classes of different genre movies like RomComMovie, ThrillerMovie, etc. Demonstrate polymorphism using them.

  package MethodOverriding;

public class MovieDemo {
	    public static void main(String[] args) {
	        Movie sc=new Movie("Jumanji",3);
	        ThrillerMovie r=new ThrillerMovie("Veronica",2.0);
	        RomComMovie s=new RomComMovie("18 Again",2.35);

	        System.out.println(sc.details());
	        System.out.println(r.details());
	        System.out.println(s.details());

	        sc=new ThrillerMovie("Veronica",2.0);
	        System.out.println(sc.details());

	        sc=new RomComMovie("18 Again",2.35);
	        System.out.println(sc.details());
	    }
	}

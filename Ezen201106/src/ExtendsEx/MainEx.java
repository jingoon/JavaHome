package ExtendsEx;

public class MainEx {

	public static void main(String[] args) {
	
		
		Sonata s =null;

		if(sonata2 instanceof Sonata) {

			s=(Sonata)sonata2;

			s.only();

		}

		if(sonata2 instanceof Car) {

			s=(Sonata)sonata2;

			s.only();

		}

		//


		Sonata ss=null;

		if(sonata2.getClass()== Sonata.class) {

			ss=(Sonata)sonata2;

			ss.only();

		}

		
	}
}

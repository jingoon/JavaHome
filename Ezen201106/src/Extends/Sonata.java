package Extends;

public class Sonata extends Car {
	
	public Sonata() {
		super();
	}

	public Sonata(String name, String company) {
		super(name, company);
	}
	
	public void only() {
		System.out.println("sonata only");
	}

	@Override
	public void run() {
		super.run();
		System.out.println("Sonata∞° ¥ﬁ∏≥¥œ¥Ÿ.");
	}

	@Override
	public void stop() {
		System.out.println("Sonata∞° ∏ÿ√‰¥œ¥Ÿ.");
	}
	
	
	
	

}

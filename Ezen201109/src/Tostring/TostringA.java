package Tostring;

public class TostringA {
	private String a1;
	private String a2;
	public TostringA(String a1, String a2) {
		super();
		this.a1 = a1;
		this.a2 = a2;
	}
	
	public String getA1() {
		return a1;
	}

	public void setA1(String a1) {
		this.a1 = a1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a1 == null) ? 0 : a1.hashCode());
		result = prime * result + ((a2 == null) ? 0 : a2.hashCode());
		return result;
	}
	
	
	

}

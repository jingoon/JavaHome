package com.home;

public class Star2 {
	private	int line=7;
	private	int star=1;
	private int def=3;
	public Star2() {
		
	}
		
	public void starFor() {
		
		for( int i=0;i<line;i++) {
			if(i<3) {
				
				sfor();
				def--;
				star = star+2 ;

			}else {
			
				sfor();
				def++;
				star = star-2;
				
			}
		}
			
	}

	public void sfor() {
		for(int j=0; j<def;j++) {
			System.out.print(" ");
		}
		
		for(int j=0; j<star;j++) {
			System.out.print("*");
		}
		
		for(int j=0; j<def;j++) {
			System.out.print(" ");
		}
		
		System.out.println();
	
	}
	
}

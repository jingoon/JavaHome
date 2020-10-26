package com.home;

public class Star {

	public Star() {
		
	}
	
	public void star1() {
		for(int i=0;i<4;i++) {
			for(int i2=0;i2<(3-i);i2++) {
				System.out.print(" ");
			}
			for(int i3=i;i3<(2*i)+i+1;i3++) {	
				System.out.print("*");
			}
			for(int i2=0;i2<(3-i);i2++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public void star2() {
		int lineNum = 4;
		int starNum = 1;
		int spaceNum = 3; // or lineNum/2 +1;
		
		for(int i=0; i<lineNum; i++) {
			
			for(int j=0; j<spaceNum; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<starNum; j++) {
				System.out.print("*");
			}
			for(int j=0; j<spaceNum; j++) {
				System.out.print(" ");
			}
		System.out.println("");	
		starNum +=2;
		spaceNum --;
			
		}
	}
}

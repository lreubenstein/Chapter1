package com.company;

public class NewRandom {

	public NewRandom() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double r = Math.random();  //[0.0,1.0)
		//double r = Math.random()*10; //[0.0, 10.0)
		//int r = (int)(Math.random()*10);  //[0,9]
		//int r = (int)(Math.random()*10 +1);  //[1,10]
		int r = (int)(Math.random()*10 +21);  //[21,30]
		System.out.println(r);
		
	}

}

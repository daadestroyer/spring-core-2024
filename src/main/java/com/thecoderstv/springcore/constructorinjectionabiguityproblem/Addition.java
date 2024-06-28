package com.thecoderstv.springcore.constructorinjectionabiguityproblem;

public class Addition {
	private int x;
	private int y;

	public Addition(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("int - int Constructor");
	}
	
	public Addition(double x, double y) {
		this.x = (int) x;
		this.y = (int) y;
		System.out.println("double - double Constructor");
	}
	
	
	
	
	public Addition(long x, long y) {
		this.x = (int) x;
		this.y = (int) y;
		System.out.println("long - long Constructor");
	}
	

	public int doSum() {
		return x + y;
	}

}

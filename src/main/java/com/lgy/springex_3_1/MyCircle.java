package com.lgy.springex_3_1;

public class MyCircle {
	private Circle circle;
	private double number;
	
	public void ar() {
		circle.area(number);
	}
	
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	
	
}

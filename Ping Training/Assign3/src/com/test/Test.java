package com.test;
import com.shape.*;
public class Test {
	
	public static void main(String[] args) {
		
		Polygon square = new Square(5);
		square.calcArea();
		square.calcPeri();
		
		Polygon rect = new Rectangle(4,5);
		rect.calcArea();
		rect.calcPeri();
		
		
	}
}

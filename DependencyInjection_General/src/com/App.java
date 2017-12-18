package com;

public class App {

	public static void main(String[]args)
	{
//		Shape shape=new Circle();
//		shape.draw();
//		Shape t=new Traiangle();
//		t.draw();
		Circle circle=new Circle();
		Traiangle traiangle=new Traiangle();
	
		Shape.drawMyObject(circle);
		Shape.drawMyObject(traiangle);  //Still Hardoced.
	}
	
	//Still hardcoded.
}

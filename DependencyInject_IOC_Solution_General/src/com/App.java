package com;

public class App {
	
	public static void main(String[]args)
	{
		Circle circle=new Circle();
		Traingle traingle=new Traingle();
		
		
		Drawing d=new Drawing();
		d.setShape(circle);
		d.drawShape();
			//Dependeny is now out of the class.and injected by a diffenrct class.
	}
	
	 

}

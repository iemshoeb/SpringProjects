package com;

public abstract class Shape {

	public abstract void draw();
	public static void drawMyObject(Shape shape)
	{
		shape.draw();
	}
}

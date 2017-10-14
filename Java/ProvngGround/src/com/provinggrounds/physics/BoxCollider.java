package com.provinggrounds.physics;

public class BoxCollider 
{
	Vector2 offset;
	int width, height;
	
	 public BoxCollider(Vector2 offset, 	int width, int height)
	 {
		 this.offset = offset;
		 this.width = width;
		 this.height = height;
	 }
}

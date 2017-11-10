package com.thomas.game;

import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;

import com.thomas.engine.GameContainer;
import com.thomas.engine.Renderer;
import com.thomas.engine.gfx.Image;
import com.thomas.engine.gfx.Light;

public class Player
{
	private Image image;
	private Rectangle2D rect;
	
	private int locX, locY;
	private int newX, newY;
	private int width, height;
	
	private int speed = 1;
	
	public Player(String imagePath, int locX, int locY, int width, int height)
	{
		image = new Image(imagePath);
		image.setAlpha(true);
		image.setLightBlock(Light.NONE);
		
		rect = new Rectangle2D.Float();
		
		this.locX = locX;
		this.locY = locY;
		this.width = width;
		this.height = height;
	}
	
	public void update(GameContainer gc)
	{
		newX = locX;
		newY = locY;
		
		// MOVEMENT //
		
		if(gc.getInput().isKey(KeyEvent.VK_UP))
		{
			newY -= speed;
		}
		
		if(gc.getInput().isKey(KeyEvent.VK_DOWN))
		{
			newY += speed;
		}
		
		if(gc.getInput().isKey(KeyEvent.VK_RIGHT))
		{
			newX += speed;
		}
		
		if(gc.getInput().isKey(KeyEvent.VK_LEFT))
		{
			newX -= speed;
		}
		
		rect.setFrame(locX, locY, width, height);
	}
	
	public void render(Renderer r)
	{
		r.drawImage(image, locX, locY);
	}

	public int getLocX() {
		return locX;
	}

	public void setLocX(int locX) {
		this.locX = locX;
	}

	public int getLocY() {
		return locY;
	}

	public void setLocY(int locY) {
		this.locY = locY;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Rectangle2D getRect() {
		return rect;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public int getNewX() {
		return newX;
	}

	public void setNewX(int newX) {
		this.newX = newX;
	}

	public int getNewY() {
		return newY;
	}

	public void setNewY(int newY) {
		this.newY = newY;
	}
}

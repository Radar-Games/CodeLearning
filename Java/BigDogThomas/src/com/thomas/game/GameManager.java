package com.thomas.game;

import com.sun.glass.events.KeyEvent;
import com.thomas.engine.AbstractGame;
import com.thomas.engine.GameContainer;
import com.thomas.engine.Renderer;
import com.thomas.engine.audio.SoundClip;
import com.thomas.engine.gfx.Image;
import com.thomas.engine.gfx.ImageTile;

public class GameManager extends AbstractGame
{
	private Image image1;
	private Image image2;
	private SoundClip clip;
	float temp = 0;
	
	public GameManager()
	{
		image1 = new Image("/Images/Test1.png");
		image1.setAlpha(true);
		image2 = new Image("/Images/Test2.png");
		image2.setAlpha(true);
		
		
		clip = new SoundClip("/Audio/Clap.wav");
	}
	
	public static void main(String[] args) 
	{
		GameContainer gc = new GameContainer(new GameManager());
		
		gc.setScale(3.0f);
		
		// -- KEEP AT THE END -- //
		gc.start();
	}

	@Override
	public void update(GameContainer gc, float dt) 
	{
		if(gc.getInput().isKeyDown(KeyEvent.VK_A))
		{
			clip.play();
		}
		
		temp += dt;
		
		if(temp > 4)
		{
			temp = 0;
		}
	}

	@Override
	public void render(GameContainer gc, Renderer r) 
	{
		
		r.setzDepth(Integer.MAX_VALUE);
		r.drawImage(image2, gc.getInput().getMouseX(), gc.getInput().getMouseY());
		r.setzDepth(0);
		r.drawImage(image1, 10, 10);
		
		r.drawFillRect(gc.getInput().getMouseX() - 16, gc.getInput().getMouseY() - 16, 32, 32, 0xffffccff);
	}

}

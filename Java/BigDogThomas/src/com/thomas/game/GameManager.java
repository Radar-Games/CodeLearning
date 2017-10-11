package com.thomas.game;

import com.sun.glass.events.KeyEvent;
import com.thomas.engine.AbstractGame;
import com.thomas.engine.GameContainer;
import com.thomas.engine.Renderer;
import com.thomas.engine.gfx.Image;

public class GameManager extends AbstractGame
{
	private Image image;
	
	public GameManager()
	{
		image = new Image("/Test1.png");
	}
	
	public static void main(String[] args) 
	{
		GameContainer gc = new GameContainer(new GameManager());
		gc.start();
	}

	@Override
	public void update(GameContainer gc, float dt) 
	{
		if(gc.getInput().isKeyDown(KeyEvent.VK_A))
		{
			System.out.println("Hello father");
		}
	}

	@Override
	public void render(GameContainer gc, Renderer r) 
	{
		r.drawImage(image, gc.getInput().getMouseX() - 32, gc.getInput().getMouseY() - 32);
	}

}

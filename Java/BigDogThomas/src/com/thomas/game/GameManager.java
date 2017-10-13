package com.thomas.game;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

import com.thomas.engine.AbstractGame;
import com.thomas.engine.GameContainer;
import com.thomas.engine.Renderer;
import com.thomas.engine.gameobjects.StaticSolidRect;
import com.thomas.engine.gfx.Image;
import com.thomas.engine.gfx.Light;

public class GameManager extends AbstractGame
{
	private Player player;
	private Image background;
	
	private ArrayList<StaticSolidRect> ssr = new ArrayList<StaticSolidRect>();
	
	float temp = 0;
	
	public GameManager()
	{
		player = new Player("/Images/PlayerTest.png", 0, 0, 10, 10);
		
		background = new Image("/Images/TestBackGround.png");
		background.setAlpha(false);
		background.setLightBlock(Light.NONE);
	}
	
	public static void main(String[] args) 
	{
		GameContainer gc = new GameContainer(new GameManager());
		
		// Setting Window Settings //
		
		gc.setScale(3.0f);
		
		// -- KEEP AT THE END -- //
		gc.start();
	}

	@Override
	public void update(GameContainer gc, float dt) 
	{
		temp += dt;
		
		if(temp > 4)
		{
			temp = 0;
		}
		
		player.update(gc);
	}

	@Override
	public void render(GameContainer gc, Renderer r) 
	{
		player.render(r);
		
		ssr.forEach((i) -> 
		{
			i.render(r);
		});
	}
}

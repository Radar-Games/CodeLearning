/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameenginev4;

import java.io.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.lang.reflect.Method;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author 154015
 */
public class GameEngineV4 extends JFrame
{
    public static boolean isRunning = true;
    boolean editing = true;
    int fps = 60;
    int windowHeight = 500;
    int windowWidth = 500;
    
    Insets inset;
    BufferedImage backBuffer;
    PlayerTest player;
    static InputHandler input;
    
    static ArrayList<PlayerTest> players = new ArrayList<>();
    
//    
//    Player
//    Enemy
//    Solid
//    Decoration
//    
//    
//    
    
    public static void main(String[] args) 
    {
        GameEngineV4 game = new GameEngineV4();
        game.run();
        System.exit(0);
    }
    
    public void run()
    {
        initialize();
        
        while (isRunning)
        {
            long time = System.currentTimeMillis();
            
            update();
            draw();
            
            time = (1000/fps) - (System.currentTimeMillis() - time);
            
            if (time > 0)
            {
                try 
                {
                    Thread.sleep(time);
                } 
                catch (InterruptedException e) {}
            }
        }
        
        setVisible(false);
    }
    
    void initialize()
    {
        setTitle("Geoff Pethicccc");
        setSize(windowWidth, windowHeight);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        
        inset = getInsets();
        setSize(inset.left + windowWidth + inset.right, inset.top + windowHeight + inset.bottom); 

        backBuffer = new BufferedImage(windowWidth, windowHeight, BufferedImage.TYPE_INT_RGB);

        input = new InputHandler(this);
        
        player = new PlayerTest();
        player.initialize(20, 20, 20, 20);
    }
    
    void update()
    {
        players.forEach((p) ->
        {
            p.update();
        });
    }
    
    void draw()
    {
        Graphics g = getGraphics();

        Graphics bbg = backBuffer.getGraphics();
        
        bbg.setColor(java.awt.Color.GRAY);
        bbg.fillRect(0, 0, windowWidth, windowHeight);

        bbg.setColor(java.awt.Color.BLACK);
        
        players.forEach((p) -> 
        {
            bbg.drawRect(p.getx()-10, p.gety()-10, 20, 20);
        });
        
        /** -- MUST BE AT END -- **/
        g.drawImage(backBuffer, inset.left, inset.top, this);
    }
    
    static void addToPlayers(PlayerTest i)
    {
        players.add(i);
    }
}

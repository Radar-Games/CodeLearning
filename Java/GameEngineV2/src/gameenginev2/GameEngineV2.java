/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameenginev2;

import java.io.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.lang.reflect.Method;
import java.util.*;

public class GameEngineV2 extends JFrame
{
    boolean isRunning = true;
    boolean editing = true;
    int fps = 60;
    int py = 0;
    int px = 0;
    int ex = 0;
    int ey = 0;
    int windowHeight = 500;
    int windowWidth = 500;
    
    public static ArrayList<Solid> solids;
    
    public static boolean[][] collisons;
    
    Insets inset;
    BufferedImage backBuffer;
    InputHandler input;
    Player player;
    Editor editor;
    
    public static void main(String[] args) 
    {
        GameEngineV2 game = new GameEngineV2();
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
                catch (InterruptedException e){}
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
        
        player = new Player();
        player.start(this);
        
        editor = new Editor();
        editor.start(this);
        
        solids = new ArrayList<>();
        
        collisons = new boolean[windowWidth][windowHeight];
    }
    
    void update()
    {
        player.update(editing);
        editor.update(editing);
        
        if (input.isKeyDown(KeyEvent.VK_ENTER))
        {
            if (editing)
            {
                editing = false;
            }
            else
            {
                editing = true;
            }
        }
        
        ex = editor.getx();
        ey = editor.gety();
        px = player.getx();
        py = player.gety();
    }
    
    void draw()
    {
        Graphics g = getGraphics();

        Graphics bbg = backBuffer.getGraphics();
        
        bbg.setColor(java.awt.Color.GRAY);
        bbg.fillRect(0, 0, windowWidth, windowHeight);

        bbg.setColor(java.awt.Color.BLACK);
        
        if (editing)
        {
            bbg.setColor(java.awt.Color.RED);
            bbg.drawLine(ex-5, ey-5, ex+5, ey+5);
            bbg.drawLine(ex-5, ey+5, ex+5, ey-5);
            bbg.drawRect(ex-10, ey-10, 20, 20);
            
            bbg.setColor(java.awt.Color.BLACK);
            bbg.drawOval(px - 10, py - 10, 20, 20);
            
            bbg.drawLine(10, 0, 10, 500);
        }
        else
        {
            bbg.setColor(java.awt.Color.BLACK);
            bbg.drawLine(ex-5, ey-5, ex+5, ey+5);
            bbg.drawLine(ex-5, ey+5, ex+5, ey-5);
            
            bbg.setColor(java.awt.Color.RED);
            bbg.drawOval(px - 10, py - 10, 20, 20);
        }
        
        solids.forEach((solid) -> {
            int xx = solid.getx();
            int yy = solid.gety();
            bbg.setColor(java.awt.Color.RED);
            bbg.drawRect(xx-10, yy-10, 20, 20);
            bbg.setColor(java.awt.Color.BLACK);
        });
        
        
    }
    
    public static void addToSolids(Solid m)
    {
        solids.add(m);
    }
}

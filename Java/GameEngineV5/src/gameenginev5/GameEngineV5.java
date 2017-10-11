////////////////////////
// The Coulson Engine //
////////////////////////

package gameenginev5;

import java.io.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.lang.reflect.Method;
import java.util.*;
import java.util.ArrayList;

public class GameEngineV5 extends JFrame
{
    public static boolean isRunning = true;
    int fps = 60;
    int windowHeight = 500;
    int windowWidth = 500;
    
    Insets inset;
    BufferedImage backBuffer;
    static InputHandler input;
    
    static ArrayList<Player> playersRect = new ArrayList<>();
    
    // -- TESTING -- //
    
    Player p;
    
    public static void main(String[] args) 
    {
        GameEngineV5 game = new GameEngineV5();
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
        
        p = new Player();
        p.initialize(10, 10, 20, 20);
        
    }
    
    void update()
    {
        playersRect.forEach((pp) ->
        {
            pp.update();
            
            System.out.println(pp.toString());
        });
    }
    
    void draw()
    {
        Graphics g = getGraphics();

        Graphics bbg = backBuffer.getGraphics();
        
        bbg.setColor(java.awt.Color.GRAY);
        bbg.fillRect(0, 0, windowWidth, windowHeight);

        bbg.setColor(java.awt.Color.BLACK);
        
        // Drawing Rect //
        playersRect.forEach((pp) ->
        {
            bbg.drawRect(pp.getx() - (pp.getwidth()/2), pp.gety() - (pp.getheight()/2), pp.getwidth(), pp.getheight());
        });
        
        /** -- MUST BE AT END -- **/
        g.drawImage(backBuffer, inset.left, inset.top, this);
    }
    
    static void addToPlayers(Player i)
    {
        playersRect.add(i);
    }
}

package com.company;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class Main extends JFrame
{


    public static boolean isRunning = true;
    int fps = 120;
    int windowWidth = 500;
    int windowHeight = 500;
    int x = 0;

    public static void main(String[] args)
    {
        Main game = new Main();
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

            time  = (1000 / fps) - (System.currentTimeMillis() - time);

            if (time > 0)
            {
                try
                {
                    Thread.sleep(time);
                }
                catch(InterruptedException e){}
            }
        }

        setVisible(false);
    }

    void initialize()
    {
        setTitle("Thomas the Tank Engine");
        setSize(windowWidth, windowHeight);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    void update()
    {
        x++;
    }

    void draw()
    {
        Graphics g = getGraphics();

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, windowWidth, windowHeight);

        g.setColor(Color.BLACK);
        g.drawOval(x, 30, 20, 20);
    }
}

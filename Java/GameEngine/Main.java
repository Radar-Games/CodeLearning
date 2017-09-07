import java.io.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.image.BufferedImage;
import InputHandler;


public class Main extends JFrame
{
    public static boolean isRunning = true;
    int fps = 60;
    int x = 0;
    int windowHeight = 500;
    int windowWidth = 500;
    
    Insets inset;
    BufferedImage backBuffer;
    InputHandler input;

    public static void main (String[] args) 
    {
        Main game = new Main();
        game.run();
        System.exit(0);
    }

    public void run()
    {
        initialise();

        while (isRunning)
        {
            long time = System.currentTimeMillis();

            update();
            draw();

            time = (1000 / fps) - (System.currentTimeMillis() - time);

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

    void initialise()
    {
        setTitle("Thomas the Tank Engine");
        setSize(windowWidth, windowHeight);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    
        inset = getInsets();
        setSize(inset.left + windowWidth + inset.right, inset.top + windowHeight + inset.bottom); 

        backBuffer = new BufferedImage(windowWidth, windowHeight, BufferedImage.TYPE_INT_RGB);

        input = new InputHandler(this);
    }

    void update()
    {
        if (input.isKeyDown(KeyEvent.VK_RIGHT))
        {
            x += 1;
        }

        if (input.isKeyDown(KeyEvent.VK_LEFT))
        {
            x -= 1;
        }
    }

    void draw()
    {
        Graphics g = getGraphics();

        Graphics bbg = backBuffer.getGraphics();
        
        bbg.setColor(java.awt.Color.WHITE);
        bbg.fillRect(0, 0, windowWidth, windowHeight);

        bbg.setColor(java.awt.Color.BLACK);
        bbg.drawOval(x, 10, 20, 20);

        g.drawImage(backBuffer, inset.left, inset.top, this);
    }
}
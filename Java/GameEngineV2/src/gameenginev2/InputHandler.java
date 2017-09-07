    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package gameenginev2;

    import java.awt.Component; 
    import java.awt.event.*;

    public class InputHandler implements KeyListener
    {
        boolean[] keys = new boolean[256];

        static boolean j = false;
        boolean jj = true;

        public InputHandler (Component c)
        {
            c.addKeyListener(this);
        }

        public boolean isKeyDown(int keyCode)
        {
            if (keyCode > 0 && keyCode < 256)
            {
                return keys[keyCode];
            }

            return false;
        }

        public void keyPressed(KeyEvent e)
        {
            if (e.getKeyCode() > 0 && e.getKeyCode() < 256)
            {
                keys[e.getKeyCode()] = true;    
            }
        }

        public void keyReleased(KeyEvent e)
        {
            if (e.getKeyCode() > 0 && e.getKeyCode() < 256) 
            { 
                keys[e.getKeyCode()] = false;
                
                if (e.getKeyCode() == KeyEvent.VK_SPACE)
                {
                    Editor.setSpace(true);
                }
            }
        }

        public void keyTyped(KeyEvent e){} 
        
        public static boolean getSpace()
        {
            return j;
        }
    }
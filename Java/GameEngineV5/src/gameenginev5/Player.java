package gameenginev5;

import java.awt.Graphics;
import javafx.scene.input.KeyCode;

public class Player extends PlayerObjectRect
{
    public void initialize(int xx, int yy, int _width, int _length)
    {
        super.initialize(xx, yy, _width, _length, this);
        super.addToPlayers(this);
    }
    
    public void update()
    {
        
    }
    
    public int getx()
    {
        return super.getx();
    }
    
    public int gety()
    {
        return super.gety();
    }
}

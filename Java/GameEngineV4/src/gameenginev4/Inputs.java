package gameenginev4;

import java.awt.event.KeyEvent;

public class Inputs 
{
    public boolean isUp()
    {
        return GameEngineV4.input.isKeyDown(KeyEvent.VK_UP);
    }
    
    public boolean isDown()
    {
        return GameEngineV4.input.isKeyDown(KeyEvent.VK_DOWN);
    }
    
    public boolean isLeft()
    {
        return GameEngineV4.input.isKeyDown(KeyEvent.VK_LEFT);
    }
    
    public boolean isRight()
    {
        return GameEngineV4.input.isKeyDown(KeyEvent.VK_RIGHT);
    }
    
    public boolean isShift()
    {
        return GameEngineV4.input.isKeyDown(KeyEvent.VK_SHIFT);
    }
    
    public boolean isSpace()
    {
        return GameEngineV4.input.isKeyDown(KeyEvent.VK_SPACE);
    }
}

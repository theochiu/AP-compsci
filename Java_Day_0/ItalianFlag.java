
import acm.program.*;
import acm.graphics.*;
import java.awt.Color;

public class ItalianFlag extends GraphicsProgram
{

    public void run()
    {
        GRect firstThird = new GRect(20, 20, 40, 60);
        firstThird.setFilled(true);
        firstThird.setColor(new Color(0,0,0));
        add(firstThird);

        GRect middleThird = new GRect(60, 20, 40, 60);
        middleThird.setFilled(true);
        middleThird.setColor(Color.yellow);
        add(middleThird);
  
        GRect lastThird = new GRect(100, 20, 40, 60);
        lastThird.setFilled(true);
        lastThird.setColor(Color.red);
        add(lastThird);
        
        // this draws a nice black border around the flag
        // notice how I did NOT make it filled, and it is black by default
        GRect border = new GRect(20, 20, 120, 60);        
        add(border);
        
        GLabel italia = new GLabel("Belgium has amazing chocolates!", 20, 120);
        italia.setFont("Arial-Plain-36");
        add(italia);
        
    
    }


}

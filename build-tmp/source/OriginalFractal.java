import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

//Vivian Lam, Original Fractal, AP CS 6/7
public void setup()
{
	size(700,700);
}

public void draw()
{
	drawDesign((int)(width/2),(int)(height/2),(int)(width/2));

}

public void drawDesign(int x, int y, int radius)
{
	noFill();
	ellipse(x,y,radius,radius);
	if(radius>20)
	{
	stroke((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
    drawDesign(x,y,radius/2);
	drawDesign(x+radius/2,y,radius/2);
	drawDesign(x+radius/4,y-radius/2,radius/2);
	drawDesign(x,y,radius/2);
	drawDesign(x-radius/2,y,radius/2);
	drawDesign(x-radius/4,y+radius/2,radius/2);
  }

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}

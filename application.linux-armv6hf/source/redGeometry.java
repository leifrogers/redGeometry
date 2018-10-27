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

public class redGeometry extends PApplet {

RandomDots [] lines0 = new RandomDots[10];

public void setup()
{
  
  background(0);
  for (int i=1; i<lines0.length; i++)
  {
    lines0[i] = new RandomDots();
  }
  //frameRate(16);
}

public void draw() {
  background(0);
  for (int i=1; i<lines0.length; i++)
  {
    lines0[i].moveAbout();
  }
  connectDots();
  //saveFrame("red-######.jpg");
}

public void connectDots() {
  for (int i=1; i<lines0.length; i++)
  {
    fill(0xffFF0000);
    ellipse(lines0[i].x, lines0[i].y, 1, 1);
    for (int r=1; r<lines0.length; r++)
    {
      stroke(0xffFF0000);
      line(lines0[i].x, lines0[i].y, lines0[r].x, lines0[r].y);
    }
  }
}

class RandomDots {
  int count, x, y;
  String loca;
  int lineColor;


  RandomDots()
  {
    this.x = PApplet.parseInt(random(200, 1700));
    this.y = PApplet.parseInt(random(200, 800));
    this.count = 0;
    this.loca = "down";
    this.lineColor = color(PApplet.parseInt(random(255)));
  }


  public String pickRandom(String loc)
  {
    int rand = PApplet.parseInt(random(100));
    if (rand == 0)
    {
      loc = "up";
    }
    if (rand == 1)
    {
      loc = "down";
    }
    if (rand == 2)
    {
      loc = "left";
    }
    if (rand == 3)
    {
      loc = "right";
    }
    if (rand == 4)
    {
      loc = "Uright";
    }
    if (rand == 5)
    {
      loc = "Lright";
    }
    if (rand == 6)
    {
      loc = "Uleft";
    }
    if (rand == 7)
    {
      loc = "Lleft";
    }
    if (rand > 7)
    {
      loc = loc;
    }
    return loc;
  }

  public void moveAbout()
  {
    loca = pickRandom(loca);
    if (loca == "up")
    {
      y--;
    }
    if (loca == "down")
    {
      y++;
    }
    if (loca == "left")
    {
      x--;
    }
    if (loca == "right")
    {
      x++;
    }
    if (loca == "Uleft")
    {
      x--;
      y--;
    }
    if (loca == "Uright")
    {
      x++;
      y--;
    }
    if (loca == "Lleft")
    {
      x--;
      y++;
    }
    if (loca == "Lright")
    {
      x++;
      y++;
    }
    if (x >= 1920)
    {
      x = 1920;
    }
    if (x <= 0)
    {
      x = 0;
    }
    if (y <= 0)
    {
      y=0;
    }
    if (y >= 1080)
    {
      y = 1080;
    }
  }
}

  public void settings() {  size(1920, 1080); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "redGeometry" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}

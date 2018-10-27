RandomDots [] lines0 = new RandomDots[10];

void setup()
{
  size(1920, 1080);
  background(0);
  for (int i=1; i<lines0.length; i++)
  {
    lines0[i] = new RandomDots();
  }
  //frameRate(16);
}

void draw() {
  background(0);
  for (int i=1; i<lines0.length; i++)
  {
    lines0[i].moveAbout();
  }
  connectDots();
  //saveFrame("red-######.jpg");
}

void connectDots() {
  for (int i=1; i<lines0.length; i++)
  {
    fill(#FF0000);
    ellipse(lines0[i].x, lines0[i].y, 1, 1);
    for (int r=1; r<lines0.length; r++)
    {
      stroke(#FF0000);
      line(lines0[i].x, lines0[i].y, lines0[r].x, lines0[r].y);
    }
  }
}

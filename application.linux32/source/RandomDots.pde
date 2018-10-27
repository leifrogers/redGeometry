
class RandomDots {
  int count, x, y;
  String loca;
  color lineColor;


  RandomDots()
  {
    this.x = int(random(200, 1700));
    this.y = int(random(200, 800));
    this.count = 0;
    this.loca = "down";
    this.lineColor = color(int(random(255)));
  }


  String pickRandom(String loc)
  {
    int rand = int(random(100));
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

  void moveAbout()
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

package myprogram.zoog;
import processing.core.*;

public class CircleZoog extends Zoog {
  public CircleZoog(PApplet pa) {
    super(pa);
  }

  int r = 100;
  public void move() {
    t += td;
    x = r*(float)Math.cos(t) + 200;
    y = r*(float)Math.sin(t) + 200;
  }
}

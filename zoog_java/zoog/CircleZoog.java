package zoog_java.zoog;
import processing.core.*;

public class CircleZoog extends Zoog {
  public CircleZoog(PApplet pa) {
    super(pa);
  }

  int r = 100;
  float t = 0;
  public void move() {
    t += 0.1;
    x = r*(float)Math.cos(t);
    y = r*(float)Math.sin(t);
  }
}

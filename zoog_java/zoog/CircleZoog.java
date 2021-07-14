package zoog_java.zoog;
import processing.core.*;

public class CircleZoog extends Zoog {
  public CircleZoog(PApplet pa) {
    super(pa);
  }
  double xf = (double)x;
  double yf = (double)y;

  int r = 100;
  double t = 0.0;
  public void move() {
    t += 0.1;
    xf = r*Math.cos(t);
    yf = r*Math.sin(t);
  }
}

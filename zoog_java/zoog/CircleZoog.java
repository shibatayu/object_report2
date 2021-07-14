package zoog_java.zoog;
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

  public void display() {
    // draw body
    p.stroke(0);
    p.fill(zoogCol);
    p.rect(x, y, 20, 100);
    // draw head
    p.fill(zoogCol);
    p.ellipse(x, y-30, 60, 60);
    // draw eyes
    p.fill(zoogLeftEyeCol);
    p.ellipse(x-19, y-30, 16, 32);
    p.fill(zoogRightEyeCol);
    p.ellipse(x+19, y-30, 16, 32);
    // draw legs
    p.stroke(0);
    p.line(x-10, y+50, x-20, y+60);
    p.line(x+10, y+50, x+20, y+60);
  }
}

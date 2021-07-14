package zoog_java.zoog;
import processing.core.*;

public class Ballen {
  protected PApplet p;
  protected int x = 300;
  protected int y = 300;
  protected int d = 1;
  protected int zoogCol = 255;
  protected int zoogRightEyeCol = 0;
  protected int zoogLeftEyeCol = 0;
  protected boolean zoogEyeR = true;
  protected boolean zoogEyeL = true;

  public Ballen(PApplet pa) {
    p = pa;
  }
  
  public void display() {
    // draw body
    p.stroke(0);
    p.fill(zoogCol);
    p.ellipse(x, y, 50, 50);
    p.stroke(0);
    p.fill(zoogCol);
    p.ellipse(x, y, 10, 10);
    p.stroke(0);
    p.fill(zoogCol);
    p.ellipse(x-10, y, 10, 10);
    p.stroke(0);
    p.fill(zoogCol);
    p.ellipse(x+10, y, 10, 10);
    p.stroke(0);
    p.fill(zoogCol);
    p.ellipse(x-5, y-10, 5, 5);
    p.stroke(0);
    p.fill(zoogCol);
    p.ellipse(x+5, y+10, 5, 5);
  }

  public void move() {
    if(x <= 25 || p.width - 25 <= x) {
      d *= -1;
    }
    x += d;
  }
}

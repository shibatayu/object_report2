package zoog_java.zoog;
import processing.core.*;

abstract public class Ballen implements MovableShape {
  protected PApplet p;
  protected int x = 100;
  protected int y = 100;
  protected int dx = 1;
  protected int dy = 1;
  protected int zoogCol = 255;
  protected int zoogRightEyeCol = 0;
  protected int zoogLeftEyeCol = 0;
  protected boolean zoogEyeR = true;
  protected boolean zoogEyeL = true;

  protected Ballen(PApplet pa) {
    p = pa;
  }

  public void setPosition(int x1, int y1) {
    if(x1 < 30 || p.width - 30 < x1) {
      throw new IllegalArgumentException("xの値が画面外です。");
    } else if(y1 < 60 || p.height - 60 < y1) {
      throw new IllegalArgumentException("yの値が画面外です。");
    }
    x = x1;
    y = y1;
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
  
  abstract public void move();
  
  abstract public void eyePressed(int mouX, int mouY);
}

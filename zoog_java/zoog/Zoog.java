package zoog_java.zoog;
import processing.core.*;

abstract public class Zoog implements MovableShape {
  protected PApplet p;
  protected int x = 100;
  protected int y = 100;
  protected int d = 1;
  protected int zoogCol = 255;
  protected int zoogRightEyeCol = 0;
  protected int zoogLeftEyeCol = 0;
  protected boolean zoogEyeR = true;
  protected boolean zoogEyeL = true;

  protected Zoog(PApplet pa) {
    p = pa;
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
  
  abstract public void move();
  
  public void eyePressed(int mouX, int mouY) {
    if(x-27 <= mouX && mouX <= x-11 && y-46 <= mouY && mouY <= y-14) { //左目判定
      zoogLeftEyeCol = 255;
      zoogEyeL = false;
    } else if(x+11 <= mouX && mouX <= x+27 && y-46 <= mouY && mouY <= y-14) { //右目判定
      zoogRightEyeCol = 255;
      zoogEyeR = false;
    }
    if(!zoogEyeL && !zoogEyeR) {
      d = 0;
    }
  }
}
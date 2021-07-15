package myprogram.zoog;
import processing.core.*;

public class Ballen implements MovableShape{
  protected PApplet p;
  protected int x = 300;
  protected int y = 300;
  protected int d = 1;
  protected int BallenCol = 255;
  protected int ballenEyeCol = 0;
  protected int ballenMiddleNoseCol = 0;
  protected boolean BallenJudge = true;

  public Ballen(PApplet pa) {
    p = pa;
  }
  
  public void display() {
    // draw body
    p.stroke(0);
    p.fill(BallenCol);
    p.ellipse(x, y, 50, 40);
    //MidleNose
    p.fill(ballenMiddleNoseCol);
    p.ellipse(x, y, 10, 10);
    p.stroke(0);
    p.fill(ballenMiddleNoseCol);
    p.ellipse(x-10, y, 10, 10);
    p.stroke(0);
    p.fill(ballenMiddleNoseCol);
    p.ellipse(x+10, y, 10, 10);
    p.stroke(0);
    p.fill(ballenEyeCol);
    p.ellipse(x-5, y-10, 5, 5);
    p.stroke(0);
    p.fill(ballenEyeCol);
    p.ellipse(x+5, y-10, 5, 5);
  }

  public void move() {
    if(x <= 25 || p.width - 25 <= x) {
      d *= -1;
    }
    x += d;
  }

  public void Pressed(float mouX, float mouY) {
    if((mouX-x)*(mouX-x) + (mouY-y)*(mouY-y) <=25 ) {
      ballenMiddleNoseCol = 255;
      BallenJudge = false;
    }
    if(!BallenJudge) {
      d = 0;
    }
  }
}

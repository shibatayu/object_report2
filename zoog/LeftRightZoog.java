package zoog_java.zoog;
import processing.core.*;

public class LeftRightZoog extends Zoog {
  public LeftRightZoog(PApplet pa) {
    super(pa);
  }
  
  public void move() {
    if(x <= 30 || p.width - 30 <= x) {
      dx *= -1;
    }
    x += dx;
  }

  public void eyePressed(int mouX, int mouY) {
    //zoog1 Judge
    if(x-27 <= mouX && mouX <= x-11 && y-46 <= mouY && mouY <= y-14) { //左目判定
      zoogLeftEyeCol = 255;
      zoogEyeL = false;
    } else if(x+11 <= mouX && mouX <= x+27 && y-46 <= mouY && mouY <= y-14) { //右目判定
      zoogRightEyeCol = 255;
      zoogEyeR = false;
    }
    if(!zoogEyeL && !zoogEyeR) {
      dx = 0;
    }
  }  
}


package zoog_java.zoog;
import processing.core.*;

public class UpDownZoog extends Zoog {
  public UpDownZoog(PApplet pa) {
    super(pa);
  }

  public void move() {
    if(y <= 60 || p.height - 60 <= y) {
      dy *= -1;
    }
    y += dy;
  }
  
  public void eyePressed(int mouX, int mouY) {
    if(x-27 <= mouX && mouX <= x-11 && y-46 <= mouY && mouY <= y-14) { //左目判定
      zoogLeftEyeCol = 255;
      zoogEyeL = false;
    } else if(x+11 <= mouX && mouX <= x+27 && y-46 <= mouY && mouY <= y-14) { //右目判定
      zoogRightEyeCol = 255;
      zoogEyeR = false;
    }
    if(!zoogEyeL && !zoogEyeR) {
      dy = 0;
    }
  }  
}


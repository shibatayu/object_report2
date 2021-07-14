package zoog_java.zoog;
import processing.core.*;

public class LeftRightZoog extends Zoog {
  public LeftRightZoog(PApplet pa) {
    super(pa);
  }
  
  public void move() {
    if(x <= 30 || p.width - 30 <= x) {
      d *= -1;
    }
    x += d;
  }
}


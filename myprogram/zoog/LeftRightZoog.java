package myprogram.zoog;
import processing.core.*;

public class LeftRightZoog extends Zoog {
  public LeftRightZoog(PApplet pa) {
    super(pa);
  }
  
  public void move() {
    if((int)x <= 30 || p.width - 30 <= (int)x) {
      d *= -1;
    }
    x += d;
  }
}


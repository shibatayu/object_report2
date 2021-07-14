package zoog_java.zoog;
import processing.core.*;

public class UpDownZoog extends Zoog {
  public UpDownZoog(PApplet pa) {
    super(pa);
  }

  public void move() {
    if((int)y <= 60 || p.height - 60 <= (int)y) {
      d *= -1;
    }
    y += d;
  }  
}


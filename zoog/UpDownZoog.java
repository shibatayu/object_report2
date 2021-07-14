package zoog_java.zoog;
import processing.core.*;

public class UpDownZoog extends Zoog {
  public UpDownZoog(PApplet pa) {
    super(pa);
  }

  public void move() {
    if(y <= 60 || p.height - 60 <= y) {
      d *= -1;
    }
    y += d;
  }  
}


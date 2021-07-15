package myprogram.zoog;
import processing.core.*;

public interface MovableShape {
  void display();
  void move();
  void eyePressed(float mouX, float mouY);
}
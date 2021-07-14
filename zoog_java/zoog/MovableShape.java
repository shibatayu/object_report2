package zoog_java.zoog;
import processing.core.*;

interface MovableShape {
  void display();
  void move();
  void eyePressed(int mouX, int mouY);
}
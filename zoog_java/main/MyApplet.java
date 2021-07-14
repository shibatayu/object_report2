package zoog_java.main;
import zoog_java.zoog.*;
import processing.core.*;

public class MyApplet extends PApplet {
  Zoog[] z = new Zoog[3];
  Ballen b;
  public void settings() {
    size(400, 400);
    z[0] = new LeftRightZoog(this);
    z[1] = new UpDownZoog(this);
    z[2] = new CircleZoog(this);
    b = new Ballen(this);
  }

  public void setup() {
    ellipseMode(CENTER);
    rectMode(CENTER);
  }

  public void draw() {
    background(255); 
    z[0].display();
    z[0].move();
    z[1].display();
    z[1].move();
    z[2].display();
    z[2].move();
    b.display();
    b.move();
  }

  public void mousePressed() {
    z[0].eyePressed(mouseX, mouseY);
    z[1].eyePressed(mouseX, mouseY);
    z[2].eyePressed(mouseX, mouseY);
  }

  public static void main(String[] args) {
    PApplet.main("zoog_java.main.MyApplet");
  }
}

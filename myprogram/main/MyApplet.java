package myprogram.main;
import myprogram.zoog.*;
import processing.core.*;

public class MyApplet extends PApplet {
  MovableShape[] m = new MovableShape[4];
  // Zoog[] z = new Zoog[3];
  // Ballen b;
  public void settings() {
    size(400, 400);
    m[0] = new LeftRightZoog(this);
    m[1] = new UpDownZoog(this);
    m[2] = new CircleZoog(this);
    m[3] = new Ballen(this);
  }

  public void setup() {
    ellipseMode(CENTER);
    rectMode(CENTER);
  }

  public void draw() {
    background(255);
    for(int i=0; i<4; i++) {
      m[i].display();
      m[i].move();
    }
    // z[0].display();
    // z[0].move();
    // z[1].display();
    // z[1].move();
    // z[2].display();
    // z[2].move();
    // b.display();
    // b.move();
  }

  public void mousePressed() {
    for(int i=0; i<4; i++) {
      m[i].Pressed(mouseX, mouseY);
    }
    // z[0].eyePressed(mouseX, mouseY);
    // z[1].eyePressed(mouseX, mouseY);
    // z[2].eyePressed(mouseX, mouseY);
    // b.eyePressed(mouseX, mouseY); 
  }


  public static void main(String[] args) {
    PApplet.main("myprogram.main.MyApplet");
  }
}

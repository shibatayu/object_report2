public class CircleZoog extends Zoog {
    int r = 100;
    double t = 0.0;
    public void move() {
        t += 0.1;
        x = r*cos(t);
        y = r*sin(t);
    }
}

package PointAndMoveablePoint;

public class Run2 {
  public static void main(String[] args) {
    Point jack = new Point ();
    System.out.println (jack);
    jack = new Point (3.24f, 5.34f);
    System.out.println (jack);
    System.out.println ();
    System.out.println ();


    MovablePoint name = new MovablePoint ();
    System.out.println (name);
    name = new MovablePoint (3.24f,1.23f,22.2f,44.5f);
    System.out.println (name);
  }
}

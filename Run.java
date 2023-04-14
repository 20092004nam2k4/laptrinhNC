package CircleAndCylinder;

public class Run {
  public static void main(String[] args) {
    Circle print = new Circle ();
    System.out.println (print);
    print = new Circle (3.0, " màu trắng", print.getAcreage ( ) );
    System.out.println (print );
    System.out.println ();
    System.out.println ();
    System.out.println ();


    System.out.println ("Hình Trụ ");
    Cylinder print1 = new Cylinder ();
    System.out.println (print1);
    System.out.println ();
    print1 = new Cylinder (5.0,"màu đen", print1.getAcreage ( ) ,3.0 );
    System.out.println (print1 );
  }
}

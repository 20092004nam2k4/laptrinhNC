package CircleAndCylinder;

public class Cylinder extends Circle {
  protected double height;

  public Cylinder() {
    this.height = 4.0;
  }

  public Cylinder(double radius , String color , double acreage , double height) {
    super ( radius , color , acreage );
    this.height = height;
  }

  public double getHeight(){
    return height;
  }

  public void setHeight(double height){
    this.height = height;
  }

  public double getVolume(){
    return Math.PI *(radius*radius)*height;
  }

  @Override
  public String toString() {
    return "Cylinder{" +
      "height=" + height +
      ", radius=" + radius +
      ", color='" + color + '\'' +
      ", acreage=" + acreage +
      ", Volume = "+getVolume ()+
      "}\n " + super.toString ( );
  }
}


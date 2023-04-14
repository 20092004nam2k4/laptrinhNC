package CircleAndCylinder;

public class Circle {
  protected double radius;
  protected String color;
  protected double acreage;

  public Circle(){
    this.radius = 2.0;
    this.color = "trắng";

  }

  public Circle(double radius, String color, double acreage){
    this.radius = radius;
    this.color = color;
    this.acreage = acreage;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getAcreage() {
    return  radius*radius * Math.PI;
  }

  public void setAcreage(double acreage) {
    this.acreage = acreage;
  }


  @Override
  public String toString() {
    return "Circle{" +
      "radius=" + radius +
      ", color='" + color + '\'' +
      ", acreage=" + acreage +
      '}';
  }
}

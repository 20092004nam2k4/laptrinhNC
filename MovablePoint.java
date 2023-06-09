package PointAndMoveablePoint;

public class MovablePoint extends Point {
  protected float xSpeed = 0.0f;
  protected float ySpeed = 0.0f;

  public MovablePoint(float x , float y , float xSpeed , float ySpeed) {
    super ( x , y );
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public MovablePoint(float xSpeed , float ySpeed) {
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public MovablePoint() {
  }

  public float getXSpeed() {
    return xSpeed;
  }

  public void setXSpeed(float xSpeed) {
    this.xSpeed = xSpeed;
  }

  public float getYSpeed() {
    return ySpeed;
  }

  public void setYSpeed(float ySpeed) {
    this.ySpeed = ySpeed;
  }

  public void setSpeed(float xSpeed , float ySpeed) {
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public float[] Speed() {
    float[] name = new float[2];
    name[0] = getXSpeed ( );
    name[1] = getYSpeed ( );
    return name;
  }


  @Override
  public String toString() {
    return "MovablePoint{" +
      "xSpeed=" + xSpeed +
      ", ySpeed=" + ySpeed +
      ", x=" + x +
      ", y=" + y +
      "} " + super.toString ( );
  }

  public MovablePoint move(){
    x += xSpeed;
    y += ySpeed;
    return this;
  }
}

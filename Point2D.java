package Point2dAndPoint3d;

public class Point2D {
  protected float x = 0.0f;
  protected float y = 0.0f;

  public Point2D(float x, float y){
    this.x = x;
    this.y = y;
  }

  public Point2D(){

  }

  public float getX() {
    return x;
  }

  public void setX(float x) {
    this.x = x;
  }

  public float getY() {
    return y;
  }

  public void setY(float y) {
    this.y = y;
  }

  public void xy(float x, float y){
    this.x = x;
    this.y = y;
  }

  public float[] getXY(){
    float[] item = new float[2];
    item[0] = this.x;
    item[1] = this.y;
    return item;
  }

  @Override
  public String toString() {
    return "Point2D{" +
      "x=" + x +
      ", y=" + y +
      '}';
  }
}

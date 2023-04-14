package Point2dAndPoint3d;

public class Point3D extends Point2D {
  protected float z = 0.0f;

  public Point3D(float x , float y , float z) {
    super ( x , y );
    this.z = z;
  }

  public Point3D() {
  }

  public float getZ() {
    return z;
  }

  public void setZ(float z) {
    this.z = z;
  }

  public void setXYZ(float x , float y , float z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public float[] getXYZ(){
    float [] name = new float[3];
    name[0]= this.getX ();
    name[1]= this.getY ();
    name[2]= this.getZ ();
    return name;
  }


  @Override
  public String toString() {
    return "Point3D{" +
      ", x=" + x +
      ", y=" + y +
      ", z=" + z +
      "} " + super.toString ( );
  }
}

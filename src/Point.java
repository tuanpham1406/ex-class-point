public class Point {
  private float x = 1.0f;
  private float y = 1.0f;
  public Point() {
  }
  public Point(float x, float y) {
    this.x = x;
    this.y = y;
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
  public float[] getXY() {
    float[] arr = new float[] {this.x, this.y};
    return arr;
  }
  public void setXY(float x, float y) {
    this.x = x;
    this.y = y;
  }
  public void show(float[] arr) {
    for (float i : arr) {
      System.out.print(i + "\t");
    }
  }
  @Override
  public String toString() {
    return "x = " + getX() + ", y = " + getY();
  }
  public static void main(String[] args) {
    Point point = new Point();
    System.out.println(point);
    point = new Point(1.1f, 1.1f);
    System.out.println(point);
    point.show(point.getXY());
  }
}
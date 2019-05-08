public class MoveAblePoint extends Point {
  private float xSpeed = 1.0f;
  private float ySpeed = 1.0f;
  public MoveAblePoint() {
  }
  public MoveAblePoint(float xSpeed, float ySpeed) {
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }
  public MoveAblePoint (float x, float y, float xSpeed, float ySpeed) {
    super(x, y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }
  public float getxSpeed() {
    return xSpeed;
  }
  public void setxSpeed(float xSpeed) {
    this.xSpeed = xSpeed;
  }
  public float getySpeed() {
    return ySpeed;
  }
  public void setySpeed(float ySpeed) {
    this.ySpeed = ySpeed;
  }
  public void setSpeed (float xSpeed, float ySpeed){
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }
  public float[] getSpeed() {
    float[] arr = new float[] {xSpeed, ySpeed};
    return arr;
  }
  @Override
  public String toString() {
    return super.toString() + ", speed = " + "(" + xSpeed +", "+ ySpeed + ")";
  }
  public MoveAblePoint move() {
    setX(getX() + this.xSpeed);
    setY(getY() + this.ySpeed);
    return this;
  }
  public static void main(String[] args) {
    MoveAblePoint moveAblePoint = new MoveAblePoint();
    System.out.println(moveAblePoint);
    moveAblePoint = new MoveAblePoint(1.1f, 1.1f);
    System.out.println(moveAblePoint);
    System.out.println(moveAblePoint.move());
  }
}

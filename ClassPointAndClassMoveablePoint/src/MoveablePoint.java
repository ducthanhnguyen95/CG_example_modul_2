public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
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

    public void setSpeed(float xSpeed , float ySpeed){
        setX(xSpeed);
        setY(ySpeed);
    }

    public float[] getSpeed(){
        float[] arr = new float[2];
        arr[0] = getxSpeed();
        arr[1] = getySpeed();
        return arr;
    }

    @Override
    public String toString() {
        return " MoveablePoint  {" + super.toString() + " , speed " + " = " +  (getxSpeed() + getySpeed()) + "}";
    }

    public MoveablePoint move(){
        this.setX( getX() + getxSpeed() );
        this.setY( getY() + getySpeed() );
        return this;

    }
}

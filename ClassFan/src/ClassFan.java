public class ClassFan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color;

    public ClassFan() {
    }

    public ClassFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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


    public String toString(){
        if(on == true){
             getSpeed();
             getColor();
             getRadius();
            return " Speed : " + getSpeed() + "\n" + " Color : " +   getColor() + "\n" + " Radius: " +  getRadius();
        }else{
              getColor();
              getRadius();
            System.out.println(" Fan is off");
            return " Color : " +  getColor() + "\n" + " Radius : " +  getRadius();
        }
    }
}

package OOPS;

public class Car {
    private String color;
    private String branch;
    private String model;
    private int year;
    private int speed = 40;

    static final String engine = "V8";

    public final void airbags(){
        System.out.println("4 airbags");
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    
    public void accelerate(int increment){
        speed += increment;
    }
}

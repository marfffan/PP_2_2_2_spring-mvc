package web.model;

public class Car {
    private String firma;
    private String color;
    private int power;

    public Car() {
    }

    public Car(String siries, String color, int power) {
        this.firma = siries;
        this.color = color;
        this.power = power;
    }


    public String getSiries() {
        return firma;
    }

    public void setSiries(String siries) {
        this.firma = siries;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}

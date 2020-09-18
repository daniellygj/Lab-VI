package Model;

public class Detection {

    private String plate;

    private int speed;

    private int allowedSpeed;

    public Detection(String plate, int speed, int allowedSpeed) {
        this.plate = plate;
        this.speed = speed;
        this.allowedSpeed = allowedSpeed;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAllowedSpeed() {
        return allowedSpeed;
    }

    public void setAllowedSpeed(int allowedSpeed) {
        this.allowedSpeed = allowedSpeed;
    }
}

package bikepackage;

public class AutomaticBike {
    private boolean powerOff = true;
    private boolean accelerate;
    private boolean decelerate;
    private int speed;
    public boolean turnOn() {
        if (powerOff) {
            powerOff = false;
            return true;
        }
        return false;
    }

    public boolean turnOff() {
        powerOff = true;
        return powerOff;
    }
    public int gearOne(int speed) {
        if (speed >= 0 && speed <= 20 && accelerate) {
            speed++;
            return speed;
        } else if (speed >= 0 && speed <= 20 && decelerate) {
            speed--;
            return speed;
        }
            return 0;
    }

    public int gearTwo(int speed) {
        if (speed >= 21 && speed <= 30 && accelerate){
            speed += 2;
            return speed;
        } else if (speed >= 21 && speed <= 30 && decelerate) {
            speed -= 2;
            return speed;
        }
        return 0;
    }

    public int gearThree(int speed) {
        if (speed >= 31 && speed <= 40 && accelerate) {
            speed += 3;
            return speed;
        } else if (speed >= 31 && speed <= 40 && decelerate) {
            speed -= 3;
            return speed;
        }
        return 0;
    }
    public int gearFour(int speed) {
        if (speed >= 41 && accelerate) {
            speed += 4;
            return speed;
        } else if (speed >= 41 && decelerate){
            speed -= 4;
            return speed;
        }
        return 0;
    }
    public boolean accelerate() {
        accelerate = true;
        return accelerate;
    }
    public boolean decelerate() {
        decelerate = true;
        return decelerate;
    }
}

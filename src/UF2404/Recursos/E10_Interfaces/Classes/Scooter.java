package UF2404.Recursos.E10_Interfaces.Classes;

import UF2404.Recursos.E10_Interfaces.Interface.Vehicle;

public class Scooter implements Vehicle {
    private int currentSpeed;
    private boolean started;

    public Scooter() {
        this.currentSpeed = MIN_SPEED;
        this.started = false;
    }

    /**
     * Turn On the vehicle.
     */
    @Override
    public void turnOn() {
        if (!this.started) {
            started = true;
            System.out.println(TURN_ON);
        }
    }

    /**
     * Increase the speed of the vehicle until it reaches the limit.
     *
     * @param speedIncrement Integer the speed you want to increase.
     */
    @Override
    public void speedUp(int speedIncrement) {
        if (this.started) {
            if ((currentSpeed + Math.abs(speedIncrement)) < MAX_SCOOTER_SPEED) {
                this.currentSpeed += Math.abs(speedIncrement);
                System.out.println(SPEED_UP);
            } else {
                this.currentSpeed = MAX_SCOOTER_SPEED;
                System.out.println(REACH_MAX_SPEED);
            }
        } else {
            System.out.println(UNABLE_TO_SPEED_UP);
        }
    }

    /**
     * Decrease the speed of the vehicle untill it reaches the limit.
     *
     * @param speedDecrease Integer the speed you want to decrease.
     */
    @Override
    public void brake(int speedDecrease) {
        if (this.started) {
            if ((currentSpeed - Math.abs(speedDecrease)) > MIN_SPEED) {
                this.currentSpeed -= Math.abs(speedDecrease);
                System.out.println(BRAKE);
            } else {
                this.currentSpeed = MIN_SPEED;
                System.out.println(REACH_MIN_SPEED);
            }
        } else {
            System.out.println(UNABLE_TO_BRAKE);
        }
    }

    /**
     * Turn Off the vehicle.
     */
    @Override
    public void turnOff() {
        if (this.currentSpeed == 0) {
            this.started = false;
            System.out.println(TURN_OFF);
        } else {
            System.out.println(UNABLE_TO_TURN_OFF);
        }
    }

    /**
     * Show current data of the vehicle.
     *
     * @return String with the data of the vehicle.
     */
    @Override
    public String toString() {
        return this.started ? String.format("Current speed of the scooter: %d km/h", this.currentSpeed) : "The scooter is Off.";
    }
}

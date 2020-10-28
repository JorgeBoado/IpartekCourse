package UF2404.Recursos.E10_Interfaces.Interface;

import UF2404.Utilidades.ConsoleColors;

public interface Vehicle {
    String UNABLE_TO_TURN_OFF=ConsoleColors.RED+ "Can't turn off while the vehicle isn't stopped."+ConsoleColors.RESET;
    String UNABLE_TO_SPEED_UP=ConsoleColors.RED+ "Can't speed up while the vehicle is turn off."+ConsoleColors.RESET;
    String UNABLE_TO_BRAKE=ConsoleColors.RED+ "Can't brake while the vehicle is turn off."+ConsoleColors.RESET;
    String REACH_MAX_SPEED= ConsoleColors.PURPLE+ "Can't go faster, you reach the limit."+ConsoleColors.RESET;
    String REACH_MIN_SPEED=ConsoleColors.PURPLE+"Want to go backwards or what?"+ConsoleColors.RESET;
    String TURN_ON=ConsoleColors.GREEN+"Here we go!"+ConsoleColors.RESET;
    String TURN_OFF=ConsoleColors.GREEN+"The vehicle is off."+ConsoleColors.RESET;
    String BRAKE=ConsoleColors.BLUE+ "Stepped on the brake"+ConsoleColors.RESET;
    String SPEED_UP=ConsoleColors.BLUE_BOLD_BRIGHT+ "Stepped on the gas"+ConsoleColors.RESET;

    int MAX_CAR_SPEED = 150;
    int MAX_BIKE_SPEED = 50;
    int MAX_SCOOTER_SPEED = 80;
    int MIN_SPEED = 0;


    /**
     * Turn On the vehicle.
     */
    void turnOn();

    /**
     * Increase the speed of the vehicle until it reaches the limit.
     *
     * @param speedIncrement Integer the speed you want to increase.
     */
    void speedUp(int speedIncrement);

    /**
     * Decrease the speed of the vehicle until it reaches the limit.
     *
     * @param speedDecrease Integer the speed you want to decrease.
     */
    void brake(int speedDecrease);

    /**
     * Turn Off the vehicle.
     */
    void turnOff();
}

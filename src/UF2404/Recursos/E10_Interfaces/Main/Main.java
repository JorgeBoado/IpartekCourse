package UF2404.Recursos.E10_Interfaces.Main;

import UF2404.Recursos.E10_Interfaces.Classes.Bike;
import UF2404.Recursos.E10_Interfaces.Classes.Car;
import UF2404.Recursos.E10_Interfaces.Classes.Scooter;

public class Main {
    public static void main(String[] args) {
        System.out.println("*************Car*************");
        Car c = new Car();
        c.turnOff();
        c.turnOn();
        System.out.println(c.toString());
        c.speedUp(120);
        c.speedUp(120);
        System.out.println(c.toString());
        c.turnOff();
        c.brake(120);
        c.brake(120);
        c.turnOff();
        System.out.println(c.toString());
        c.speedUp(50);
        c.brake(50);
        System.out.println();
        System.out.println("*************Bike*************");
        Bike b = new Bike();
        b.turnOff();
        b.turnOn();
        System.out.println(b.toString());
        b.speedUp(120);
        b.speedUp(120);
        System.out.println(b.toString());
        b.turnOff();
        b.brake(120);
        b.brake(120);
        b.turnOff();
        System.out.println(b.toString());
        b.speedUp(50);
        b.brake(50);
        System.out.println();
        System.out.println("*************Scooter*************");
        Scooter s = new Scooter();
        s.turnOff();
        s.turnOn();
        System.out.println(s.toString());
        s.speedUp(120);
        s.speedUp(120);
        System.out.println(s.toString());
        s.turnOff();
        s.brake(120);
        s.brake(120);
        s.turnOff();
        System.out.println(s.toString());
        s.speedUp(50);
        s.brake(50);

    }
}

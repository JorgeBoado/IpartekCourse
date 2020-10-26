package UF2404.POJO;

import java.util.ArrayList;

//NOTTODO -Ejercicio 06 Falta por especificar

public class Patient {
    private double height;
    private double weight;
    private boolean flatFeet;
    private ArrayList<Integer> error;

    public Patient() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 1.6) {
            this.setError(1);
        }
        if (height > 2.1) {
            this.setError(2);
        }
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < (double) 35) {
            this.setError(3);
        }
        if (weight > (double) 160) {
            this.setError(4);
        }
        this.weight = weight;
    }

    public boolean isFlatFeet() {
        return flatFeet;
    }

    public void setFlatFeet(boolean flatFeet) {
        if (flatFeet) {
            this.setError(5);
        }
        this.flatFeet = flatFeet;
    }

    public ArrayList<Integer> getError() {
        return error;
    }

    public void setError(int i) {
        this.error.add(i);
    }
}

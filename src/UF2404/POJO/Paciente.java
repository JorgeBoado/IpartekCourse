package UF2404.POJO;

import java.util.ArrayList;

//NOTTODO -Ejercicio 06 Falta por especificar

public class Paciente {
    private double altura;
    private double peso;
    private boolean piesPlanos;
    private ArrayList<Integer> error;

    public Paciente() {
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 1.6) {
            this.setError(1);
        }
        if (altura > 2.1) {
            this.setError(2);
        }
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < (double) 35) {
            this.setError(3);
        }
        if (peso > (double) 160) {
            this.setError(4);
        }
        this.peso = peso;
    }

    public boolean isPiesPlanos() {
        return piesPlanos;
    }

    public void setPiesPlanos(boolean piesPlanos) {
        if (piesPlanos) {
            this.setError(5);
        }
        this.piesPlanos = piesPlanos;
    }

    public ArrayList<Integer> getError() {
        return error;
    }

    public void setError(int i) {
        this.error.add(i);
    }
}

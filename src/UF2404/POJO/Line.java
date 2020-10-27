package UF2404.POJO;

import UF2404.Abstract.GraphicObject;

public class Line extends GraphicObject {
    int length;
    /**
     * Implement the father's abstract method.
     */
    @Override
    public void paint() {
        System.out.println("Dibujamos una linea de longitud " + length);
    }
}

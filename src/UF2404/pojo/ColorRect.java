package UF2404.pojo;

import UF2404.Abstract.Rect;

public final class ColorRect extends Rect {
    private String color;

    @Override
    protected void paint() {
        System.out.println("Dibujo un rectangulo de color: " + color);
    }
}

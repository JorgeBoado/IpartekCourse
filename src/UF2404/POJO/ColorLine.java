package UF2404.POJO;

/**
 * The sons will end here, so we'll put the final attr.
 */
public final class ColorLine extends Line {
    private String color;

    @Override
    public void paint() {
//        super.paint();
        System.out.println("Dibujo Linea de color es " + color);
    }
}

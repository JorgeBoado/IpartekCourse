package UF2404.Abstract;

public abstract class Rect extends GraphicObject {
    private int side;
    private int height;

    int calculateArea(){
        return getX()*getY()*side*height;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

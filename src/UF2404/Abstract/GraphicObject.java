package UF2404.Abstract;

public abstract class GraphicObject {
    //Position X and Y of the Graphical Object
    private int x;
    private int y;


    /**
     * All graphical objects that extends will have the same movement.
     *
     * @param x New X position.
     * @param y New Y position.
     */
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Cuz idk what will do my sons I'll declare this method as abstract.
     */
    protected abstract void paint();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

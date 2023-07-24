package WorkingWithAbstraction_lab.PointInRectangle;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean greaterOrEqual(Point other){
        return x>= other.x && y>= other.y;

    }

    public boolean lessOrEqual(Point other){
        return x<= other.x && y<= other.y;
    }
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

package Lista4;

public class Point {
    public int x = 0, y = 0;
  
    public Point(int x2, int y2) {
        this.x = x2;
        this.y = y2;
    }
    public int getX() { return x; }
    public int getY() { return y; }
  
    public void setX(int x) { 
        this.x = x; 
    }
    public void setY(int y) { 
        this.y = y; 
    }
  
    public void moveBy(int dx, int dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
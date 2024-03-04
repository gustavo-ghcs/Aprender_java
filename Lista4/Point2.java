package Lista4;

public class Point2 {

    // Atributos privados
    protected int x = 0;
    protected int y = 0;
  
    // Construtor com validação
    public Point2(int x, int y) {
      if (x < 0 || x > 400) {
        throw new IllegalArgumentException("Valor de X inválido: " + x);
      }
      if (y < 0 || y > 400) {
        throw new IllegalArgumentException("Valor de Y inválido: " + y);
      }
      this.x = x;
      this.y = y;
    }
  
    // Métodos de acesso (getters)
    public int getX() {
      return x;
    }
  
    public int getY() {
      return y;
    }
  
    // Métodos de modificação (setters) com validação
    public void setX(int x) {
      if (x < 0 || x > 400) {
        throw new IllegalArgumentException("Valor de X inválido: " + x);
      }
      this.x = x;
    }
  
    public void setY(int y) {
      if (y < 0 || y > 400) {
        throw new IllegalArgumentException("Valor de Y inválido: " + y);
      }
      this.y = y;
    }
  
    // Métodos com validação para manter a invariante de classe
    public void moveBy(int dx, int dy) {
      int newX = x + dx;
      int newY = y + dy;
      if (newX < 0 || newX > 400 || newY < 0 || newY > 400) {
        throw new IllegalStateException("Movimento resultaria em coordenadas inválidas");
      }
      x = newX;
      y = newY;
    }
  
    // Sobrescrita do método equals para comparação de pontos
    @Override
    public boolean equals(Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof Point2)) {
        return false;
      }
      Point2 other = (Point2) obj;
      return this.x == other.x && this.y == other.y;
    }
  
    // Sobrescrita do método toString para representação textual
    @Override
    public String toString() {
      return "(" + x + ", " + y + ")";
    }
  }
  

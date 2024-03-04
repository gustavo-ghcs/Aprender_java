package Lista4;

public class Point1 {

    // Atributos privados
    private int x = 0, y = 0;
  
    // Construtor com validação
    public Point1(int x, int y) {
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
  }

  
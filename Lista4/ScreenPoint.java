package Lista4;

public class ScreenPoint extends Point2 {

    public ScreenPoint(int x, int y) {
      super(x, y);
      validateCoordinates();
    }
  
    // Valida as coordenadas para a tela (0-300)
    private void validateCoordinates() {
      if (x < 0 || x > 300 || y < 0 || y > 300) {
        throw new IllegalArgumentException("Coordenadas de tela inválidas: (" + x + ", " + y + ")");
      }
    }
  
    // Move o ponto na tela, garantindo a invariante
    @Override
    public void moveBy(int dx, int dy) {
      super.moveBy(dx, dy);
      validateCoordinates();
    }
  }
  
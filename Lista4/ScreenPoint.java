package Lista4;

public class ScreenPoint extends Point {
  public ScreenPoint(int x, int y) {
    super(x, y);
    enforceInvariant();
  }

  @Override
  public void setX(int x) {
    super.setX(x);
    enforceInvariant();
  }

  @Override
  public void setY(int y) {
    super.setY(y);
    enforceInvariant();
  }

  @Override
  public void moveBy(int dx, int dy) {
    super.moveBy(dx, dy);
    enforceInvariant();
  }

  private void enforceInvariant() {
    x = Math.max(0, Math.min(x, 300));
    y = Math.max(0, Math.min(y, 300));
  }
}

import javax.swing.*;
import java.awt.*;

public class Screen extends JPanel {

  MyPolygon polygon;

  Screen() {
    polygon = new MyPolygon(new int[]{10, 200, 10}, new int[]{10, 200, 400}, Color.BLUE);

  }

  @Override
  public void paintComponent(Graphics g) {
    polygon.draw(g);
  }
}

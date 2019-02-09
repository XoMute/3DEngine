import java.awt.*;

public class MyPolygon {

  Polygon polygon;
  Color color;

  MyPolygon(int[] x, int[] y, Color color) {
    polygon = new Polygon();
    this.color = color;
    polygon.xpoints = x;
    polygon.ypoints = y;
    polygon.npoints = x.length;
  }

  void draw(Graphics g) {
    g.drawPolygon(polygon);
    g.setColor(color);
  }
}

import javax.swing.*;
import java.awt.*;

public class Engine extends JFrame {

  static JFrame F = new Engine();
  Screen screen = new Screen();

  Engine() {
    add(screen);
    setUndecorated(true);
    setSize(Toolkit.getDefaultToolkit().getScreenSize());
    setVisible(true);
  }

  public static void main(String[] args) {
  }
}

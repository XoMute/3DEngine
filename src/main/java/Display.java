import graphics.Render;

import javax.swing.*;
import java.awt.*;

public class Display extends Canvas implements Runnable{

  public static final long serialVersionUID = 1L;

  public static final int WIDTH = 800;
  public static final int HEIGHT = 500;
  public static final String TITLE = "3D Engine";

  private Thread thread;
  private boolean running = false;
  private Render render;

  public Display() {
    render = new Render(WIDTH, HEIGHT);
  }

  private void start() {
    if (running) return;

    running = true;
    thread = new Thread(this);
    thread.start();
  }

  private void stop() {
    if (!running) return;

    running = false;
    try {
      thread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
      System.exit(-1);
    }
  }

  @Override
  public void run() {
    while (running) {

      tick();
      render();
    }
  }

  private void tick() {

  }

  private void render() {

  }

  public static void main(String[] args) {
    Display display = new Display();
    JFrame frame = new JFrame();
    frame.add(display);
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(WIDTH, HEIGHT);
    frame.setLocationRelativeTo(null);
    frame.setTitle(TITLE);
    frame.setResizable(false);
    frame.setVisible(true);

    display.start();
  }


}

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.BorderLayout;

public class gui {

  public static void createFrame() {
    JFrame newFrame = new JFrame("suicide");

    newFrame.setContentPane(new DrawPane());
    newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    newFrame.setSize(400, 400);

    JLabel label = new JLabel("Hello labels!");
    newFrame.add(label, BorderLayout.SOUTH);

    newFrame.setVisible(true);
  }   

  static class DrawPane extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.fillRect(20, 20, 100, 200); // Draw on g here e.g.
    }
  }

  public static void main(String[] args) {
    createFrame();
  }
}
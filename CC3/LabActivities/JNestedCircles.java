
import javax.swing.*;
import java.awt.*;
public class JNestedCircle extends JFrame {
    @Override
    public void paint(Graphics g) {
        //Size of X Y Width and Height Values
        int x = 250;
        int y = 250;
        int w = 10;
        int h = 10;
        super.paint(g);

        // Draw each oval, larger than the previous. i < 15 so it will have 15 ovals
        // With random generated Colors
        for (int i = 0; i < 15; ++i) {
            g.setColor(new Color(
                    (int) (Math.random() * 255),
                    (int) (Math.random() * 255),
                    (int) (Math.random() * 255)));
            g.drawOval(x, y, w, h);
            
            // Variable increase will serve as a distance divider 
            // that will Increase its divider by 25 pixels
            int increase = i + 25;
            w += increase;
            h += increase;
            x -= increase / 2;
            y -= increase / 2;
        }
    }
    public static void main(String[] args) {
        JNestedCircle  jframe  = new JNestedCircle ();
        jframe.setTitle("JNestedCircle");
        jframe.setSize(520, 505);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
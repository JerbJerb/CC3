
import javax.swing.*;
import java.awt.*;

public class JNestedBoxes extends JFrame {
    @Override
    public void paint(Graphics a) {
        
        int x = 255;
        int y = 255;
        int w = 20;
        int h = 20;
        super.paint(a);
        
        // Draw each box, larger than the previous. i < 8 so it will have 8 Boxes
        // With random generated Colors
        for (int i = 0; i < 8; ++i) {
            a.setColor(new Color(
                    (int)(Math.random()*255),
                    (int)(Math.random()*255),
                    (int)(Math.random()*255)));
            a.drawRect(x, y, w, h);
            
            // Variable increase will serve as a distance divider 
            // and Increases the distance by 60 pixels
            int increase = i + 60;
            w += increase;
            h += increase;
            x -= increase / 2;
            y -= increase / 2;
        }
    }
    public static void main(String[] args) {
        JNestedBoxes frame = new JNestedBoxes();
        frame.setTitle("JNested Boxes");
        frame.setSize(525, 525);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
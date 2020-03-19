
import java.awt.*;
import javax.swing.*;

public class JDiagonalLines extends JFrame {

    @Override
    public void paint(Graphics g) {
        // Starting point and End point
        int x = 40, xEnd = 40;
        int y = 40, yEnd = 40;
        
        //Incrementation
        final int INC = 20;
        
        int w = 480, h = 480;
        super.paint(g);
        //rectangle as a container
        g.drawRect(x, y, w, h);
        
        //Longest point from width to the y axis
        int longestPoint = w + y;
        
        //Upper Set of Diagonal Lines
        for(y = 40; y < longestPoint;) {
            g.setColor(new Color(
                    (int)(Math.random()*255),
                    (int)(Math.random()*255),
                    (int)(Math.random()*255)));
            g.drawLine(x, y, xEnd, yEnd);
            y += INC;
            xEnd += INC;
        }

        //Lower Set of Diagonal Lines
        for(x = 40; x < longestPoint;) {
            g.setColor(new Color(
                    (int)(Math.random()*255),
                    (int)(Math.random()*255),
                    (int)(Math.random()*255)));
            g.drawLine(x, y, xEnd, yEnd);
            x += INC;
            yEnd += INC;
        }
    }

    public static void main(String[] args) {
        JDiagonalLines frame = new JDiagonalLines();
        frame.setTitle("JDiagonal Lines");
        frame.setSize(550, 550);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
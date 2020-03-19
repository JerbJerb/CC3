import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import javax.swing.JComboBox;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Megaman extends Panel implements ActionListener {

    static String colors[] = {"RED", "GREEN", "BLUE", "MAGENTA", "CYAN", "YELLOW", "DARK_GRAY", "LIGHT_GRAY", "WHITE", "GRAY", "ORANGE", "PINK"};
    static Color c = Color.white;
    static String name = "";
    static JComboBox cols;

    public Megaman() {
        this.setBackground(new Color(240, 240, 240));
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);
        Color Skin = new Color(255, 218, 195);
        Color Blue = c.darker();
        Color lightBlue = c.brighter();

        //name
        g.setColor(Color.BLACK);
        g.setFont(new Font("Consolas", Font.BOLD, 30));
        Graphics2D g2d = (Graphics2D) g.create();
        FontMetrics fm = g2d.getFontMetrics();
        g.drawString(name, (getWidth() - fm.stringWidth(name)) / 2, 75);

        setBackground(Color.WHITE);
        //Line Art
        g.setColor(Color.BLACK);
        //Head
        g.fillRect(180, 320, 20, 20);
        g.fillRect(160, 260, 20, 60);
        g.fillRect(180, 220, 20, 40);
        g.fillRect(200, 200, 20, 20);
        g.fillRect(220, 180, 60, 20);
        g.fillRect(260, 160, 60, 20);
        g.fillRect(320, 180, 20, 20);
        g.fillRect(340, 200, 20, 20);
        g.fillRect(280, 200, 20, 20);
        g.fillRect(300, 220, 20, 40);
        g.fillRect(300, 220, 80, 20);
        g.fillRect(320, 260, 40, 20);
        g.fillRect(380, 240, 20, 140);
        g.fillRect(360, 360, 60, 20);
        g.fillRect(260, 360, 80, 20);
        g.fillRect(340, 380, 20, 20);
        g.fillRect(240, 400, 100, 20);
        g.fillRect(220, 380, 20, 20);
        g.fillRect(200, 360, 20, 20);
        //Right Eye
        g.fillRect(280, 300, 40, 40);
        //Left Eye
        g.fillRect(340, 300, 20, 40);
        //Some Other Parts
        g.fillRect(180, 420, 20, 100);
        g.fillRect(160, 440, 20, 60);
        g.fillRect(140, 440, 20, 20);
        g.fillRect(100, 500, 60, 20);
        g.fillRect(80, 420, 20, 80);
        g.fillRect(100, 380, 20, 40);
        g.fillRect(120, 360, 40, 20);
        g.fillRect(160, 340, 40, 20);
        g.fillRect(420, 380, 20, 40);
        g.fillRect(440, 420, 20, 80);
        g.fillRect(380, 500, 60, 20);
        g.fillRect(360, 440, 20, 60);
        g.fillRect(380, 440, 20, 20);
        g.fillRect(340, 420, 20, 100);
        g.fillRect(360, 520, 20, 20);
        g.fillRect(380, 540, 20, 40);
        g.fillRect(400, 560, 20, 20);
        g.fillRect(420, 580, 40, 20);
        g.fillRect(460, 600, 20, 40);
        g.fillRect(300, 620, 160, 20);
        g.fillRect(300, 580, 20, 40);
        g.fillRect(280, 560, 20, 20);
        g.fillRect(260, 540, 20, 20);
        g.fillRect(240, 560, 20, 20);
        g.fillRect(220, 580, 20, 20);
        g.fillRect(60, 600, 20, 20);
        g.fillRect(60, 620, 180, 20);
        g.fillRect(220, 580, 20, 40);
        g.fillRect(80, 580, 40, 20);
        g.fillRect(120, 560, 40, 20);
        g.fillRect(140, 540, 20, 20);
        g.fillRect(160, 520, 20, 20);
        //Color of the Face
        g.setColor(Skin);
        g.fillRect(240, 280, 20, 20);
        g.fillRect(220, 300, 20, 60);
        g.fillRect(220, 340, 40, 20);
        g.fillRect(240, 340, 20, 60);
        g.fillRect(240, 380, 100, 20);
        g.fillRect(340, 360, 20, 20);
        g.fillRect(360, 340, 20, 20);
        g.fillRect(320, 300, 20, 60);

        g.setColor(Blue);
        //Helmet
        g.fillRect(220, 360, 20, 20);
        g.fillRect(200, 220, 20, 140);
        g.fillRect(220, 200, 20, 100);
        g.fillRect(240, 200, 40, 80);
        g.fillRect(280, 220, 20, 60);
        g.fillRect(300, 260, 20, 20);
        g.fillRect(320, 280, 40, 20);
        g.fillRect(360, 240, 20, 40);
        //Some Other Parts
        g.fillRect(80, 600, 140, 20);
        g.fillRect(120, 580, 100, 20);
        g.fillRect(160, 560, 60, 20);
        g.fillRect(160, 540, 40, 20);
        g.fillRect(200, 480, 140, 40);
        g.fillRect(220, 520, 80, 20);
        g.fillRect(360, 540, 20, 20);
        g.fillRect(320, 560, 60, 20);
        g.fillRect(320, 580, 100, 20);
        g.fillRect(320, 600, 140, 20);
        g.fillRect(120, 380, 20, 20);
        g.fillRect(120, 400, 40, 40);
        g.fillRect(100, 420, 40, 40);
        g.fillRect(100, 460, 60, 40);
        g.fillRect(400, 380, 20, 20);
        g.fillRect(380, 400, 40, 40);
        g.fillRect(400, 420, 40, 40);
        g.fillRect(380, 460, 60, 40);
        g.setColor(lightBlue);
        //Helmet Highlights
        g.fillRect(180, 260, 20, 60);
        g.fillRect(320, 240, 40, 20);
        g.fillRect(300, 200, 40, 20);
        g.fillRect(280, 180, 40, 20);
        //Some Other Parts
        g.fillRect(200, 540, 60, 20);
        g.fillRect(180, 520, 40, 20);
        g.fillRect(220, 560, 20, 20);
        g.fillRect(300, 520, 60, 20);
        g.fillRect(280, 540, 80, 20);
        g.fillRect(300, 560, 20, 20);
        g.fillRect(200, 420, 140, 60);
        g.fillRect(200, 400, 40, 20);
        g.fillRect(200, 380, 20, 20);
        g.fillRect(140, 380, 60, 20);
        g.fillRect(160, 360, 20, 80);
        g.fillRect(180, 360, 20, 60);
        g.fillRect(340, 400, 20, 20);
        g.fillRect(360, 380, 20, 60);
        g.fillRect(380, 380, 20, 20);
    }

    public static void main(String[] args) {
//Colooors

        name = JOptionPane.showInputDialog("Enter Name of Character.");
        String color = (String) JOptionPane.showInputDialog(null, "Choose a color for your character", "Character Color", JOptionPane.QUESTION_MESSAGE, null, colors, colors[0]);
        try {
            Field field = Class.forName("java.awt.Color").getField(color);
            c = (Color) field.get(null);
        } catch (Exception e) {
            c = null; // Not defined
        }

        JFrame frame = new JFrame("MegaMan");
        frame.setLayout(new BorderLayout());
        Megaman panel = new Megaman();

        cols = new JComboBox(colors);
        cols.addActionListener(panel);

        frame.add(panel, BorderLayout.CENTER);
        frame.add(cols, BorderLayout.SOUTH);
        frame.setVisible(true);
        frame.setSize(580, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        String s;
        s = (String) cols.getSelectedItem();
        try {
            Field field = Class.forName("java.awt.Color").getField(s);
            c = (Color) field.get(null);
        } catch (Exception ex) {
            c = null; // Not defined
        }
        repaint();
    }
}

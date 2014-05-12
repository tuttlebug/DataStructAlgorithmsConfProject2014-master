import java.util.* ;
import java.io.*;
import javax.swing.*;    // JPanel
import java.awt.*;       // Graphics, Graphics2D, Color
import java.awt.geom.*;  // Ellipse2D
import java.awt.event.*; // MouseListener, MouseMotionListener, MouseEvent, KeyListener, KeyEvent

/**
 * TO ADD/IMPLEMENT:
 * [] change into a sublclass
 */
public class CollisionBox extends JPanel {
    
    private Rectangle2D.Double box;
    
    public CollisionBox(int x1, int y1, int width, int height) {
        this.box = new Rectangle2D.Double(x1, y1, width, height);
        // makes background and lines invisible
        setOpaque(false);
//        setVisible(false);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D pen = (Graphics2D) g;
        pen.setColor(Color.BLUE);
        pen.draw(this.box);
        // makes background transparent
        g.setColor(getBackground());
    }
    
    public Rectangle2D.Double getBox() {
        return this.box;
    }
}
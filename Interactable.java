/**
 * Super class for: Item, NPC, Enemy
 */

import java.io.IOException;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.geom.*;
import java.awt.Image;

public class Interactable implements LoadImage {
    
    // instance variables
    protected String name;
    protected String imageFile;
    protected Image image;
    protected double width, height;
    protected Rectangle2D.Double box;
    protected int[] coords;
    
    // constructor
    public Interactable(String name, String imageFile) {
        this.name = name;
        this.imageFile = imageFile; 
        this.box = new Rectangle2D.Double();
        this.coords = new int[2];
    }
    
    // ------------ Image ------------ \\
    public void loadImage() throws IOException {
        this.image = ImageIO.read(new File(this.imageFile));
        this.width = this.image.getWidth(null);
        this.height = this.image.getHeight(null);
    }
    
    public Image sendImage() {
        return this.image;
    }
    
    
    // ------------ Box ------------ \\
    public void loadBox(double x, double y) {
        this.box.setRect(x,  y, this.width, this.height);
        this.coords[0] = (int) x;
        this.coords[1] = (int) y;
    }
    
    public void moveBox() {
        this.box.setRect(this.coords[0],  this.coords[1], this.width, this.height);
    }
    
    public Rectangle2D.Double sendBox() {
        return this.box;
    }
    
    // ------------ Width & Height & Coords ------------ \\
    public double getWidth() {
        return this.width;
    }
    
    public double getHeight() {
        return this.height;
    }
    
    public int getX() {
        return this.coords[0];
    }
    
    public int getY() {
        return this.coords[1];
    }
    
    // ------------ Name ------------ \\
    public String getName() {
        return this.name;
    }
    
    // ------------ toString ------------ \\
    public String toString() {
        return String.format("NAME: %s, WIDTH: %f, HEIGHT: %f\n", this.name, this.width, this.height);
    }
}
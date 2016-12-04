package FinalProject;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author rg3
 */
public class Box extends JComponent {
    private int posX, posY, value;
    
    public Box(int x, int y, int v) {
        posX = x; posY = y; value = v;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(posX, posY, 2, value*2);
    }
}

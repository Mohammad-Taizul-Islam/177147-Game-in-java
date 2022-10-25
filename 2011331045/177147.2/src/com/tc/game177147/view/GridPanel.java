package com.tc.game177147.view;

import java.awt.Graphics;
 
import javax.swing.JPanel;
 
import com.tc.game177147.model.Game177147Model;
 
public class GridPanel extends JPanel {
 
    private static final long   serialVersionUID    = 
            4019841629547494495L;
     
    private Game177147Model model;
     
    private GameOverImage image;
     
    public GridPanel(Game177147Model model) {
        this.model = model;
        this.setPreferredSize(model.getPreferredSize());
        this.image = new GameOverImage(model);
        this.image.run();
    }
 
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        model.draw(g);
         
        if (model.isGameOver()) {
            g.drawImage(image.getImage(), 0, 0, null);
        }
    }
}
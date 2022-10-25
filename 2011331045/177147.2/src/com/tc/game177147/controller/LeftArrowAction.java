package com.tc.game177147.controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
 
import com.tc.game177147.model.Game177147Model;
import com.tc.game177147.view.Game177147Frame;
 
public class LeftArrowAction extends AbstractAction {
 
    private static final long serialVersionUID = 863330348471372562L;
 
    private Game177147Frame frame;
     
    private Game177147Model model;
 
    public LeftArrowAction(Game177147Frame frame, Game177147Model model) {
        this.frame = frame;
        this.model = model;
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
        if (model.isArrowActive()) {
            if (model.moveCellsLeft()) {
                if (model.isGameOver()) {
                    model.setArrowActive(false);
                } else {
                    model.addNewCell();
                     
                    frame.repaintGridPanel();
                    frame.updateScorePanel();
                }
            }
        }
    }
 
}

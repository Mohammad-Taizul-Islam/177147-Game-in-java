package com.tc.game177147.controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
 
import com.tc.game177147.model.Game177147Model;
import com.tc.game177147.view.Game177147Frame;
 
public class UpArrowAction extends AbstractAction {
 
    private static final long serialVersionUID = -2851527479086591525L;
     
    private Game177147Frame frame;
     
    private Game177147Model model;
 
    public UpArrowAction(Game177147Frame frame, Game177147Model model) {
        this.frame = frame;
        this.model = model;
    }
 
    @Override
    public void actionPerformed(ActionEvent event) {        
        if (model.isArrowActive()) {
            if (model.moveCellsUp()) {
                if (model.isGameOver()) {
                    model.setArrowActive(false);
                } else {
                    addNewCell();
                }
            }
        }
    }
 
    private void addNewCell() {
        model.addNewCell();
         
        frame.repaintGridPanel();
        frame.updateScorePanel();
    }
 
 
 
}
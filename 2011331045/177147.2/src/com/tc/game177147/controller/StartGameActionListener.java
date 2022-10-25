package com.tc.game177147.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import com.tc.game177147.model.Game177147Model;
import com.tc.game177147.view.Game177147Frame;
 
public class StartGameActionListener implements ActionListener {
     
    private Game177147Frame frame;
     
    private Game177147Model model;
     
    public StartGameActionListener(Game177147Frame frame, 
            Game177147Model model) {
        this.frame = frame;
        this.model = model;
    }
 
    @Override
    public void actionPerformed(ActionEvent event) {
        model.setHighScores();
        model.initializeGrid();
        model.setArrowActive(true);
        model.addNewCell();
        model.addNewCell();
         
        frame.repaintGridPanel();
        frame.updateScorePanel();
    }
 
}
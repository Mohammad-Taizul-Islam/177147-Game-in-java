package com.tc.game177147;



/* Main class*/


import javax.swing.SwingUtilities;

import com.tc.game177147.model.Game177147Model;
import com.tc.game177147.view.Game177147Frame;
 
public class Game177147 implements Runnable {
 
    @Override
    public void run() {
        new Game177147Frame(new Game177147Model());
    }
     
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Game177147());
    }
 
}
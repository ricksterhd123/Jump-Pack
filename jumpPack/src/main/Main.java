/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import ui.logIn;

/**
 *
 * @author nicekor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logIn().setVisible(true);
            }
        });
        
    }
    
}

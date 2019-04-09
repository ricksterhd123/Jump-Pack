package main;
import ui.logIn;
/**
 *
 * @author nicekor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        // invoke GUI in separate thread
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logIn().setVisible(true);
               
            }
        });
        
    }
    
}

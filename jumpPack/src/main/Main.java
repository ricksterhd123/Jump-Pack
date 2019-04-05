package main;
import java.io.IOException;
import ui.logIn;
import ui.HomePage;
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
                
                // Throws IOException 
                try {
                    new HomePage().setVisible(true);
                }catch (IOException e){
                    // Get exception message
                    // TODO: Add alert popup
                    System.out.println(e.getMessage());
                }
            }
        });
        
    }
    
}

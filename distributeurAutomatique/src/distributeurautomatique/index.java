
package distributeurautomatique;

import javax.swing.JButton;
import javax.swing.UIManager;

/**
 * @author rafik et Mohaned 
 */

public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try { 
          UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } catch (Exception ex) { 
            ex.printStackTrace(); 
        }
        InterfaceGraphique intUser = new InterfaceGraphique();
        //intUser.setVisible(true);
        intUser.pageDaccueil();
        
    }
}

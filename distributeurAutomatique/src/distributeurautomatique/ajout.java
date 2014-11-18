
package distributeurautomatique;

/*
 * @author rafik et Mohaned
 */
   

public class Ajout {
    
    public static int cinq = 5;
    public static int dix = 10;
    private static int vingt = 20;

    public Ajout(){
        
    }
    
    
    
    /*
     * Les Getters  
     */

    public static int getCinq() {
        return cinq;
    }

    public static int getDix() {
        return dix;
    }

    public static int getVingt() {
        return vingt;
    }
    
    /*
     * Les Setters  
     */
    
    public static void setCinq(int cinq) {
        Ajout.cinq = cinq;
    }

    public static void setDix(int dix) {
        Ajout.dix = dix;
    }

    public static void setVingt(int vingt) {
        Ajout.vingt = vingt;
    }
    
    
    
    
}

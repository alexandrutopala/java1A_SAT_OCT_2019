public class Cerc {
    Punct centru;
    int r;
    
    Cerc(Punct centru, int r) {
        this.centru = centru;
        this.r = r;
    }
    
    
    double getArie() {
        return Math.PI * r * r;
    }
    
    boolean isInside(Punct p) {
        /*if (p.getDistance(centru) < r) {
            return true;
        } else {
            return false;
        }*/
        
        return p.getDistance(centru) < r;
    }
    
    
    
}







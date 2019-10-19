public class Punct {
    int x;
    int y;
    
    Punct(int x, int y) {
        
        this.x = x;
        this.y = y;
    }
    
    double getDistance(Punct p) {
        return Math.sqrt(
            (this.x - p.x) * (this.x - p.x) +
            (this.y - p.y) * (this.y - p.y)
        );
    }
    
    
    
    
    
    
    
    
}




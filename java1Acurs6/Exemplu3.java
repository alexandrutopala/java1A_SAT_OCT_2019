public class Exemplu3 {
    public static void main(String [] args) {
        DBConnection con = null;
        
        
        
        try {
            con = new DBConnection(); 
            
            // ...
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
}
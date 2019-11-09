public class Exemplu2 {
    public static void main(String [] args) {
        System.out.println("A");
        
        
        // incearca sa executi ce este in try, si indiferent
        // daca au aparut sau nu exceptii, executa blocul
        // finally
        try {
            m(2);
            
        } catch (MyRuntimeException | MyException e) { // prindem exceptiile de tipul
                                         // MyRuntimeException sau MyException folosind
                                         // sintaxa de multi-catch
                                       
            System.out.println("D");
        } catch (NullPointerException e) {
            System.out.println("F");
        } finally {
            System.out.println("C");
        }
        
        System.out.println("B");
    }
    
    // folosind throws declaram exceptiile propagate
    private static void m(int i) throws MyException {
        switch (i) {
            case 0 : 
                MyRuntimeException ex = new MyRuntimeException();
                throw ex;
                // System.out.println("Hello");
            case 1 : 
                throw new NullPointerException("null");
            case 2 : 
                throw new MyException();
        }
    }
}
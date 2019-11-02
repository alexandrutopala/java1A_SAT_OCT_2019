public class B { // outer
    
    public class B1 { // inner
    }
    
    
    static class B2 { // inner fata B, outer fata B21
        public class B21 { // inner fata de B2
        }
    }
    
    // clasa inner statica nu poate mosteni o clasa inner non-statica
    //static class B3 extends B1 {
    //}
    
}
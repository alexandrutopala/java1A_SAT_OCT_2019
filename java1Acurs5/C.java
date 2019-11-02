public class C {
    int x;
    
    public void m() {
        int y = 0;
        x = 1;
        class LocalaC {
            int x;
            public void m() {
                System.out.println(y);
                System.out.println(x); // se refera la x din LocalaC
                System.out.println(C.this.x); // se refera la x din C
            }
        }
        //y = 1; 
        x = 10;
    }
}
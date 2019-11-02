public class Angajat {
    String nume;
    int vechime;
    
    Angajat(String nume, int vechime) {
        
        this.nume = nume;
        this.vechime = vechime;
    }
    
    int getSalariu() {
        return 1000 * vechime;
    }
}
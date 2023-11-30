
package absztrakt;


public class Kor {
    double r;

    public Kor(double r) {
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public double terulet(){
        return Math.pow(r, 2) + Math.PI;
    }
    
    public void kiir(){
        System.out.println("Kör");
    }
}

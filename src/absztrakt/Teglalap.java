
package absztrakt;


public class Teglalap {
    double a, b;

    public Teglalap(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    public void kiir(){
        System.out.println("Téglalap");
    }
    
    public double terulet(){
        return a*b;
    }
}

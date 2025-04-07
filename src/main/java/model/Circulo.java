
package model;

public class Circulo {
    public double PI = 3.14159;
    public double raio;
    
    public Circulo(){
        this(0,0);
    }
    
    public Circulo(double PI, double raio){
       this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }
    
    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double getArea(){
       return this.PI * raio * raio;
    }
    
    
    
    
}

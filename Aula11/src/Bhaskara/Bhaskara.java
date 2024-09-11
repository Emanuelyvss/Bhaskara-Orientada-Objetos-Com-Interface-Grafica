
package Bhaskara;

public class Bhaskara {
    
    private double a;
    private double b;
    private double c;

    public Bhaskara() {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    
    public double delta () {
        
        double delta = Math.pow( this.getB(), 2)-4*this.getA()*this.getC();
                
      return delta;
      
    }
    
    public double x1 () {
      
        
          double x1 = (-this.getB() + Math.sqrt(this.delta()))/(2*this.getA());
          
      return x1;
      
       }
       
       public double x2 (){
           double x2 = (-this.getB()- Math.sqrt(this.delta()))/(2*this.getA());
           
      return x2;
       }
      }


   

package newpackage;

public class Raices {
    
    //atributos
    private double a;
    private double b;
    private double c;
    private double dis;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private void Respuesta(){
        
        double x1,x2;
        x1=(-b+Math.sqrt(Dis()))/2*a;
        x2=(-b+Math.sqrt(Dis()))/2*a;
        
        System.out.print("La soluion X1 es:"+x1);
        System.out.println("");
        System.out.print("La soluion X2 es:"+x2);
    }
    private void Respuesta1(){
        double x;
        x=-b/2*a;
        
    }
    private double Dis(){
        return dis=Math.pow(b, 2)-4*a*c;
    }
    
    private boolean Tiene_2_Raiz(){
        return Dis()>=0;
    }
   private boolean Tiene_1_RAIZ(){
        return Dis()==0;
    }
    public void Estructura(){
        if(Tiene_2_Raiz()){
            Respuesta();
        }
        else if(Tiene_1_RAIZ()){
            Respuesta1();
        }
        else{
            System.out.println("No hay respuesta");
        }
    }
    
    
}

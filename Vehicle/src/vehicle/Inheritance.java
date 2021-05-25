
package vehicle;

public class Inheritance {
    
    public static void main(String[] args){
        
        Cars figo = new Cars("Ford", "Figo", 2010, 202.45f, false);
        Cars innova = new Cars("Toyota", "Innova", 2012, 265.78f, false);
        Cars omni = new Cars("Maruti", "Omni", 2015, 326.8f, false);
        
        for(int i=0; i< 178; i++){
            figo.drive();
            figo.stop();
        }
        for(int j=0; j< 100; j++){
            innova.drive();
            innova.stop();
        }
        for(int k=0; k< 200; k++){
            omni.drive();
            omni.stop();
        }
        
        
        
        figo.printing();
        innova.printing();
        omni.printing();
        
        Planes boeing = new Planes("Boeing", "E5480", 2004, 678.43f, false);
        for(int i=0; i< 178; i++){
            if(!boeing.NeedsMaintenance){
                boeing.fly();
                boeing.land();
            }
            else{
                System.out.println("Plane cannot be restarted until it's repaired");
            }
        }
        
        boeing.printing();
        
    }
}

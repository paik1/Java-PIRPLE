
package vehicle;


public class Cars extends Vehicle {
    
    public boolean isDriving;
    
    public Cars(String Make, String Model, int Year, float Weight, boolean isDriving){
        super(Make, Model, Year, Weight);
        this.isDriving = isDriving;
    }
    
    public void drive(){
        if(TripsSinceMaintenance >= 100){
            NeedsMaintenance = true;
            repair();
        }
        this.isDriving = true;
    }
    
    public void stop(){
        if(this.isDriving){
            TripsSinceMaintenance++;
        }
        if(TripsSinceMaintenance >= 100){
            NeedsMaintenance = true;
        }
        this.isDriving = false;
    }
    
    public void repair(){
        TripsSinceMaintenance = 0;
        NeedsMaintenance = false;
    }
    
    @Override public void printing(){
        super.printing();
        System.out.println("TripsSinceMaintenance : "+TripsSinceMaintenance);
        System.out.println("NeedsMaintenance : "+NeedsMaintenance);
    }
    
    
}

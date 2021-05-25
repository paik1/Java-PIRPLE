package vehicle;

public class Planes extends Vehicle{

    public boolean isFlying;
    
    public Planes(String Make, String Model, int Year, float Weight, boolean isDriving){
        super(Make, Model, Year, Weight);
        this.isFlying = isDriving;
    }
    
    public void fly(){
        this.isFlying = true;
    }
    
    public void land(){
        if(this.isFlying){
            TripsSinceMaintenance++;
        }
        if(TripsSinceMaintenance >= 100){
            NeedsMaintenance = true;
        }
        this.isFlying = false;
    }
    
    @Override public void printing(){
        super.printing();
        System.out.println("TripsSinceMaintenance : "+TripsSinceMaintenance);
        System.out.println("NeedsMaintenance : "+NeedsMaintenance);
    }    
}

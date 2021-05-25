
package vehicle;

public class Vehicle {
    
    public boolean NeedsMaintenance = false;
    public int TripsSinceMaintenance = 0;
    
    public String Make;
    public String Model;
    public int Year;
    public float Weight;

    public Vehicle(String Make, String Model, int Year, float Weight){
        this.Make = Make;
        this.Model = Model;
        this.Year = Year;
        this.Weight = Weight;
    }
    
    public void printing(){
        System.out.println("Make : "+Make+"\nModel : "+Model+"\nYear : "+Year+"\nWeight : "+Weight);
    }
    
    
    
}

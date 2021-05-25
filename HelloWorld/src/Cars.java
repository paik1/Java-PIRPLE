public class Cars {
    public String model;
    
    public Cars(String model){
        this.model = model;
    }
    
    @Override
    public String toString(){
        return String.format("Model : %s", model);
    }
}

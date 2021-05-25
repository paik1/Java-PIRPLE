package timeadder;

final class Tuple
{   
    public int value3;
    public String label3;
 
    public Tuple(int value3, String label3) {
        this.value3 = value3;
        this.label3 = label3;
    }
    
    public void printer(){
        System.out.println("Value : "+this.value3);
        System.out.println("Label : "+this.label3);
    }
}


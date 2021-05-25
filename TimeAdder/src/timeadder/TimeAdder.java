package timeadder;



public class TimeAdder {
    
    public String[] labels_singular = {"second", "minute", "hour", "day"};
    public String[] labels_plural = {"seconds", "minutes", "hours", "days"};
    public int[] seconds = {1, 60, 3600, 86400};
    int timeInSeconds = 0;
    
    

    public static void main(String[] args) {
        TimeAdder t = new TimeAdder();
        Tuple z = t.timeAdder(12, "hours", 12, "hours");
        z.printer();
        
    }
    
    public Tuple timeAdder(int value1, String label1,int value2,String label2){
        if(Handler(value1, label1) > -1){
            timeInSeconds += Handler(value1, label1);
        }else{
            return new Tuple(0, "False");
        }
        if(Handler(value2, label2) > -1){
            timeInSeconds += Handler(value2, label2);
        }else{
            return new Tuple(0, "False");
        }
        
        if(timeInSeconds < 60){
            return new Tuple(timeInSeconds, "seconds");
        }
        else if(timeInSeconds%seconds[3]==0){
            timeInSeconds /= seconds[3];
            return new Tuple(timeInSeconds, "days");
        }
        else if(timeInSeconds%seconds[2]==0){
            timeInSeconds /= seconds[2];
            return new Tuple(timeInSeconds, "hours");
        }
        else if(timeInSeconds%seconds[1]==0){
            timeInSeconds /= seconds[1];
            return new Tuple(timeInSeconds, "minutes");
        } 
        return new Tuple(timeInSeconds, "seconds");
    }
    
    public int indexOfS(String[] array, String target){
        int len = array.length;
        int i =0;
        while(i<len){
            if(array[i].equals(target)){
                return i;
            }else{
                i++;
            }
        }
        return -1;
    }
    
    public int indexOfI(int[] array, int target){
        int len = array.length;
        int i =0;
        while(i<len){
            if(array[i]==target){
                return i;
            }else{
                i++;
            }
        }
        return -1;
    }
    
    public int Handler(int value, String label){
        if(value ==1 && (indexOfS(labels_singular, label) > -1)){
            return value;
        }
        else if(value > 1 && (indexOfS(labels_plural, label) > -1)){
            return value * seconds[indexOfS(labels_plural, label)];
        }
        else {
            return -1;
        }
    }
    
    
}

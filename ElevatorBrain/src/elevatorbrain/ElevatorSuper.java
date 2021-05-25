
package elevatorbrain;

import java.util.Arrays;

public class ElevatorSuper {
    public int currentFloor;
    public int[] Floors;
    
    public ElevatorSuper(int currentFloor){
        this.currentFloor = currentFloor;
    }
    
    public void up(int src, int dest){
        System.out.println("Going up from "+src+" floor to "+dest+" floor");
        currentFloor = dest;
    }
    
    public void down(int src, int dest){
        System.out.println("Going down from "+src+" floor to "+dest+" floor");
        currentFloor = dest;
    }
    
    public void liftMovement(ElevatorSuper s, int result){
        if(s.currentFloor < result){
            s.up(s.currentFloor, result);
        }
        else if(s.currentFloor == result){
            System.out.println("Lift B is currently on the same floor");
        }
        else{
            s.down(s.currentFloor, result);
        } 
    }
    
    public ElevatorSuper liftArrival(ElevatorSuper a, ElevatorSuper b, int result){
        if(result >= -1 && result <=10){
            switch(result){
                case -1:
                    a.liftMovement(a, result);
                    return a;
                case 10:
                    b.liftMovement(b, result);
                    return b;
                default:
                    if(!(Math.abs(a.currentFloor - result) >= Math.abs(b.currentFloor - result))){
                        a.liftMovement(a, result);
                        return a;
                    }else{
                        b.liftMovement(b, result);
                        return b;
                    }
                }            
            }
            else{
                System.out.println("ERROR:Floor number not recognized. Please enter again");
                return null;
            }
    }
    
    public void liftDeparture(ElevatorSuper lift, int dest){
        if(Arrays.asList(lift.Floors).contains(dest)){
            lift.liftMovement(lift, dest);
        }
        else {
            System.out.println("This Lift does not go to the selected floor. Please take another lift or try by going to other floors");
        }
    
    }
    
    public void openDoors(){
        System.out.println("Opening doors");
    }
    
    public void closeDoors(){
        System.out.println("Closing doors");
    }
    
    
}

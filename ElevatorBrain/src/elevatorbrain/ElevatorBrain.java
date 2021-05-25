
package elevatorbrain;

import java.util.*;


public class ElevatorBrain {

    /*
    A simple demo of the elevator brain can be seen by running the program 
    
    The functions useful for calling the lift and making it go to your destination are explained below
    */
    
    public static void main(String[] args) {
        
        Random r = new Random();
        /* Initialze the elevator A and B instances with random floors in the range(-1,9) for Elevator A and for Elevator B the range is (0 10)
        
        So after this the lift is in one of these floors and the value is displayed
        
        */
        ElevatorSuper a = new ElevatorA(r.nextInt(10-(-1))+(-1));
        ElevatorSuper b = new ElevatorB(r.nextInt(11-0));
        
        // I am taking theinput from user just for the demo purpose. In real life this value can be passed via a hardware controller
        Scanner reader = new Scanner(System.in);
        
        // Using while(true) so that the lifts are continuosly running

        while(true){
            System.out.println("Enter your current floor number:");
            int call = reader.nextInt();
            
            /*
            The employee when taking a lift first has to call the lift to the current floor.
            liftArrival method just does that. It makes sure that the nearest lift is called.
            It also takes care of the fact that only lift A goes to floor -1 and lift B goes to floor 10
            even if the other lift is close by. The method also returns the instance of the lift the 
            employee is taking so that it can be passed to the departure method
            */
            
            ElevatorSuper lift = a.liftArrival(a, b, call);
            
            // Opening doors;
            lift.openDoors();
            
            if(lift==null){
                System.exit(0);
            }
            
            System.out.println("Enter the floor number you want to go to:");
            int goTo = reader.nextInt();
            
            // closing doors
            lift.closeDoors();
            
            /* 
            For emergency button the code sent by the controller would be 101 and will be sent to one floor below. If it is currently in -1 then it will be sent to ground floor
            */
            if(goTo == 101){
                if(lift.currentFloor == -1){
                    lift.up(-1, 1);
                    lift.openDoors();
                    continue;
                }else{
                    lift.down(lift.currentFloor, (lift.currentFloor-1));
                    lift.openDoors();
                    continue;
                }
            }
            
            /*
            The departure methods takes the instance of the elevator requested by the employee and takes the same elevator to the requested floor
            Entering a value not part of the assigned floors of the lift, which in this case is variable 'goTo', simply asks you to take other elevator or move to different floor
            */
            a.liftDeparture(lift, goTo);
            
             
        }
    }
    
    
    
}

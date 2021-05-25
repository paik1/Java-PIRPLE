package elevatorbrain;

public class ElevatorA extends ElevatorSuper{
    
    public int[] Floors = {-1, 2, 3, 4, 5, 6, 7, 8, 9};
    
    public ElevatorA(int currentFloor){
        super(currentFloor);
        System.out.println("Elevator A is initialized and currently in "+currentFloor);
    }
    
    @Override public void up(int src, int dest){
        System.out.print("A: ");
        super.up(src, dest);        
    }
    
    @Override public void down(int src, int dest){
        System.out.print("A: ");
        super.down(src, dest); 
    }
    
    @Override public void openDoors(){
        System.out.print("A: ");
        super.openDoors();
    }
    
    @Override public void closeDoors(){
        System.out.print("A: ");
        super.closeDoors();
    }
}

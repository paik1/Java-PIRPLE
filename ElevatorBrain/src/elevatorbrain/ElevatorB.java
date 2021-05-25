package elevatorbrain;

public class ElevatorB extends ElevatorSuper{
    
    public int[] Floors = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    
    public ElevatorB(int currentFloor){
        super(currentFloor);
        System.out.println("Elevator B is initialized and currently in "+currentFloor);
    }
    
    @Override public void up(int src, int dest){
        System.out.print("B: ");
        super.up(src, dest);
    }
    
    @Override public void down(int src, int dest){
        System.out.print("B: ");
        super.down(src, dest);
    }
    
    @Override public void openDoors(){
        System.out.print("B: ");
        super.openDoors();
    }
    
    @Override public void closeDoors(){
        System.out.print("B: ");
        super.closeDoors();
    }
}
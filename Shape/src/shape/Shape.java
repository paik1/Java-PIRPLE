package shape;

public class Shape {

    public static void main(String[] args) {
        Sphere s = new Sphere(5);
        
        System.out.println("The diameter of the sphere is "+s.diameter()+"cm. "
                + "The circumference of the sphere is "+s.circumference()+"cm. "
                        + "The surfacearea of the sphere is "+s.surfacearea()+"cm^2. "
                                + "The volume of the sphere is "+s.volume()+"cm^3");
    }
    
}

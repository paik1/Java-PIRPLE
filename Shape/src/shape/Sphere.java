
package shape;

public class Sphere {
    
    private float radius;
    
    public Sphere(){
        this.radius = 0.0f;
    }
    
    public Sphere(float r){
        this.radius = r;
    }
    
    public float diameter(){
        return 2*radius;
    }
    
    public double circumference(){
        return 2*Math.PI*radius;
    }
    
    public double surfacearea(){
        return 4*Math.PI*Math.pow(radius,2);
    }
    
    public double volume(){
        return (4.0/3.0)*Math.PI*Math.pow(radius,3);
    }
}

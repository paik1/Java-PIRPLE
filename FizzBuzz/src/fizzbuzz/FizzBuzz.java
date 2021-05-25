
package fizzbuzz;


public class FizzBuzz {

    public static void main(String[] args) {
        
        for(int i =1; i<=100; i++){
            if( i==1 ){
                System.out.println(i);
                continue;
            }
            int temp = 0;
            for(int j = 2; j <= i/2; j++){
                if(i%j == 0){
                    temp++;
                }
            }
            if (temp == 0){
                System.out.println("Prime");
            }
            else if(i%3 == 0 && i%5 == 0){
                System.out.println("FIzzBuzz");
            }
            else if(i%3 == 0){
                System.out.println("FIzz");
            }
            else if(i%5 == 0){
                System.out.println("Buzz");
            }
            
            else{
                System.out.println(i);
            }
        }
    }
    
}

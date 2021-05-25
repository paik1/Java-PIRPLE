
package functions;

import java.util.Random;

public class Functions {

    
    public static void main(String[] args) {
        String rev = "functions";
        String pal = "kayak";
        int high = 100;
        int low =10;
        Random r = new Random();
        
        System.out.println(reverseString(rev));
        System.out.println(isPalindrome(pal));
        System.out.println(randBetween(high, low));
        
    }
    
    public static String reverseString(String rev) {
        
        char[] temp = rev.toCharArray();
        char[] temp2 = new char[temp.length];
        
        for(int i = temp.length-1; i >=0 ; i--){
            temp2[temp.length-1 -i] = temp[i]; 
        }
               
        String out = new String(temp2);
                
        return out;
    }
    
    public static boolean isPalindrome(String pal) {
        
        char[] temp = pal.toCharArray();
        int count =0;
        
        for(int i=0; i <temp.length; i++){
            if(temp[i] != temp[temp.length-1-i]){
                count++;
            }
        }
      
        if(count>0){
            return false;
        }
        else{
            return true;
        }
    }
    
    public static int randBetween(int high, int low){
        Random r = new Random();
        int result = r.nextInt(high-low)+low; 
        
        return result;
    
    }
}

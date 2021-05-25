
package fifa2019;

import java.io.*;

public class FIFA2019 {

    public static void main(String[] args) throws IOException {
        File inFile = new File("data.csv");
        BufferedReader in = new BufferedReader(new FileReader(inFile));
        
        BufferedWriter out = new BufferedWriter(new FileWriter("fifa-tab.tsv"));
        
        String input = "";
        String newInput;
        
        while((newInput = in.readLine()) != null){
            input += newInput.replace(",","\t")+"\r\n"; 
        }
        
        out.write(input);
        
        out.close();
        in.close();
        
    }
    
}

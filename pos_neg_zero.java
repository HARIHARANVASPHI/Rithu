package odd;

import java.util.Scanner;

/**
 *
 * @author Rithanya
 */
public class Odd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a value");
        a=ob.nextInt();
                
        if(a>0){
        System.out.println(" positive");
        }        
        else
        if(a<0)
        {
            System.out.println("negative");
        }
        else
        {
        System.out.println("zero");
         }   
    }
    
}

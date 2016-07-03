
package fact;

import java.util.Scanner;

public class Fact {

    public static void main(String[] args) {
        int c,n,f=1;
        Scanner ob=new Scanner(System.in);
 System.out.println("enter the fact no");
                n=ob.nextInt();
                        for(c=1;c<=n;c++){
                            f=f*c;
                        }
                        System.out.println("f"+f);
                        
                        
                        
    }
    
}

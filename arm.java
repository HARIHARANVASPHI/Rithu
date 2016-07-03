
package arm;

import java.util.Scanner;

public class Arm {
    public static void main(String[] args) {
        int num;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the no");
        num=ob.nextInt();
        int n=num;
        int c=0,r;
        while(num>0)
        {
            r=num%10;
            c=c+(r*r*r);
            num=num/10;
        }
        if(c==n)
            System.out.println(n+ "is an armstrong no");
        else
            System.out.println(n+ "is not an armstrong no");
        
    }
    
}


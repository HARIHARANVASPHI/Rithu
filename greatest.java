
package rt;

import java.util.Scanner;
public class largest {
     public static void main(String args[])
   {
      int a,b,c;
      Scanner input=new Scanner(System.in); 
        System.out.print("Enter Number :"); 
        a=input.nextInt();
        Scanner in=new Scanner(System.in); 
        b=in.nextInt();
        Scanner it=new Scanner(System.in); 
        c=it.nextInt();
        
       if(a>b && a>c)
       {
           System.out.println(a+" is gratest among"+a+" " +b+ " "+c);
       }
       else if(b>c)
       {
           System.out.println(b+" is gratest among"+a+" " +b+ " "+c); 
       }
       else
       {
           System.out.println(c+" is gratest among"+a+" " +b+ " "+c);
       }
   }

    
}

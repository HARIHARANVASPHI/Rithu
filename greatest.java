
package guvi;

import java.util.Scanner;

public class greatest {
     public static void main(String args[])
   {
      int x, y, z;
      System.out.println("Enter three integers ");
      Scanner in = new Scanner(System.in);
 
      x = in.nextInt();
      y = in.nextInt();
      z = in.nextInt();
 
      if ( x > y && x > z )
         System.out.println(x+"First number is greatest.");
      else if ( y > x && y > z )
         System.out.println(y+"Second number is greatest.");
      else if ( z > x && z > y )
         System.out.println(z+"Third number is greatest.");
      else   
         System.out.println("Entered numbers are not distinct.");
   }
    
}

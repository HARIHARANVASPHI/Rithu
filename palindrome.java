
package guvi;

import java.util.Scanner;

public class palindrome {
    public static void main(String args[]){ 
       System.out.print("Enter Number: ");
       Scanner read = new Scanner(System.in);
       int num = read.nextInt();
       int n = num;
       //reversing number
       int rev=0,rmd; 
       while(num > 0) 
       { 
         rmd = num % 10; 
         rev = rev * 10 + rmd; 
         num = num / 10; 
       } 
       if(rev == n) 
         System.out.println("Palindrome"); 
       else
         System.out.println(" not a Palindrome"); 
     } 
}
    


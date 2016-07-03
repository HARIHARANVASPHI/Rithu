
package odd;

import java.util.Scanner;


public class sumNfor {
    public static void main(String args[])
	{
		int sum = 0;
		int n;
                Scanner sn=new Scanner(System.in);
             System.out.print("Enter Number :"); 
        n=sn.nextInt(); 
		for(int i = 1;i <= n;i++)
		{
			sum = sum + i;
		}
		System.out.println("The Sum Of "+n+" Numbers are:" + sum);
	}
    
}

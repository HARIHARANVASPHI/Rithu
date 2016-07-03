import java.util.Scanner;

public class prime {
    public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter any number");
int n=s.nextInt();
int i;
int check=0;
for(i=2;i<=n/2;i++)
{
if(n%i==0)
{
System.out.println("Not a prime");check=1;break;
}}
if(check==0)
{
System.out.println("Prime");
    
}
}
}

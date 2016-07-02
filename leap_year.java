public class Rt {
    public static void main(String[] args) {
        int a;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a value");
        a=ob.nextInt();
        if(a%4==0){
        System.out.println("leap year");
        }        
        else
        {
            System.out.println("not leap year");
        }
        
    }
    
}

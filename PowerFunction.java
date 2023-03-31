import java.util.Scanner;

public class function {
    public static void power(int a,int b) {
        int r=1;
        for(int i=0;i<b;i++){
            r=r*a;
        }
        System.out.println(r);
        return;   
    }
    public static void main(String args[]) {
        try(Scanner sc= new Scanner(System.in)){
            int a=sc.nextInt();
            int b=sc.nextInt();
            power(a,b);
            
        }
        
    }
}

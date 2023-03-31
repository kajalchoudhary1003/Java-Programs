import java.util.Scanner;

public class function {
    public static void factorial(int a) {
        int fact=1;
        for(int i=a;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
        return;   
    }
    public static void main(String args[]) {
        try(Scanner sc= new Scanner(System.in)){
            int a=sc.nextInt();
            factorial(a);
            
        }
        
    }
}

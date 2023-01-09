import java.util.Scanner;

public class addition{
    public static int add(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number:");
            int a=sc.nextInt();
            System.out.println("Enter second number:");
            int b=sc.nextInt();
            int sum=add(a,b);
            System.out.println(sum);
        }
        


    }
    
}

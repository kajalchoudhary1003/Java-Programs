import java.util.Scanner;

public class fibonnaci {
    public static void main(String args[]) {
        try(Scanner sc= new Scanner(System.in)){
            int n=sc.nextInt();
            int a=0 , b=1;
            System.out.println(a);
            if(n>1){
                for(int i=2;i<=n;i++){
                    System.out.println(b);
                    int temp=a+b;
                    a=b;
                    b=temp;
                }
            }

        }
        
    }
}

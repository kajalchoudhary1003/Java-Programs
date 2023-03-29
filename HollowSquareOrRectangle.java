import java.util.Scanner;

public class pattern {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter length:");
            int a=sc.nextInt();
            System.out.println("Enter breadth:");
            int b=sc.nextInt();
            for(int i=1;i<=a;i++){
                for(int j=1;j<=b;j++){
                    if(i==1 || j==1 || i==a || j==b){
                      //to print stars
                        System.out.print("*");
                    }else{
                      //to print spaces
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        
    }
}

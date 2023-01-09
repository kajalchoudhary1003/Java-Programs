import java.util.Scanner;

public class averageOfN {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n:"); //total numbers 
            int n=sc.nextInt();
            int count=1;
            float sum=0;
            while(count<=n){
                //taking input of every number till the n
                System.out.println("Enter the " + count + " number:");
                float num=sc.nextFloat();
                sum +=num;
                ++count;
            }
            float avg = sum/n;
            System.out.println("Average is:"+ avg);
        }
        
    }
    
}

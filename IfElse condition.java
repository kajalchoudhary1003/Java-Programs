import java.util.Scanner;

public class ifElse {
    public static void main(String args[]){
        try(Scanner sc= new Scanner(System.in)){
            int age=sc.nextInt();
            if(age>=18){
                System.out.println("You are eligible to vote");
            }else{
                System.out.println("You are not eligible to Vote");
            }

        }
    }
    
}

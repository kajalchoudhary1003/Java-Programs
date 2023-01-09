import java.util.Scanner;

public class sswitch {
     public static void main(String args[]) {
try(Scanner sc=new Scanner(System.in)){
    int button=sc.nextInt();
    switch(button){
        case 1: System.out.println("Hello");
        break;
        case 2: System.out.println("Namaste");
        break;
        case 3: System.out.println("Wish you a very ");
        break;
        default: System.out.println("Write the correct input");
    }
}

    }
        
    }

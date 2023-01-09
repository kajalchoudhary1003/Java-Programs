import java.util.Scanner;

public class string_character_count {
    public static void main(String args[]) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the desired string:");
            //takes the input 
            String s=sc.nextLine();
            int count=0;
            //counts all characters except for space
            for(int i=0;i<s.length();i++){   //s.length() is the total length of string including spaces
                if(s.charAt(i) != ' ')
                count++;
            }
            System.out.println("Total number of characters are:"+count);
        }
        
    }
    
}

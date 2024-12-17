import java.util.Random;
import java.util.Scanner;

public class game1 {
    public static void main(String[] args) {

        int choice;
        int computer_choice;
        
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter your choice: 0 for Rock, 1 for Paper and 2 for Scissor: ");
            choice = scan.nextInt();
        }
        Random random = new Random();
        computer_choice = random.nextInt(3);

        if (choice==computer_choice) {
            System.out.println("Draw!!");
            
        }
        else if(choice==0 && computer_choice==2 || choice==1 && computer_choice==0 || choice==2 && computer_choice==1){
            System.out.println("You won!!");
        }
        else {
            System.out.println("Computer won!!");
            
        }
        if (computer_choice==0) {
            System.out.println("Computer choice is Rock..");
            
        }
        else if (computer_choice==1){
            System.out.println("Computer choice is Paper..");
        }
        else {
            System.out.println("Computer choice is Scissor..");
        }

    }

    
    
}

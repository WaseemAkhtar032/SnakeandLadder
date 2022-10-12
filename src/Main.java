import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("WELCOME TO SNAKE LADDER GAME ..");
        System.out.println("LET'S PLAY!");

        System.out.println("1 - Single Player\n2 - Two Players");
        System.out.println("Enter your choice");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1: SinglePlayer singlePlayer = new SinglePlayer();
            singlePlayer.singlePlayer();
            break;
            case 2 : TwoPlayer twoPlayer = new TwoPlayer();
            twoPlayer.twoPlayer();
            break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
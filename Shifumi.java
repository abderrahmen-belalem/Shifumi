import java.util.Random;
import java.util.Scanner;

public class Shifumi {
    static int max = 3, min = 1;

    static void convertingNumbersToChoises(int number) {
        switch (number) {
            case 1:
                System.out.println("AI choosed paper");
                break;
            case 2:
                System.out.println("AI choosed scissors");
                break;
            case 3:
                System.out.println("AI choosed rock");
                break;
        }
    }

    static void gameInit() {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number :");
        int firstChoice = scan.nextInt();
        int secondChoice = rand.nextInt((max - min) + 1) + min;
        convertingNumbersToChoises(secondChoice);
        decideWinner(firstChoice, secondChoice);
    }


    static void decideWinner(int firstChoice, int secondChoice) {
        if (firstChoice == secondChoice) {
            System.out.println("Draw");
        } else {
            switch (firstChoice) {
                case 1:
                    if (secondChoice == 2) {
                        System.out.println("AI won");
                    } else {
                        System.out.println("You won");
                    }
                    break;
                case 2:
                    if (secondChoice == 1) {
                        System.out.println("AI won");
                    } else {
                        System.out.println("You won");
                    }
                    break;
                case 3:
                    if (secondChoice == 1) {
                        System.out.println("AI won");
                    } else {
                        System.out.println("You won");
                    }
                    break;
                default:
                    System.out.println("Enter a valid a number : ");
                    gameInit();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Shifumi");
        System.out.println("Enter your choice :");
        System.out.println("(1) paper");
        System.out.println("(2) scissors");
        System.out.println("(3) rock");
            gameInit();
        
    }
}

import java.util.Random;
import java.util.Scanner;

class Task1 
{
    static int MIN = 1;
    static int MAX = 100;
    static int Attempts = 10;
    static int rounds = 3;

    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;

        System.out.println("NUMBER GUESSING GAME");
        System.out.println("Total Number Of Rounds : 3");
        System.out.println("Attempts To Guess Number In Each Round : 10\n");
        for (int i = 1; i <= rounds; i++) 
        {
            int n = random.nextInt(MAX) + MIN;
            int attempts = 0;

            System.out.printf("Round %d: Guess the number between %d and %d in %d attempts.\n", i, MIN, MAX,
                    Attempts);
            while (attempts < Attempts) 
            {
                System.out.println("Enter your guess : ");
                int guess_num = scanner.nextInt();
                attempts = attempts + 1;

                if (guess_num == n) 
                {
                    int score = Attempts - attempts;
                    totalScore = totalScore + score;
                    System.out.printf("Hurray! Number Guessed Successfully. Attempts = %d. Round Score = %d\n",
                            attempts, score);
                    break;
                }

                else if (guess_num < n) 
                {
                    System.out.printf("The number is greater than %d. Attempts Left = %d.\n", guess_num,
                            Attempts - attempts);
                }

                else if (guess_num > n) 
                {
                    System.out.printf("The number is less than %d. Attempts Left = %d.\n", guess_num,
                            Attempts - attempts);
                }

            }

            if (attempts == Attempts) {
                System.out.printf("\nRound = %d\n", i);
                System.out.println("Attempts = 0");
                System.out.printf("The Random Number Is : %d\n\n", n);
            }
        }
        System.out.printf("Game Over. Total Score = %d\n", totalScore);
        scanner.close();
    }
}
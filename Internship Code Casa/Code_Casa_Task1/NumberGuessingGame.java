import java.util.*; 

class Guesser { 
    double guessNum; 
    int num; 

    public int guessNumber() { 
        System.out.println(".........................................................................................................");
        // System.out.println("Please choose your level:- Easy(E), Medium(M), Hard(H)");
        System.out.println("Choose Your Level :: ");
        System.out.println("E for Easy");
        System.out.println("M for Medium");
        System.out.println("H for Hard");
        System.out.println(".........................................................................................................");
        Scanner sc = new Scanner(System.in);
        guessNum = Math.random(); 
        String choice = sc.next(); 
        char ch = choice.charAt(0);
        switch (ch)
        {
            case 'E': guessNum = guessNum * 10; 
                break;

            case 'M': guessNum = guessNum * 100; 
                break;

            case 'H': guessNum = guessNum * 1000; 
                break;

            default: System.out.println("....................................................................................................");
                System.out.println("Please either enter choice in Uppercase or re-enter your choice! ");
                System.out.println("..................................................................................................");
                System.exit(0); // System.exit(0) is used to exit the program
                break; 
        }
        System.out.println(".........................................................................................................");
        System.out.println("System is choosing a number for you :) ");
        System.out.println(".........................................................................................................");
        num = (int) guessNum; // typecasting double to int
        return num; // returning the number to the main method
    }
}

class Player { 
    int pguessNum; 
    public int guessNumber() { 
        Scanner sc = new Scanner(System.in); // Scanner class is used to take input from user
        System.out.println(".........................................................................................................");
        System.out.println("Kindly guess the number");
        System.out.println(".........................................................................................................");
        pguessNum = sc.nextInt(); 
        return pguessNum; // returning the number to the main method
    }
}

class Umpire { 

    int numFromGuesser; // numFromGuesser is used to store the number generated by the system
    int numFromplayerA; // numFromplayerA is used to store the number guessed by the playerA
    int numFromplayerB; // numFromplayerB is used to store the number guessed by the playerB
    int numFromplayerC; // numFromplayerC is used to store the number guessed by the playerC


    public void collectNumFromGuesser() { // collectNumFromGuesser method is used to collect the number generated by the system
        Guesser g = new Guesser(); // creating an object of Guesser class
        numFromGuesser = g.guessNumber(); 
    }


    public void collectNumFromPlayer() { // collectNumFromPlayer method is used to collect the number guessed by the player
        Player p1 = new Player(); // creating an object of Player class
        Player p2 = new Player(); 
        Player p3 = new Player(); 


        numFromplayerA = p1.guessNumber(); 
        numFromplayerB = p2.guessNumber(); 
        numFromplayerC = p3.guessNumber();
    }

    void compare() { // compare method is used to compare the number guessed by the player and the number generated by the system

        if (numFromGuesser == numFromplayerA) { // if the number guessed by the player is equal to the number generated by the system then the player wins the game
            if (numFromGuesser == numFromplayerB && numFromGuesser == numFromplayerC) { // if all the players guess the number correctly then all the players win the game
                System.out.println("Game tied all three players guessed correctly and won");
                System.out.println("******** Thank you for playing, have a great one ahead :)  ********::");
            } else if (numFromGuesser == numFromplayerB) { // if playerA and playerB guess the number correctly then playerA and playerB win the game
                System.out.println("Player 1 and playerB won the game, player 3 lost");
                System.out.println("******** Thank you for playing, have a great one ahead :)  ********::");
            } else if (numFromGuesser == numFromplayerC) { // if playerA and playerC guess the number correctly then playerA and playerC win the game
                System.out.println("Player 1 and playerC won and player 2 lost ");
                System.out.println("******** Thank you for playing, have a great one ahead :)  ********::");
            } else { // if only playerA guess the number correctly then playerA wins the game

                System.out.println("Player 1 won the game and everyone else lost");
                System.out.println("******** Thank you for playing, have a great one ahead :)  ********::");
            }
        } else if (numFromGuesser == numFromplayerB) { // if the number guessed by the player is equal to the number generated by the system then the player wins the game

            if (numFromGuesser == numFromplayerC) { // if playerB and playerC guess the number correctly then playerB and playerC win the game
                System.out.println("Player 2 and playerC won the game and player 1 lost");
                System.out.println("******** Thank you for playing, have a great one ahead :)  ********::");
            } else { // if only playerB guess the number correctly then playerB wins the game
                System.out.println("Player 2 won the game and other lost");
                System.out.println("******** Thank you for playing, have a great one ahead :)  ********::");
            }
        } else if (numFromGuesser == numFromplayerC) { // if the number guessed by the player is equal to the number generated by the system then the player wins the game
            System.out.println("Player 3 won the game and everyone else lost ");
            System.out.println("******** Thank you for playing, have a great one ahead :)  ********::");
        } else { // if no one guesses the number correctly then no one wins the game
            System.out.println("No one guessed correctly! The number which was to be guessed is:- " + numFromGuesser);
            System.out.println("******** Thank you for playing, have a great one ahead :)  ********::");
        }
    }

}


public class NumberGuessingGame { // Launchgame class is used to launch the game

    public static void main(String[] args) { // main method is used to call the methods of other classes
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    }
}
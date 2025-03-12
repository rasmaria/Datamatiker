package BlackDice;

import java.util.Scanner;
import java.util.Random;

public class BlackJackDiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomDice = random.nextInt(6) + 1 + random.nextInt(6) + 1;
        ;
        boolean playAgain = true;


        System.out.println("Hello and welcome to a game of Black Jack with dices!" +
                " \n"
                + "\nThe object of the game is to get closer to 21 than the computer without going over 21.\n" +
                "You can throw the two dices as many times as you wish, however if your total sum from your dice throws exceeds 21, \n" +
                "it is called a “bust” or “break” and the computer wins." +
                " \n" +
                "\nPlease enter your name and press ENTER to throw the first pair of dices.");

        //First throw of dice
        String name = scanner.nextLine();
        System.out.println("Great job " + name + "! You start out with throwing " + randomDice + ".");
        String throwAgainQuestion1 = "";


        while (randomDice <= 21 && playAgain) {
            System.out.println("Yay! Do you wish to throw again? \nIf yes, type 'y' and press ENTER. If no, type 'n'. and press ENTER");
             throwAgainQuestion1 = scanner.nextLine();

            //First time asking if they want to throw again

            if (randomDice == 21) {
                System.out.println("BLACK JACK!\nCongratulations! You won over the machine!🤩");
                playAgain = false;
                break;
            } else if (randomDice > 21) {
                System.out.println("Oh no! You got " + randomDice + " and therefore exceed 21! The machine wins 🤯");
                playAgain = false;
                break;
            }

            if (throwAgainQuestion1.equals("y")) {
                randomDice += random.nextInt(6) + 1 + random.nextInt(6) + 1;
                System.out.println("You rolled again and your new sum is: " + randomDice + "!");
            } else if (throwAgainQuestion1.equals("n")) {
                System.out.println("You've decided to stop! Your final total is: " + randomDice);
                playAgain = false;
                break;
            } else {
                System.out.println("Oh no! Wrong input - play again 😜");
                playAgain = false;
            }
        }
    }
}





/*
                //Second time asking if they want to throw again
                while (randomDice <= 21 && playAgain) {
                    System.out.println("Yay! Do you wish to throw again? \nIf yes, type 'y' and press ENTER. If no, type 'n'. and press ENTER");
                    String throwAgainQuestion2 = scanner.nextLine();

                    if (throwAgainQuestion2.equals("y")) {
                        randomDice += random.nextInt(6) + 1 + random.nextInt(6) + 1;
                        System.out.println("You rolled again and your new sum is: " + randomDice + "!");
                    }else if (throwAgainQuestion2.equals("n")) {
                        System.out.println("You've decided to stop! Your final total is " + randomDice + "!");
                        playAgain = false;
                    }

                    else if (randomDice > 21) {
                        System.out.println("Oh no! You got " + randomDice + " and therefore exceed 21! The machine wins 🤯");
                        break;
                    }
                    else {
                        System.out.println("BLACK JACK!\nCongratulations! You won over the machine!🤩");
                        break;
                    }
                    //Third time
                    while (randomDice <= 21 &&) {
                        System.out.println("Yay! Do you wish to throw again? \nIf yes, type 'y' and press ENTER. If no, type 'n'. and press ENTER");
                        String throwAgainQuestion3 = scanner.nextLine();

                        if (throwAgainQuestion3.equals("y")) {
                            randomDice += random.nextInt(6) + 1 + random.nextInt(6) + 1;
                            System.out.println("You rolled again and your new sum is: " + randomDice + "!");
                        } else if (throwAgainQuestion3.equals("n")) {
                            System.out.println("You've decided to stop! Your final total is " + randomDice + "!");
                            playAgain = false;

                        } else if (randomDice > 21) {
                            System.out.println("Oh no! You got " + randomDice + " and therefore exceed 21! The machine wins 🤯");
                            break;
                        }else {
                            System.out.println("BLACK JACK!\nCongratulations! You won over the machine!🤩");
                            break;
                        }
                        //Fourth time
                        while (randomDice <= 21) {
                            System.out.println("Yay! Do you wish to throw again? \nIf yes, type 'y' and press ENTER. If no, type 'n'. and press ENTER");
                            String throwAgainQuestion4 = scanner.nextLine();

                            if (throwAgainQuestion4.equals("y")) {
                                randomDice += random.nextInt(6) + 1 + random.nextInt(6) + 1;
                                System.out.println("You rolled again and your new sum is: " + randomDice + "!");
                            }else if (throwAgainQuestion4.equals("n")) {
                                System.out.println("You've decided to stop! Your final total is " + randomDice + "!");
                                break;
                            }else if (randomDice > 21) {
                                System.out.println("Oh no! You got " + randomDice + " and therefore exceed 21! The machine wins 🤯");
                                break;
                            }else {
                                System.out.println("BLACK JACK!\nCongratulations! You won over the machine!🤩");
                                break;
                            }
                        }
                    }
                }*/



       /* while () {
            int sumDice = randomDice ;
            if (result >21) {
             System.out.println("Yay! Do you wish to throw again? \nIf yes, type 'Y' and press ENTER. If no, type 'N'. and press ENTER")

            else
                break;



if diceSum == 21
        System.out.println("BLACK JACK! \nCongratulations! You won over the machine!");
if diceSumMachine == 21
        System.out.println("MACHINE GOT BLACK JACK! \nOh no! The machine wins!😪");
if diceSum >= 21
        System.out.println("Oh no! The machine wins because you got more than 21 😪");
if diceSumMachine >= 21
        System.out.println("YAY! You win because the machine got more than 21 🤩");
if diceSumMachine >= 21
        System.out.println("YAY! You win because the machine got more than 21 🤩");
if diceSum == diceSumMachine
        System.out.println("It's a draw! Play again to find a winner 😎");
if diceSum == diceSumMachine
        System.out.println("It's a draw! Play again to find a winner 😎");

// Here you will have to check:

// 4. is the users sum larger than the machines, the user win
// 5. is the machine sum larger than users, then machine win



*/


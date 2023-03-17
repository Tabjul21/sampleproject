package Assignment_3;

import java.util.Scanner;

class Guesser{
	int GuessNum;
	int GuessNum() {
	    Scanner sc = new Scanner(System.in);
	    int GuessNum;
	    do {
	        System.out.println("Guess the number (between 1 and 10): ");
	        GuessNum = sc.nextInt();
	        if (GuessNum < 1 || GuessNum > 10) {
	            System.out.println("Invalid input. Please enter a number between 1 and 10.");
	        }
	    } while (GuessNum < 1 || GuessNum > 10);
	    return GuessNum;
	}
}
class Player{
	int GuessNum;
	int GuessNum() {
	    Scanner sc = new Scanner(System.in);
	    int GuessNum;
	    do {
	        System.out.println("Player Guess the number (between 1 and 10): ");
	        GuessNum = sc.nextInt();
	        if (GuessNum < 1 || GuessNum > 10) {
	            System.out.println("Invalid input. Please enter a number between 1 and 10.");
	        }
	    } while (GuessNum < 1 || GuessNum > 10);
	    return GuessNum;
	}
	}


class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser() {
		Guesser g=new Guesser();
		numFromGuesser=g.GuessNum();
	}
	void collectNumFromPlayer() {
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.GuessNum();
		numFromPlayer2=p2.GuessNum();
		numFromPlayer3=p3.GuessNum();
	}
	void compare() {
		if(numFromGuesser==numFromPlayer1) {
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer1) {
				System.out.println("Game Tied");
			}
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3) {
				System.out.println("All Players Won The Game");
			}
			else if(numFromGuesser==numFromPlayer2) {
				System.out.println("Player 1 & 2 Won the game");
			}
			else if(numFromGuesser==numFromPlayer3) {
				System.out.println("Player 1 & 3 Won the game");
			}
			else {
			System.out.println("Player1 won the game");
		}
		}
		else if(numFromGuesser==numFromPlayer2) {
			if(numFromGuesser==numFromPlayer3) {
				System.out.println("Player 2 & 3 Won the game");
			}
			else {
			System.out.println("Player2 won the game");
		}
		}
		else if(numFromGuesser==numFromPlayer3) {
			System.out.println("Player3 won the game");
		}
		else {
			System.out.println("Game Lost Try Again.....!");
		}
	}
}
public class GuesserGame {

	public static void main(String[] args) {
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
	}
}

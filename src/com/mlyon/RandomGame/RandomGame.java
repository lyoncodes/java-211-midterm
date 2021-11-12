package com.mlyon.RandomGame;
import java.util.Scanner;

public class RandomGame {
	public static void game() {
		Scanner sc = new Scanner(System.in);
		int min = 0;
		int max = 1000;
		
		int score = 10;
		int count = 0;
		int guess;
		
		int rand = min + (int)(Math.random() * (max - min));
		System.out.println(rand);
		
		while (count < 10) {
			guess = sc.nextInt();
			if (guess > rand) {
				System.out.println("Your guess is too high");
				score --;
			} else if (guess < rand) {
				System.out.println("Your guess is too low");
				score --;
			} else if (guess == rand) {
				System.out.println("You are correct!");
				break;
			}
			count ++;
		};
		
		System.out.println("the correct answer: " + rand);
		System.out.println("your score: " + score);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		game();
		String status = "";
		System.out.println("Do you want to play again? y/n: ");
		status = sc.next();
		while (status.equals("y")) {
			game();
			System.out.println("Do you want to play again? y/n: ");
			status = sc.next();
		};
		sc.close();
	}

}

package com.sheplu.blackjack.game;

import java.util.Scanner;

public class Game {
	Scanner sc = new Scanner(System.in);
	
	public Game() {
		System.out.println("initialize the game");
		boolean isPlaying = true;
		
		do {
			showMenu();
			int choice = askChoice();
			System.out.println("Hello! How many players today?");
			
			switch (choice) {
				case 1:
					System.out.println("play");
					launcher();
					break;
				case 2:
					System.out.println("no datas for now.");
					break;
				case 3:
					System.out.println("quitting the game");
					isPlaying = false;
					break;
				default:
					System.out.println("no valid choice. try again");
					break;
			}
			
		}while(isPlaying);
		
		System.out.println("EOP");
	}
	
	public void launcher() {
		
	}
	
	public void showMenu() {
		System.out.println("Welcome !");
		System.out.println("1 - Play");
		System.out.println("2 - Datas");
		System.out.println("3 - Quit");
	}
	
	public int askChoice() {
		int choice = sc.nextInt();
		System.out.println(choice);
		return choice;
	}
	
	
}

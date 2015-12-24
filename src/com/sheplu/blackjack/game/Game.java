package com.sheplu.blackjack.game;

import java.util.ArrayList;
import java.util.Scanner;

import com.sheplu.blackjack.player.Player;

public class Game {
	Scanner sc = new Scanner(System.in);
	int choice = 0;
	ArrayList<Player> players = new ArrayList<Player>();
			
	public Game() {
		System.out.println("initialize the game");
		boolean isPlaying = true;
		
		
		do {
			showMenu();
			 choice = askChoice();
			
			
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
		System.out.println("Hello! How many players today?");
		choice = askChoice();
		for(int i=0; i < choice; i++) {
			System.out.println("player's informations");
			System.out.println("money");
			int money = sc.nextInt();
			String empty = sc.nextLine();
			System.out.println("name");
			String name = sc.nextLine();
			
			Player player = new Player(name, money);
			players.add(player);
		}
		
	}
	
	public void showMenu() {
		System.out.println("Welcome !");
		System.out.println("1 - Play");
		System.out.println("2 - Datas");
		System.out.println("3 - Quit");
	}
	
	public int askChoice() {
		choice = sc.nextInt();
		System.out.println(choice);
		return choice;
	}
	
	
}

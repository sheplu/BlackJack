package com.sheplu.blackjack.player;

public class Player {
	private String name;
	private int money;
	
	public Player() {
		System.out.println("bank with unlimited founds");
	}

	public Player(String name, int money) {
		// TODO Auto-generated constructor stub
		this.setName(name);
		this.setMoney(money);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	

}

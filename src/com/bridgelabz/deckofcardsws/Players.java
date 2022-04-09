package com.bridgelabz.deckofcardsws;

import java.util.Scanner;

public class Players extends DeckOfCards {
	public static int players() {
		System.out.println("\nEnter number of players minimum 2, maximum 4 ");
		Scanner sc = new Scanner(System.in);
		int player = sc.nextInt();
		if (player >= 2 && player <= 4) {
			System.out.println(player + " players will  play the game");
		} else {
			System.out.println("please enter number of players in the Range");
		}
		sc.close();
		return player;
	}

	public static void sequenceOfPlay(int player) {
		for (int i = 1; i <= player; i++) {
			System.out.println("Player " + i + " Getting card:");

		}
	}
}

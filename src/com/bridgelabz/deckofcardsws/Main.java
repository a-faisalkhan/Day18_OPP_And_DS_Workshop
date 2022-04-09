package com.bridgelabz.deckofcardsws;

public class Main {
	public static void main(String[] args) {
		DeckOfCards deckOfCard = new DeckOfCards();
		deckOfCard.init();
		deckOfCard.shuffle();
		deckOfCard.distribute();
		deckOfCard.printDistributedCards();
	}
}

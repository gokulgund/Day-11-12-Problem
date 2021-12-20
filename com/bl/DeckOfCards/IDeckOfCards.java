package com.bl.DeckOfCards;

public interface IDeckOfCards {

	String[] SUITS = { "CLUBS", "DIAMAND", "HEARDS", "SPADES" };
	String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

	public void init();

	public void shuffle();

	public void distribute();

	public void print();

	public void printDistributedCards();
}

package com.bl.stock;

import java.io.BufferedReader;
import java.util.Scanner;

public class StockOperation {

	static MyLinkedList<Stock> list;

	public static void getStockData() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number Of Stocks: ");
		int count = scanner.nextInt();
		list = new MyLinkedList<Stock>();

		for (int i = 0; i < count; i++) {
			System.out.print("Enter Stock Name : ");
			String name = scanner.next();
			System.out.println("Enter The Number Of Share : ");
			int numberOfShares = scanner.nextInt();
			System.out.println("Enter the Share Price : ");
			int price = scanner.nextInt(); 
			Stock stock = new Stock(name, numberOfShares, price);
			list.add(stock);
		}
		scanner.close();
	}

	public static void printReport() {
		int totalValue = 0;
		System.out.println("-------------------------------");
		System.out.println("Name\tShares\tPrice\tValue");
		while (!list.isEmpty()) {
			Stock folio = list.pop(0);
			totalValue += folio.getValue();
			System.out.println(folio.getName() + "\t" + folio.getNumberOfShares() + "\t" + folio.getPrice() + " \t"
					+ folio.getValue());
		}
		System.out.println("-------------------------------");
		System.out.println("Total value is: " + totalValue);
		System.out.println("-------------------------------");
	}
	BufferedReader bufferedReader = null;
}

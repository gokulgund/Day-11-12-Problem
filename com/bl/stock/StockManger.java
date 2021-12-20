package com.bl.stock;

public class StockManger {
	MyLinkedList<Stock> list;

	StockOperation stockOperation = new StockOperation();

	public static void main(String[] args) {
		StockOperation.getStockData();
		StockOperation.printReport();
	}
}


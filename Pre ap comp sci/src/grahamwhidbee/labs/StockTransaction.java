package grahamwhidbee.labs;

public class StockTransaction {

	public static void main(String[] args) {
		double priceOfStocksIntial, priceOfStocksFinal, commission1, commission2, profitWeek1, profitWeek2, profit;
		
		priceOfStocksIntial = 1000*32.87;
		System.out.println(priceOfStocksIntial);
		commission1 = 1000*32.87*.02;
		System.out.println(commission1);
		
		priceOfStocksFinal = 33.92;
		System.out.println(priceOfStocksFinal);
		priceOfStocksFinal = 33.92*1000;
		System.out.println(priceOfStocksFinal);
		commission2 = priceOfStocksFinal*.02;
		System.out.println(commission2);
		
		profitWeek1 = priceOfStocksIntial+commission1;
		profitWeek2 = priceOfStocksFinal-commission2;
		profit = profitWeek2-profitWeek1;
		System.out.println("\tJoe Toe\n\tGrant GODISGOODALLTHETIMEALLTHETIMEGODISGOOD              The L33T Trading Company");
		System.out.println("\n\t\tCommission paid on purchase of stock " + commission1);
		System.out.println("\t\tThe purchasing price was 32.87 per share");
		System.out.println("\t\tTotal stock purchase " + priceOfStocksIntial);
		System.out.println("\t\tThe sale price was 33.92 per share");
		System.out.println("\t\tTotal stock sale price " + priceOfStocksFinal);
		System.out.println("\t\tCommission paid on sale of stock " + commission2);
		System.out.println("\t\tthe total loss/profit was " + profit);
	}

}

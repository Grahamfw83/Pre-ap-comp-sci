package grahamwhidbee.labs;

public class CoinFlip {

	public static void main(String[] args) {
		
		int coin = (int) Math.floor((Math.random() + 1.5));
		
		if (coin==1){
			System.out.println("Heads bru");
		}else{
			System.out.println("Tails bru");
		}
		
	}

}

package ch2;

public class Mathmethods {

	public static void main(String[] args) {
		
		int math = (int)(Math.random()*101);
		int math2 = (int)(Math.random()*101);
		int sum = (int)(Math.min(math, math2));
		
	
		
		math = (int)(Math.random()*101);
	    math2 = (int)(Math.random()*101);
		sum = sum + (int)(Math.min(math, math2));
		
		System.out.print(sum);
		

	}

}

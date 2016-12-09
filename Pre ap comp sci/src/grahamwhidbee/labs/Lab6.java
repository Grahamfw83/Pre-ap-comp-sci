package grahamwhidbee.labs;
import java.util.Random;
public class Lab6 {

	public static void main(String[] args) {
		
		char first = (char)(Math.floor((Math.random()*26)+ 65));
		char second = (char)(Math.floor((Math.random()*26)+ 65));
		char third = (char)(Math.floor((Math.random()*26)+ 65));
		
		
		byte one = (byte)(Math.floor((Math.random()*10)+0));
		byte two = (byte)(Math.floor((Math.random()*10)+0));
		byte three = (byte)(Math.floor((Math.random()*10)+0));
		byte four = (byte)(Math.floor((Math.random()*10)+0));
		
		System.out.println("Your customer number " + first + second + third + "-" + one + two + three + four + "-" + "2016");
	}

}

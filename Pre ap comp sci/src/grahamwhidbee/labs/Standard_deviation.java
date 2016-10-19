package grahamwhidbee.labs;
import java.util.Scanner;

public class Standard_deviation {

	public static void main(String[] args) {
		double dog1, dog2, dog3, dog4, dog5, math;
		//mean
		dog1 = 600;
		dog2 = 470;
		dog3 = 170;
		dog4 = 430;
		dog5 = 300;
		math = dog1+dog2+dog3+dog4+dog5;
		math = math/5;
		System.out.println("The mean of the dog's heights is " + math);
		
		
		dog1 = dog1-math;
		dog1 = Math.pow(dog1, 2);
		dog2 = dog2-math;
		dog2 = Math.pow(dog2, 2);
		dog3 = dog3-math;
		dog3 = Math.pow(dog3, 2);
		dog4 = dog4-math;
		dog4 = Math.pow(dog4, 2);
		dog5 = dog5-math;
		dog5 = Math.pow(dog5, 2);
		
		//variance
		math = dog1+dog2+dog3+dog4+dog5;
		math = math/5;
		System.out.println("The Standard deviation is " + math);
		
		
		
		
		
		

	}

}

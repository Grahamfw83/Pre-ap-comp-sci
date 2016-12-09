package chapter3;

public class BooleanTest {
	public static void main(String[] args) {
	double number1, number2, number3, sign1, sign2, sign3;
	number1 = Math.random()*100-50;
	number2 = Math.random()*100-50;
	number3 = Math.random()*100-50;
	
	boolean eval1 = number1<0;
	if (eval1)
		System.out.println("YO BOI NUMBER 1 IS NEGATIVE HOLLA");
	eval1 = number2<0;
    if (eval1)
		System.out.println("YO BOI NUMBER 2 IS NEGATIVE HOLLA"); 
    eval1 = number3<0;
    if (eval1)
		System.out.println("YO BOI NUMBER 3 IS NEGATIVE HOLLA");
	}
}
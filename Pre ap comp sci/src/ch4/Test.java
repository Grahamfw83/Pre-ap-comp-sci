package ch4;

public class Test {

	public static void main(String[] args) {
		String sub2;
		String name = "graham whidbee";
		int str = name.indexOf('g');
		String sub = name.substring(str,str+1);
		sub = sub.toUpperCase();
		
	
		str = name.indexOf('w');
		sub2 = name.substring(str, str+1);
		sub2 = sub2.toUpperCase();
		
		System.out.println(sub+"raham " + sub2+"hidbee");



	}

}

package warmUps;

public class Warmup1_12 {

	public static void main(String[] args) {
		int count, wordLength, vowelCount, consonantCount;
		String word;
		count = 0;
		word = "warmupasdfjlkfdsajk;lfdsakjldsfakjlsdfalkjgfdslkjgwkljgdsfakjlslkjfdsalkjrwflk;ewrlkjewrqlkjh453kjhltrejkhterkjhertwhjktrewhkjtrewjhkrtewhkjwjhktrewhjlkterwhjklterwjhkjhkltrewlkjherwtkj;ltretre";
		wordLength = word.length();
		vowelCount = 0;
		consonantCount = 0;
		
		while (count<wordLength) {
			char c = word.charAt(count);
			
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
				
				vowelCount++;
			}else {
				consonantCount++;
			}
			count++;
		}
		System.out.println("vowels " + vowelCount + " \nconsonants " + consonantCount);

	}

}

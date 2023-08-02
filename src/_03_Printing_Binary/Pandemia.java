package _03_Printing_Binary;

import java.util.Iterator;
import java.util.stream.Stream;

public class Pandemia {

	static String challenge = "01000000X000X011X0X";

	public static void main(String[] args) {
		
		Stream<Character> charStream = new String(challenge).chars().mapToObj(i->(char)i);
		Stream<Character> charStream1 = new String(challenge).chars().mapToObj(i->(char)i);
		long divide = charStream.filter(c -> c != 'X').mapToInt(c -> 1).count();
		System.out.println(divide);
		
		System.out.println(divide/charStream1.filter(c -> c != 'X').count());
		

	}

}

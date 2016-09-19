package prob1;

public class Prob1 {
	
	public static void main(String args[]) {
		
		char[] array1 = reverse("Hello World");
		printCharArray(array1);
		
		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);
		
	}
	
	public static char[] reverse(String str){
		/* 구현코드 */
		char[] charArray = str.toCharArray();
		
		int length = charArray.length / 2;
		for( int i = 0; i < length; i++ ) {
			char c = charArray[ i ];
			charArray[ i ] = charArray[ charArray.length - 1 - i ];
			charArray[ charArray.length - 1 - i ] = c;
		}
		
		return charArray;
	}
	
	public static void printCharArray(char[] array){
		/* 구현코드 */
		System.out.println( array );
	}
}

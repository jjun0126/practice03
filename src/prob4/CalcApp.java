package prob4;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		// Scanner 와 String 클래스의 split 함수를 사용합니다.

		Scanner scanner = new Scanner(System.in);

		while (true) {
			
			System.out.print(">>");
			String expression = scanner.nextLine();
			if( "quit".equals( expression ) == true ) {
				break;
			}
			
			String[] tokens = expression.split(" ");
			String operator = tokens[1];
			int a = Integer.parseInt(tokens[0]);
			int b = Integer.parseInt(tokens[2]);

			switch( operator ) {
				case "+" : {
					Add add = new Add();
					add.setValue(a, b);
					int result = add.calculate();
					System.out.println( ">>" + result );
					break;
				}
				case "-" : {
					Sub sub = new Sub();
					sub.setValue(a, b);
					int result = sub.calculate();
					System.out.println( ">>" + result );
					break;
				}
				case "*" : {
					Mul mul = new Mul();
					mul.setValue(a, b);
					int result = mul.calculate();
					System.out.println( ">>" + result );
					break;
				}
				case "/" :{
					Div div = new Div();
					div.setValue(a, b);
					int result = div.calculate();
					System.out.println( ">>" + result );
					break;
				}
				default : {
					System.out.println( ">>지원하지 않는 연산입니다.");
					break;
				}
			}
		}
		
		scanner.close();
	}
}

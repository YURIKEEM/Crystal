package book;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.powerOn();
		
		int result1 = calc.plus(8,6);
		System.out.println("result1 : "+result1);
		
		double result2 = calc.divide(80, 4);
		System.out.println("result2 : "+result2);
		
		calc.powerOff();

	}

}

package week3.day1;

public class Calculator {
	public void add(int num1, int num2) {
		int add = num1 + num2;
		System.out.println(add);

	}
	public void add(int num3, int num4, int num5) {
		int addition= num3 + num4 +num5;
		System.out.println(addition);

	}

	public void multiply(int num1, int num2) {
		int multiply= num1*num2;

		System.out.println("Multiply 2 nos" +multiply);

	}
	public void mul(int num3, double num4) {
		double mul = num3*num4;
		
		System.out.println("Multiply is" +mul);

	}
	public void sub(int num1, int num2) {
		int sub = num1-num2;
		
		System.out.println("Sub 2 nos" +sub);

	}
	public void sub(double num3, double num4) {
		double subtract = num3-num4;
		System.out.println("Subtraction of 2 double nos" +subtract);

	}
	public void divide(int num1, int num2) {
		int div = num1/num2;
		System.out.println("Div of 2 nos" +div);

	}
	public void divide(double num3, int num4) {
		double division = num3/num4;
		System.out.println("Division" +division);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calc = new Calculator();
		calc.add (1, 2);
		calc.add(10, 20, 30);

	}

}

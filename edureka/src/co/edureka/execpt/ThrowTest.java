package co.edureka.execpt;
class Calculator{
	public void divNum(int x, int y) {
		if(y == 0) {
			//throw new ArithmeticException();
			throw new ArithmeticException("cannot divide a number by 0");
		}
		int res = x/y;
		System.out.println("result = " + res);
	}
}
public class ThrowTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		try {
			calc.divNum(10,0);
		}catch(Exception ex) {
			System.out.println("message = " + ex.getMessage());
			System.out.println(ex.toString());
		}
		System.out.println("--- done ---");
	}

}


public class TernaryOperator {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		
		boolean lar=false;
		
		lar=(a>b && a>c)?true:false;
		System.out.println("is a largest=" + lar);
		
		lar=(b>a && b>c)?true:false;
		System.out.println("is b largest=" + lar);
		
		lar=(c>a && c>b)?true:false;
		System.out.println("is c largest=" + lar);
		
		int n =(int) 123.45f;
		System.out.println(n);

	}

}

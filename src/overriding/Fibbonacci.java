package overriding;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 200;
		int l = 9;
		System.out.print(a + " " + b + " ");
		 for(int i=0; i<l; i++) {
			 int c= a+b;
			 System.out.print(c + " ");
			 a = b;
			 b = c;
		 }

	}

}

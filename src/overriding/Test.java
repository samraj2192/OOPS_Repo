package overriding;

public class Test {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.colour();
		
		Tiger m = new Tiger();
		m.colour();
		
		Animal a1 = new Tiger();
		a1.colour();
		
//		String s = new String("Samraj");
//		Object o = (Object)s;
//		System.out.println(s == o);
		
//		Integer i = new Integer(10);
//		Number n = (Number) i ;
//		Object o = (Object) n;
//		
//		System.out.println(i == n);
//		System.out.println(n == o);
//		System.out.println(i == o);
		
	}
	
}

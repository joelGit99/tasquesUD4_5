
public class TasquesUD4_5 {
	/**
	 * Programa en el cual se intercambian valores
	 * @author Joel
	 */
	public static void main(String[] args) {
		int a = 15;
		int b = 7;
		int c = 9;
		int d = 18;
		
		System.out.println("Valor anterior de B = " + b);
		b = c;
		System.out.println("Valor actual de B = " + b);
		System.out.println("Valor anterior de C = " + c);
		c = a;
		System.out.println("Valor actual de C = " + c);
		System.out.println("Valor anterior de A = " + a);
		a = d;
		System.out.println("Valor actual de A = " + a);
		System.out.println("Valor anterior de D = " + d);
		d = b;
		System.out.println("Valor actual de D = " + d);
	}

}

package contarpares;

public class ContarPares {

	public static void main(String[] args) {
		int totalPares = visContaHastaN(100);
		System.out.println("Hay " + totalPares + 
				" números de pares del 0 al 10");
	}

	private static int visContaHastaN(int n) {
		int contadorPares = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0)
				contadorPares++;
		}
		return contadorPares;
	}
}



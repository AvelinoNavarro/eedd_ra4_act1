package contarpares;

public class ContadorPares {

	public static void main(String[] args) {
		mostrarCantidadPares();
	}

	/**
	 * 
	 */
	private static void mostrarCantidadPares() {
		int contadorPares = 0;
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0)
				contadorPares++;
		}
		System.out.println("Hay " + contadorPares + " numeros pares del 0 al 10");
	}

}

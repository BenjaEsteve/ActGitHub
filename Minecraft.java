import java.util.Scanner;

public class Minecraft {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numCasos;
		int numCorredors;
		String passadis;
		int cont = 0;

		numCasos = sc.nextInt();

		for (int i = 0; i < numCasos; i++) {

			numCorredors = sc.nextInt();
			sc.nextLine();

			for (int j = 0; j < numCorredors; j++) {

				passadis = sc.nextLine();

				cont = contarSimbolos(passadis);

			}

			System.out.println(cont);
		}

	}

	public static int contarSimbolos(String passadis) {

		int cont = 0;

		for (int k = 0; k < passadis.length() - 1; k++) {

			if (passadis.charAt(k) == '{' && passadis.charAt(k + 1) == '}') {

				cont++;
			}
		}

		return cont;
	}
}
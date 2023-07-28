import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa tu numero: ");
		int valor = in.nextInt();
		int n = 0, numero = 1, anidado = valor, suma = 1; // se uso la , para añadir los demas int
		
		do {
			System.out.print(n + ",");
			n = numero;
			numero = suma;
			valor = numero + suma;
			suma = valor; 
		} while (n <= anidado); {
		in.close();
	}//while
		}//main
	}//class
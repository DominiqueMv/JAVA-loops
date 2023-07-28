import java.util.Scanner;

public class nombreSeparado {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
        	String nombre;
        
        	System.out.print("Ingresa un nombre: ");
        	nombre = console.next();
        
	for (int a = 0; a<nombre.length(); a++) {
		System.out.println(nombre.charAt(a));
		}//for
			console.close();
	}//main 
		
}//class
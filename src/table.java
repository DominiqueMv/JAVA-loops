import java.util.Scanner;

	public class table {
	    public static void main(String[] args){
	        Scanner console = new Scanner(System.in);
	        int num, a;
	        a=1;
	        
	        System.out.print("ingresa el numero que quieras multiplicar: ");
	        num = console.nextInt();
	        
	        System.out.println("La tabla de multiplicacion de " + num + " es:");
	        while (a<=10) {
				System.out.println(a + "*" + num + "=" + a*num);
				a++;
			}//while
	        console.close();
	    }//main void
	}//class table
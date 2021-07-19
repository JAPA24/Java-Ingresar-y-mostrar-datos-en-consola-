
import java.util.Scanner;

public class Java2 {

	public static void main(String[] args) {
		String nombre;
		String apellido;
		int edad;
		String hobbie;
		String editorfav;
		String so;
		
		
		Scanner sc = new Scanner(System.in);
		  System.out.println("Ingrese el nombre: ");
		  nombre = sc.nextLine();
		  System.out.println("Ingrese apellido: ");
		  apellido = sc.nextLine();
		  System.out.println("Ingrese hobbie: ");
		  hobbie = sc.nextLine();
		  System.out.println("Ingrese editor preferido: ");
		  editorfav = sc.nextLine();
		  System.out.println("Ingrese Sistema Operativo: ");
		  so = sc.nextLine();
		  System.out.println("Ingrese edad: ");
		  edad = sc.nextInt();
		  
		  System.out.println("Su nombre es: " + nombre + " " + "apellido: " + apellido + " " + "edad: " + edad + " " + "hobbie: " + hobbie + " " + "editor preferido: " + editorfav + " " + "Sistema Operativo: " + so);
	}
	
	
}

package clase;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList <Usuario> listaUsuario = new ArrayList <Usuario> ();
		
		// primer loop de bienvenida de usuario/nuevo usuario
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int opcion = 10;
		
		while(opcion != 0) {
			
			System.out.println("bienvenido");
			System.out.println("0. cerrar");
			System.out.println("1. crear usuario");
			System.out.println("2. mostrar usuarios");
			
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				
				System.out.println("Creando usuario");
				Usuario usuarioTemporal = new Usuario();
				
				System.out.print("Ingrese el nombre del usuario: ");
				usuarioTemporal.setNombreUsuario(sc.next() );
				
				System.out.print("Ingrese el nombre unico de usuario: ");
				usuarioTemporal.setNombreIden(sc.next() );
				
				System.out.print("Ingrese la contraseña del usuario: ");
				usuarioTemporal.setCodigoUsuario(sc.next() );
				
				listaUsuario.add(usuarioTemporal);
				
				break;
				
			case 2:
				
				System.out.println("Cantidad de usuarios: " + listaUsuario.size() );
				
				if(listaUsuario.size() > 0) {
					
					for (Usuario usuario : listaUsuario) {
						
						System.out.println(usuario.getNombreUsuario() );
						System.out.println(usuario.getNombreIden() );
						
					}
					
				} else {
					
					System.out.println("No hay usuarios en el sistema");
					
				}
				
				break;
			
			}
			
		}

	}

}

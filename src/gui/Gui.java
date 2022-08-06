package gui;

import java.util.Scanner;

public class Gui {
	public static Scanner entrada = new Scanner(System.in);
	public static void Empleado() {
			Empleado.MenuE();
		}
	public static void Miembro() {
		Miembro.MenuM();
		}
	public static void Salir() {
		System.out.println("Ha salido del programa.");
		System.exit(0);
	}
	public static void Invalido() {
		System.out.println("Valor invalido.");
		System.out.println("pulse un numero entre 1 y 3.");
		MainMenu();
	}
	public static void Menu() {
		System.out.println("Hola");
		System.out.println("Bienvenido a Galaxy club.");
		MainMenu();
	}
	public static void MainMenu() {
		System.out.println("si es empleado pulse 1.");
		System.out.println("si es miembro pulse 2.");
		System.out.println("si desea salir pulse 3.");
		int opcion = entrada.nextInt();
		switch (opcion) {
		case 1: Empleado();
			break;
		case 2: Miembro();
			break;
		case 3: Salir();
			break;
		default: Invalido();
			break;
		}
		
	}
	

}

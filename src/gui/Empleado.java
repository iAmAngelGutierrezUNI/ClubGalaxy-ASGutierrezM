package gui;

import bll.Bll;
import dal.Dal;

public class Empleado {
	public static void MenuE() {
		System.out.println("Ha elegido empleado.");
		MainEmpleado();
	}
	static Bll libro = new Bll();
	public static void agregarE() {
		Dal leer = new Dal();
		System.out.println("Ha elegido agregar contacto.");
		System.out.println("Escriba su nombre.");
		leer.setNombreE(Gui.entrada.next());
		System.out.println("Escriba su año de nacimiento.");
		leer.setAñoE(Gui.entrada.nextLong());
		System.out.println("Escriba su genero.");
		leer.setGeneroE(Gui.entrada.next());
		if(libro.add(leer)==true) {	
		}else {System.out.println("Empleado agregado");
		
		}
		MainEmpleado();
	}
	public static void mostrarE() {
		System.out.println(libro);
		MainEmpleado();

	}
	public static void InvalidoE() {
		System.out.println("Opcion invalida pulse un numero entre 1 y 3.");
		MainEmpleado();

	}
	public static void MainEmpleado() {
		System.out.println("pulse 1 para agregar Empleado.");
		System.out.println("pulse 2 para mostrar lista de empleado.");
		System.out.println("pulse 3 para volver menu principal.");
		int opcionE = Gui.entrada.nextInt();
		switch (opcionE) {
		case 1: agregarE();
			break;
		case 2: mostrarE();
		break;
		case 3: Gui.MainMenu();
		break;

		default:InvalidoE();
			break;
		}
	}

}

package gui;

import bll.Bllm;
import dal.Dalm;

public class Miembro {
	public static void MenuM() {
		System.out.println("Ha elegido miembro.");
		MainMiembro();
	}
	static Bllm librom= new Bllm();
	public static void agregarM() {
		Dalm leerm = new Dalm();
		System.out.println("Ha elegido agregar contacto.");
		System.out.println("Escriba su nombre.");
		leerm.setNombreM(Gui.entrada.next());
		System.out.println("Escriba su año de nacimiento.");
		leerm.setAñoM(Gui.entrada.nextLong());
		System.out.println("Escriba su genero.");
		leerm.setGeneroM(Gui.entrada.next());
		if(librom.addm(leerm)==true) {
		}else {System.out.println("Miembro agregado");
		}
		MainMiembro();
	}
	public static void mostrarM() {
		System.out.println(librom);
		MainMiembro();
		
	}
	public static void InvalidoM() {
		System.out.println("Opcion invalida pulse un numero entre 1 y 3.");
		MainMiembro();

	}
	public static void MainMiembro() {
		System.out.println("pulse 1 para agregar miembro.");
		System.out.println("pulse 2 para mostrar lista de miembros.");
		System.out.println("pulse 3 para volver menu principal.");
		int opcionM = Gui.entrada.nextInt();
		switch (opcionM) {
		case 1: agregarM();
			break;
		case 2: mostrarM();
		break;
		case 3: Gui.MainMenu();
		break;

		default:InvalidoM();
			break;
}
	}
}

package bll;

import java.util.LinkedList;

import dal.Dal;
public class Bll {
LinkedList <Dal> lista = new LinkedList <Dal>();
	
	public boolean add (Dal leer) {
		char[] letras = leer.getNombreE().toCharArray();
		if(letras.length>=3 && letras.length<=10) {
		String enteroString= Long.toString(leer.getAñoE());
		letras=enteroString.toCharArray();
		if(letras.length==4) {
			lista.add(leer);
			return false;
		}
		
	}	return false;
	
	
}

	public LinkedList<Dal> getLista() {
		return lista;
	}

	public void setLista(LinkedList<Dal> lista) {
		this.lista = lista;
	}
	public String toString() {
		return "Bll [lista=" + lista + "]";
	}
	
}

package bll;

import java.util.LinkedList;

import dal.Dalm;

public class Bllm {
LinkedList <Dalm> listam = new LinkedList <Dalm>();
	
	public boolean addm (Dalm leerm) {
		char[] letrasm = leerm.getNombreM().toCharArray();
		if(letrasm.length>=3 && letrasm.length<=10) {
		String enteroStringm= Long.toString(leerm.getAñoM());
		letrasm=enteroStringm.toCharArray();
		if(letrasm.length==4) {
			listam.add(leerm);
			return false;
		}
		
	}	return false;
	
	
}

	public LinkedList<Dalm> getListam() {
		return listam;
	}

	public void setListam(LinkedList<Dalm> listam) {
		this.listam = listam;
	}

	@Override
	public String toString() {
		return "Bllm [listam=" + listam + "]";
	}


	}
	



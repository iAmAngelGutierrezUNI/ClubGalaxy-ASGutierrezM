package dal;

public class Dal {
	private String NombreE; 
	private String GeneroE; 	
	private long AñoE;
	public Dal() {
		super();
		
	}
	public Dal(String nombreE, String generoE, long añoE) {
		super();
		NombreE = nombreE;
		GeneroE = generoE;
		AñoE = añoE;
	}
	public String getNombreE() {
		return NombreE;
	}
	public void setNombreE(String nombreE) {
		NombreE = nombreE;
	}
	public String getGeneroE() {
		return GeneroE;
	}
	public void setGeneroE(String generoE) {
		GeneroE = generoE;
	}
	public long getAñoE() {
		return AñoE;
	}
	public void setAñoE(long añoE) {
		AñoE = añoE;
	}
	@Override
	public String toString() {
		return "Dal [NombreE=" + NombreE + ", GeneroE=" + GeneroE + ", AñoE=" + AñoE + "]";
	}
}

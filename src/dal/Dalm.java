package dal;

public class Dalm {
	private String NombreM; 
	private String GeneroM;
	private long AñoM;
	public Dalm() {
		super();

	}
	public Dalm(String nombreM, String generoM, long añoM) {
		super();
		NombreM = nombreM;
		GeneroM = generoM;
		AñoM = añoM;
	}
	public String getNombreM() {
		return NombreM;
	}
	public void setNombreM(String nombreM) {
		NombreM = nombreM;
	}
	public String getGeneroM() {
		return GeneroM;
	}
	public void setGeneroM(String generoM) {
		GeneroM = generoM;
	}
	public long getAñoM() {
		return AñoM;
	}
	public void setAñoM(long añoM) {
		AñoM = añoM;
	}
	public String toString() {
		return "Dalm [NombreM=" + NombreM + ", GeneroM=" + GeneroM + ", AñoM=" + AñoM + "]";
	}
}

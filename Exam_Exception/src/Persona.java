
public class Persona {
	
	String nom;
	String cognom;
	
	public Persona() {}
	
	public Persona(String nom, String cognom) {
		this.nom = nom;
		this.cognom = cognom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCognom() {
		return cognom;
	}
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

}

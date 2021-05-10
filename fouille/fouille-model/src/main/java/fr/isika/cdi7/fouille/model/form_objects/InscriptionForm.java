package fr.isika.cdi7.fouille.model.form_objects;

public class InscriptionForm {

	private String nom;
	private String prenom;
	private String email;
	private String motDePasse;

	public InscriptionForm() {

	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getEmail() {
		return email;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

}

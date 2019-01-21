package ma.ensa.sr.gestion.film.GestionFilm.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Film implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_film;
	private String titre;
	private String description;
	private String genre;
	private String affiche;
	private double prix;
	//salle
	private int numero_salle;
	private int nombre_places;
	private Date date_debut;
	private String heure_debut;
	private String heure_fin;
	@Column(name="realisateur")
	private String realisateur;
    private String acteurs;
    private int nombre_ticket;
	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNumero_salle() {
		return numero_salle;
	}

	public void setNumero_salle(int numero_salle) {
		this.numero_salle = numero_salle;
	}

	public int getNombre_places() {
		return nombre_places;
	}

	public void setNombre_places(int nombre_places) {
		this.nombre_places = nombre_places;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public String getHeure_debut() {
		return heure_debut;
	}

	public void setHeure_debut(String heure_debut) {
		this.heure_debut = heure_debut;
	}

	public String getHeure_fin() {
		return heure_fin;
	}

	public void setHeure_fin(String heure_fin) {
		this.heure_fin = heure_fin;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAffiche() {
		return affiche;
	}

	public void setAffiche(String affiche) {
		this.affiche = affiche;
	}

	public Long getId_film() {
		return id_film;
	}
	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getRéalisateur() {
		return realisateur;
	}

	public void setRéalisateur(String réalisateur) {
		this.realisateur = réalisateur;
	}

	public String getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}

	public String getActeurs() {
		return acteurs;
	}

	public void setActeurs(String acteurs) {
		this.acteurs = acteurs;
	}

	public int getNombre_ticket() {
		return nombre_ticket;
	}

	public void setNombre_ticket(int nombre_ticket) {
		this.nombre_ticket = nombre_ticket;
	}
	
	
	

}

package ma.ensa.sr.gestion.film.GestionFilm.metier;

import java.util.List;

import ma.ensa.sr.gestion.film.GestionFilm.entities.Adminstrateur;
import ma.ensa.sr.gestion.film.GestionFilm.entities.Film;

public interface FilmMetier {
	
	public Film addFilm(Film film);
	public Film getFilm(Long id_film);

	public List<Film> getListFilms();

	public Film updateFilm(Film film);

	public Long deleteFilm(Long id_film);
	
	public Film updateticket(Long id_film,int nmbTicket);
	
	public List<Adminstrateur> login(String username,String password);
	
}

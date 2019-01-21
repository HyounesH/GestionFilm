package ma.ensa.sr.gestion.film.GestionFilm.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.sr.gestion.film.GestionFilm.dao.FilmRepository;
import ma.ensa.sr.gestion.film.GestionFilm.entities.Adminstrateur;
import ma.ensa.sr.gestion.film.GestionFilm.entities.Film;
@Service
public class FilmMetierImpl implements FilmMetier{
	
	@Autowired
	private FilmRepository filmRepository;
	

	@Override
	public Film addFilm(Film film) {
		// TODO Auto-generated method stub
		return filmRepository.save(film);
	}

	@Override
	public List<Film> getListFilms() {
		// TODO Auto-generated method stub
		return filmRepository.findAll();
	}

	@Override
	public Film updateFilm(Film film) {
		// TODO Auto-generated method stub
		return filmRepository.save(film);
	}

	@Override
	public Long deleteFilm(Long id_film) {
		// TODO Auto-generated method stub
		filmRepository.deleteById(id_film);
		return id_film;
	}

	@Override
	public Film getFilm(Long id_film) {
		return filmRepository.getFilmById(id_film);
		
	}

	@Override
	public Film updateticket(Long id_film,int nombre_ticket) {
		Film film=filmRepository.getFilmById(id_film);
			film.setNombre_ticket(film.getNombre_ticket()+nombre_ticket);
		    updateFilm(film);
		return film;
	}


	@Override
	public List<Adminstrateur> login(String username, String password) {
		
		return filmRepository.login(username, password);
	}

}

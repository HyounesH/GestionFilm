package ma.ensa.sr.gestion.film.GestionFilm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.sr.gestion.film.GestionFilm.entities.Adminstrateur;
import ma.ensa.sr.gestion.film.GestionFilm.entities.Film;
import ma.ensa.sr.gestion.film.GestionFilm.metier.FilmMetier;

@RestController
@RequestMapping("/yosamo/")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class FilmController {
	 
	
	@Autowired
	private FilmMetier filmMetier;
	
	@RequestMapping(value="/film/login/{username}/{password}" , method=RequestMethod.GET)
	public List<Adminstrateur> login(@PathVariable String username,@PathVariable String password) {
		return filmMetier.login(username, password);
	}
	@RequestMapping(value="/film/ticket/{id}/{nb_ticket}",method=RequestMethod.GET)
	public Film updateticket(@PathVariable("id") Long id_film,@PathVariable("nb_ticket") int nombre_ticket) {
		return filmMetier.updateticket(id_film,nombre_ticket);
	}
	@RequestMapping(value="/film/{id}",method=RequestMethod.GET)
	public Film getFilm(@PathVariable("id") Long id_film) {
		return filmMetier.getFilm(id_film);
	}
	@RequestMapping(value="/film",method=RequestMethod.POST)
	public Film addFilm(@RequestBody Film film) {
		return filmMetier.addFilm(film);
	}
	@RequestMapping(value="/film",method=RequestMethod.GET)
	public List<Film> getListFilms() {
		return filmMetier.getListFilms();
	}
	@RequestMapping(value="/film",method=RequestMethod.PUT)
	public Film updateFilm(Film film) {
		return filmMetier.updateFilm(film);
	}
	
	@RequestMapping(value="/film/{id}",method=RequestMethod.DELETE)
	public Long deleteFilm(@PathVariable("id") Long id_film) {
		return filmMetier.deleteFilm(id_film);
	}

}

package ma.ensa.sr.gestion.film.GestionFilm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ma.ensa.sr.gestion.film.GestionFilm.entities.Adminstrateur;
import ma.ensa.sr.gestion.film.GestionFilm.entities.Film;

public interface FilmRepository extends JpaRepository<Film, Long> {
	
	@Query("SELECT f FROM Film f WHERE f.id_film=:id")
	public Film getFilmById(@Param("id") Long id_film);
	
	@Query("SELECT a FROM Adminstrateur a WHERE a.username =:username AND a.password=:password")
	public List<Adminstrateur> login(@Param("username") String username,@Param("password") String password);
	

}

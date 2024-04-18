package testgroup.filmography.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import testgroup.filmography.dao.FilmDAO;
import testgroup.filmography.dao.FilmDAOImpl;
import testgroup.filmography.model.Film;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmDAO filmDAO = new FilmDAOImpl();

    @Transactional
    @Override
    public List<Film> allFilms() {
        return filmDAO.allFilms();
    }

    @Transactional
    @Override
    public void add(Film film) {
        filmDAO.add(film);
    }

    @Transactional
    @Override
    public void delete(Film film) {
        filmDAO.delete(film);
    }

    @Transactional
    @Override
    public void edit(Film film) {
        filmDAO.edit(film);
    }

    @Transactional
    @Override
    public Film getById(int id) {
        return filmDAO.getById(id);
    }
}
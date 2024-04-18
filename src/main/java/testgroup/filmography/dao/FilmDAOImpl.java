package testgroup.filmography.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import testgroup.filmography.model.Film;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.*;

@Repository
public class FilmDAOImpl implements FilmDAO {

    //private SessionFactory sessionFactory;

    //@Autowired
    //public void setSessionFactory(SessionFactory sessionFactory) {
    //    this.sessionFactory = sessionFactory;
    //}

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Film> allFilms() {
        //Session session = sessionFactory.getCurrentSession();
        //return session.createQuery("from Film").list();

        return entityManager.createQuery("from Film").getResultList();
    }

    @Override
    public void add(Film film) {
        //Session session = sessionFactory.getCurrentSession();
        //session.persist(film);

        entityManager.persist(film);
    }

    @Override
    public void delete(Film film) {
        //Session session = sessionFactory.getCurrentSession();
        //session.delete(film);
        //entityManager.getTransaction().begin();
        entityManager.remove(entityManager.contains(film) ? film : entityManager.merge(film));
        //entityManager.remove(film);
        //entityManager.getTransaction().commit();
    }

    @Override
    public void edit(Film film) {
        //Session session = sessionFactory.getCurrentSession();
        //session.update(film);

        entityManager.merge(film);
    }

    @Override
    public Film getById(int id) {
        //Session session = sessionFactory.getCurrentSession();
        //return session.get(Film.class, id);

        return entityManager.find(Film.class, id);
    }
}
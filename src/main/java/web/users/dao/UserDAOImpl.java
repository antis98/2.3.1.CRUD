package web.users.dao;

import org.springframework.stereotype.Repository;
import web.users.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.*;

@Repository
public class UserDAOImpl implements UserDAO {

    //private SessionFactory sessionFactory;

    //@Autowired
    //public void setSessionFactory(SessionFactory sessionFactory) {
    //    this.sessionFactory = sessionFactory;
    //}

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> allUsers() {

        return entityManager.createQuery("from User").getResultList();
    }

    @Override
    public void add(User user) {

        entityManager.persist(user);
    }

    @Override
    public void delete(User user) {

        entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));
    }

    @Override
    public void edit(User user) {

        entityManager.merge(user);
    }

    @Override
    public User getById(int id) {

        return entityManager.find(User.class, id);
    }
}
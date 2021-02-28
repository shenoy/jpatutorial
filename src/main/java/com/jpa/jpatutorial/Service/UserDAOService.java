package com.jpa.jpatutorial.Service;

import com.jpa.jpatutorial.Entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@Repository
@Transactional
public class UserDAOService {
    @PersistenceContext
    private EntityManager entityManager;
    public long insert(User user){
        //Open transaction
        entityManager.persist(user);
        //Close transaction
        return user.getId();
    }
}

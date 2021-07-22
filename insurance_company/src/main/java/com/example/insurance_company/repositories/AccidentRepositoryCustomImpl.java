package com.example.insurance_company.repositories;
import com.example.insurance_company.models.Accident;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.jpa.HibernateEntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class AccidentRepositoryCustomImpl implements IAccidentRepositoryCustom{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Accident> findByZeroNumberOfVictims() {

        HibernateEntityManager hibernateEntityManager = entityManager.unwrap(HibernateEntityManager.class);
        Session session = hibernateEntityManager.getSession();

        List<Accident> accidents  = session.createSQLQuery("SELECT DISTINCT * from Accident where numer_victims = 0")
                .getResultList();

        return  accidents;
    }

    @Override
    public List<Accident> sortByDate() {
        HibernateEntityManager hibernateEntityManager = entityManager.unwrap(HibernateEntityManager.class);
        Session session = hibernateEntityManager.getSession();

        List<Accident> accidents  = session.createSQLQuery("SELECT DISTINCT * from Accident order by date asc")
                .getResultList();

        return  accidents;
    }


}

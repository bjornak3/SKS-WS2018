package services;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class ActorService {

    public ActorService(){}

    @PersistenceContext(unitName = "MovieServiceWebApp")
    private EntityManager em;

}

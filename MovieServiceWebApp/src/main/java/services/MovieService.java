package services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class MovieService {

    public MovieService(){}

    @PersistenceContext(unitName = "MovieServiceWebApp")
    EntityManager em;
}

package services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class StudioService {

    public StudioService(){}
    @PersistenceContext(unitName = "MovieServiceWebApp")
    EntityManager em;
}

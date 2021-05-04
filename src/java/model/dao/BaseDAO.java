package model.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/*@author Felipe Girardi Macedo*/

public class BaseDAO<T> {
    public EntityManager entityManager;
    
    public EntityManager getEntityManager()
    {
        if(entityManager == null){
            entityManager = Persistence.createEntityManagerFactory("MiniECommerce").createEntityManager();
        }
        return entityManager;
    }
    
    public T salvar(T objeto)
    {
        try
        {
            getEntityManager().getTransaction().begin();
            objeto = getEntityManager().merge(objeto);
            getEntityManager().getTransaction().commit();
        }
        catch(Exception e)
        {
          System.out.println("Erro: " + e.getLocalizedMessage());
          getEntityManager().getTransaction().rollback();
          return null; 
        }
        return objeto;
    }
    
}

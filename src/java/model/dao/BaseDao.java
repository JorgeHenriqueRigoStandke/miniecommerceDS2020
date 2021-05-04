package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class BaseDao <T>
{
    private static EntityManager INSTANCE;
    
    public static EntityManager getEntityManager()
    {
        if(INSTANCE == null)
        {
           INSTANCE = Persistence.createEntityManagerFactory("").createEntityManager();
        }
         
        return INSTANCE;
    }
    
    public T save(T object){
        
      try
        {
           getEntityManager().getTransaction().begin();
           object = getEntityManager().merge(object);
           getEntityManager().getTransaction().commit();
        }
        catch(Exception e)
        {
            System.out.println("Erro: " + e.getLocalizedMessage());
            getEntityManager().getTransaction().rollback();
            return null;
        }
        return object;
    }
    
     public List<T> getAllResults (String query)
    {
        return getEntityManager().createNamedQuery(query).getResultList();
    }
}

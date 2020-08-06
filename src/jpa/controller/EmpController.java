/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.controller;

import java.util.ArrayList;
import java.util.List;
import jpa.connection.ConnectionFactory;
import jpa.entity.RhEmpleado;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Mauricio Argumedo
 */
public class EmpController extends AbstractController<RhEmpleado>
{
    
    @Override
    protected EntityManager getEntityManager() {
        return ConnectionFactory.getInstance().getEntityManagerFactory().createEntityManager();
    }
    
    public List<RhEmpleado> findActive(RhEmpleado entity) throws Exception
    {
        EntityManager em = getEntityManager();
        
        
        List<RhEmpleado> entities = new ArrayList<>();
        
        
        try
        {
            String jpql = "SELECT e FROM " + entity.getClass().getSimpleName() + " e WHERE e.empEstado = :param";
            Query q = em.createQuery(jpql).setParameter("param", 0);
            entities = q.getResultList();
        }
        catch(Exception e)
        {
            throw new Exception(e);
        }
        finally
        {
            if (em.isOpen()) 
            {
                em.close();
            }
        }
        return entities;
    }

    
    
}

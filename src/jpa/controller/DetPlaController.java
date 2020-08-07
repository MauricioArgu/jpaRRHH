/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.controller;

import java.util.ArrayList;
import java.util.List;
import jpa.connection.ConnectionFactory;
import jpa.entity.RhDetallePlanilla;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import jpa.entity.RhEmpleado;
import jpa.entity.RhPlanilla;

/**
 *
 * @author Mauricio Argumedo
 */
public class DetPlaController extends AbstractController<RhDetallePlanilla>
{

    @Override
    protected EntityManager getEntityManager() 
    {
        return ConnectionFactory.getInstance().getEntityManagerFactory().createEntityManager();
    }
    
    public List<RhDetallePlanilla> findById(RhPlanilla pla) throws Exception
    {
        EntityManager em = getEntityManager();
        
        
        List<RhDetallePlanilla> entities = new ArrayList<>();
        
        
        try
        {
            String jpql = "SELECT r FROM RhDetallePlanilla r WHERE r.plnId = :param";
            Query q = em.createQuery(jpql).setParameter("param", pla);
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

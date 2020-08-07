/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.controller;

import java.util.ArrayList;
import java.util.List;
import jpa.connection.ConnectionFactory;
import jpa.entity.RhPlanilla;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import jpa.entity.RhDetallePlanilla;

/**
 *
 * @author Mauricio Argumedo
 */
public class PlaController extends AbstractController<RhPlanilla>
{
    @Override
    protected EntityManager getEntityManager() {
        return ConnectionFactory.getInstance().getEntityManagerFactory().createEntityManager();
    }
    
    public boolean validateMonth()throws Exception
    {
        EntityManager em = getEntityManager();
        
        try
        {
            String jpql = "SELECT r FROM RhPlanilla r WHERE FUNCTION('MONTH', r.plnFecha) = FUNCTION('MONTH', CURRENT_DATE)";
            Query q = em.createQuery(jpql);
            if(q.getResultList().size() > 0)
            {
                return false;
            }
            else
            {
                return true;
            }
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
    }
}

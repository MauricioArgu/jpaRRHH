/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.controller;

import jpa.connection.ConnectionFactory;
import jpa.entity.RhDetallePlanilla;
import javax.persistence.EntityManager;

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
    
}

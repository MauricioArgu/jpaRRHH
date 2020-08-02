/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.controller;

import jpa.connection.ConnectionFactory;
import jpa.entity.RhDepartamento;
import javax.persistence.EntityManager;

/**
 *
 * @author Maury
 */
public  class DepController extends AbstractController<RhDepartamento>
{

    @Override
    protected EntityManager getEntityManager() 
    {
        return ConnectionFactory.getInstance().getEntityManagerFactory().createEntityManager();
    }

    
    
}

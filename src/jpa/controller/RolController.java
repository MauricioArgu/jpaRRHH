/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.controller;

import jpa.connection.ConnectionFactory;
import jpa.entity.RhRol;
import javax.persistence.EntityManager;

/**
 *
 * @author Mauricio
 */
public class RolController extends AbstractController<RhRol>
{
    @Override
    protected EntityManager getEntityManager() 
    {
        return ConnectionFactory.getInstance().getEntityManagerFactory().createEntityManager();
    }
}

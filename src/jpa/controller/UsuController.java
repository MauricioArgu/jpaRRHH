/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.controller;

import jpa.connection.ConnectionFactory;
import jpa.entity.RhUsuario;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Mauricio Argumedo
 */
public class UsuController extends AbstractController<RhUsuario>
{
    public RhUsuario validarUsuario(String email)
    {
        Query q = getEntityManager().createQuery("SELECT u FROM RhUsuario u WHERE u.usCorreo = :email");
        q.setParameter("email", email);
        return(RhUsuario) q.getSingleResult();
    }

    @Override
    protected EntityManager getEntityManager() {
        return ConnectionFactory.getInstance().getEntityManagerFactory().createEntityManager();
    }
    
}

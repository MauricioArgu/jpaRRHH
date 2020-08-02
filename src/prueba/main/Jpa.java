/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.main;

import java.util.logging.Level;
import java.util.logging.Logger;
import jpa.connection.ConnectionFactory;
import jpa.controller.RolController;
import jpa.entity.RhEmpleado;
import jpa.entity.RhRol;

/**
 *
 * @author Maury
 */
public class Jpa 
{
    public static void main(String[] args) 
    {
        RolController rolController = new RolController();
        
        
        
        RhRol remove = new RhRol(7, "Data");
        
        
        try 
        {
            /*if (rolControlador.encontrarTodos(remove).isEmpty()) 
            {
                System.out.println("Esta vacio");
            }
            else
            {
                for(int i = 0; i < rolControlador.encontrarTodos(remove).size(); i++)
                {
                    System.out.println(rolControlador.encontrarTodos(remove).get(i).getRolNombre());
                }
            }*/
            
            Object obj = new Object();
            
            obj = 1;
            if (rolController.find(remove, obj)) {
                System.out.println("Encontrado");
            }
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(Jpa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
}

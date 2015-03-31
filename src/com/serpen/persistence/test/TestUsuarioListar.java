/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serpen.persistence.test;

import com.serpen.persistence.conf.HibernateUtil;
import com.serpen.persistence.entity.User;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author USER
 */
public class TestUsuarioListar {
    
    public static void main(String []args){
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        List listaUsuario = sesion.createQuery(
          "from usuario " +
          "in class com.serpen.persistence.entity.User").list();
        for (int i = 0; i<listaUsuario.size(); i++) {
           User user =(User) listaUsuario.get(i);
            System.out.println(user);
       }
    }
}

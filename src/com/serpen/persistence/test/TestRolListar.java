/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serpen.persistence.test;

import com.serpen.persistence.conf.HibernateUtil;
import com.serpen.persistence.entity.Role;
import java.util.List;
import org.hibernate.Session;
/**
 *
 * @author USER
 */
public class TestRolListar {
   public static void main(String[]arg){
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        List listaRol = sesion.createQuery(
          "from rol " +
          "in class com.serpen.persistence.entity.Role").list();
        for (int i = 0; i<listaRol.size(); i++) {
           Role role =(Role) listaRol.get(i);
            System.out.println(role);
       }    
    }
}

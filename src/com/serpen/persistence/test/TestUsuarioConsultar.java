/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serpen.persistence.test;

import com.serpen.persistence.conf.HibernateUtil;
import com.serpen.persistence.entity.User;
import org.hibernate.Session;

/**
 *
 * @author USER
 */
public class TestUsuarioConsultar {
    
    public static void main(String []args){
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        User role = (User) sesion.load(User.class, 2);
        System.out.println(role);
        sesion.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author 91744
 */
public class DAO {
    
    public void create(Practice p){
        Session s = HConfig.getSessionFactory().openSession();
        Transaction tx = s.beginTransaction();
        s.save(p);
        tx.commit();
        s.close();
    }
    
    public Practice read(int id) {
        Session s = HConfig.getSessionFactory().openSession();
        Transaction tx = s.beginTransaction();
        Practice p1 = s.get(Practice.class, id);
        System.out.println(p1.toString());
        tx.commit();
        s.close();
        return p1;
    }
    
    public void update(int id, String name, String pass) {
        Session s = HConfig.getSessionFactory().openSession();
        Transaction tx = s.beginTransaction();
        Practice p1 = s.get(Practice.class, id);
        p1.setName(name);
        p1.setPass(pass);
        tx.commit();
        s.close();
    }
    
    public void delete(Integer id) {
        Session s = HConfig.getSessionFactory().openSession();
        Transaction tx = s.beginTransaction();
        s.delete(id);
        tx.commit();
        s.close(); 
    }
    
    
}

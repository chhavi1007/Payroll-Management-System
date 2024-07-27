/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hibernate;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author 91744
 */
public class HConfig {
    public static SessionFactory factory;
    
    public static SessionFactory getSessionFactory() {
        if (factory == null) {
            try{
            Configuration cfg = new Configuration();
            Properties prop = new Properties();
            prop.setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver" );
            prop.setProperty(Environment.URL, "jdbc:mysql://localhost:3306/practice");
            prop.setProperty(Environment.USER, "root");
            prop.setProperty(Environment.PASS,"");
            prop.setProperty(Environment.HBM2DDL_AUTO, "update");
            prop.setProperty(Environment.SHOW_SQL,"true");
            prop.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
            
            cfg.setProperties(prop);
            cfg.addAnnotatedClass(Practice.class);
            ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
            factory = cfg.buildSessionFactory();
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
            
        }
        return factory;
    }
}

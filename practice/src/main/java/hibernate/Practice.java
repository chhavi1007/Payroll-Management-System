/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hibernate;

import jakarta.persistence.*;

/**
 *
 * @author 91744
 */
@Entity
@Table
public class Practice {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int Id;
    
    @Column(name="Name", length = 100, nullable = false)
    private String name;
    
    @Column(name = "Password", length = 100, nullable = false)
    private String pass;

    public Practice() {
        
    }

    public Practice(String name, String pass) {
       // this.Id = Id;
        this.name = name;
        this.pass = pass;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Practice{" + "Id=" + Id + ", name=" + name + ", pass=" + pass + '}';
    }
    
    
    
    
    
    
    
}

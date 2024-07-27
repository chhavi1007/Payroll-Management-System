/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.erp.p4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author 91744
 */
public class MainTest {
    static Main obj=new Main();
        
    
    @Test
    void addTest(){
        //expected
        int ex=7;
        
        
        //actual
        int ac =obj.add(5, 2);
        
        Assertions.assertEquals(ex, ac);
    
    }
    
    
        @Test
    void subTest(){
        //Main obj=new Main();
        //expected
        int ex=3;
        
        
        //actual
        int ac =obj.sub(5, 2);
        
        Assertions.assertEquals(ex, ac);
    
    }
    @Test
    void mulTest() {
        int ex=15;
        int ac=obj.mul(5, 3);
        
        Assertions.assertEquals(ex, ac);
    }
    @Test
    void divTest() {
        int ex=2;
        int ac=obj.div(10, 5);
        Assertions.assertEquals(ex, ac);
    } 
   }
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mathunittest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 91744
 */
public class NewEmptyJUnitTest {
    
    @Test
    void NewEmptyJUnitTest() {
        int act = 67;
        int ex = new MathUnitTest().add(40, 27);
        assertEquals( ex, act);
    }
    
}

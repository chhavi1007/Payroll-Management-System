/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical3;

/**
 *
 * @author 91744
 */
public class SharedClass {
public static int sharedCounter = 0;
public static void main(String[] args) {
ProcessOne processOne = new ProcessOne();
ProcessTwo processTwo = new ProcessTwo();
Thread threadOne = new Thread((Runnable) processOne); 
Thread threadTwo = new Thread((Runnable) processTwo); 
threadOne.start();
threadTwo.start();
}
}

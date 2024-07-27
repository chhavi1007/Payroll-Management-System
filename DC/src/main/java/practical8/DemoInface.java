/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical8;

/**
 *
 * @author 91744
 */
public interface DemoInface {
 
 default String sayHello(String name) {
 return "Hello, "+name;
 }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical3;

import javax.annotation.processing.Generated;

/**
 *
 * @author 91744
 */
public class ProcessTwo implements Runnable {
@Override
public void run() {
// throw new UnsupportedOperationException("Not supported yet."); //
//Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
for (int i = 0; i <= 3; i++) {
System.err.println("\nShared memory accessed by ClassTwo. \nIncremented counter. \nValue:-");
SharedClass.sharedCounter += 1;
System.err.println(SharedClass.sharedCounter);
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
System.out.println(e.getMessage());
}
}
}
}
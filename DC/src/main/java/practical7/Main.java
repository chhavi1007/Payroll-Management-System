/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical7;

/**
 *
 * @author 91744
 */
public class Main {
 public static int a = 1, b = 1, c = 0, w = 0;
//Lock
 void wait(int s) {
 while(s <= 0);
 s = s-1;
}
//Signal
 void signal(int s) {
 s = s+1;
 }
//Read
 public void r() {
 wait(a);
 c = c+1;
 if (c >= 1) {
 System.out.println("Wait! Reading is performed!");
 wait(b);
 }
 signal(a);
 
 System.out.println("Reading finished...");
 wait(a);
 c = c-1;
 if (c == 0 && w == 4) {
 System.out.println("No readers, continue");
 signal(b);
 }
 signal(a);
 }
 //Write
 public void w() {
 wait(b);
 System.out.println("Write");
 signal(a);
 }
 //Main
 public static void main(String[] args) {
 while(w != 4) {
 new Main().w();
 new Main().r();
 w += 1;
 }
 } 
}


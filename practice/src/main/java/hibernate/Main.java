/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hibernate;

/**
 *
 * @author 91744
 */
public class Main {

    public static void main(String[] args) {
       // System.out.println("Hello World!");
       Practice p = new Practice("XYZ","5678");
       DAO dao = new DAO();
       
      // dao.create(p);
       //dao.read(1);
       //p2.toString();
       //System.out.println("Id: "+p2.getId());
       dao.delete(1);
       
    }
}

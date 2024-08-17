/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package length;

/**
 *
 * @author Hp
 */
public class Length {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Argument ob1 = new Argument();
        ob1.add(10,20);
        ob1.add(10,20,30);
        // TODO code application logic here
        Variable_length ob2 = new Variable_length();
        ob2.Mult(10,20);
        ob2.Mult(10,20,30);
        ob2.Sub(10,20);
        ob2.Sub(10,20,30);
    }
    
}

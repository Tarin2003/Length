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
public class Variable_length {
    void Mult(int ... num){
        int sum = 1;
        for(int x : num){
            sum = x*sum;
        }
    
        System.out.println(sum);
    }
        
       void Sub(int ... num){
        int s = 0;
        for(int x : num){//subtraction not satisfy
            s = x-s;
        } 
         System.out.println(s);
    }
}
    



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1Ex2;

/**
 *
 * @author Farkas
 */
public class Tester   {
    public static void main(String[] args) {
        
   
    Even even = new Even();
    
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1e8; i++) {
                double a = even.next();
                if (even.isEven(a)) {
                    System.out.println("t1, Even");    
                } else {
                    System.out.println("t1, Odd");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1e8; i++) {
                double a = even.next(); 
                if (even.isEven(a)) {
                    System.out.println("t2, Even");
                } else { 
                    System.out.println("t2 Odd");
                }
            }
        });

    t1.start();
    t2.start();
    
    }
}

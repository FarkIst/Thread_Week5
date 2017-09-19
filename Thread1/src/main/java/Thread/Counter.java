/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Thread;

/**
 *
 * @author Farkas
 */
public class Counter {
    public static void main(String[] args) {
        
    
    Thread t1 = new Thread(()->{
        long sum = 0;
        for (int i = 1; i <= 10; i++ ){
            sum += i;
            System.out.println(sum);
        }
    });
    
    
    Thread t2 = new Thread(()->{
        
    });
    
    Thread t3 = new Thread(()->{
        
    });
    
    t1.start();
    }
}

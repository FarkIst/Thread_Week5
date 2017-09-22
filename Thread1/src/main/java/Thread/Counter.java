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
    public static void main(String[] args) throws InterruptedException {
        
    
    Thread t1 = new Thread(()->{
        long sum = 0;
        for (int i = 1; i <= 1e6; i++ ){
            sum += i;
          
        }
        System.out.println("Thread1 sum: "+sum);
    });
    
    
    Thread t2 = new Thread(()->{
       
        int num = 1;
        while(num <= 5){
        System.out.println("Thread2: "+num);
      num++;
      try {
        Thread.sleep(2000);        
      } catch (InterruptedException ex) {}
    }
    });
    
    Thread t3 = new Thread(()->{
        int numb = 10;
        while(numb > 9){
        System.out.println("Thread 3: "+numb);
      numb++;
      try {
        Thread.sleep(3000);        
      } catch (InterruptedException ex) {}
    }
    });
    
    t1.start();
    t2.start();
    t3.start();
    
    t1.join();
    t2.join(1000);
    t3.join(10000);
    }
}

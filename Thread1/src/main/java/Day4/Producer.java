/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day4;

import java.util.concurrent.BlockingQueue;

/**
 *
 * @author Farkas
 */
public class Producer implements Runnable{
    
    private BlockingQueue<Long> s1;
    private BlockingQueue<Long> s2;

    public Producer(BlockingQueue<Long> s1, BlockingQueue<Long> s2){
        this.s1 = s1; 
        this.s2 = s2;
    }
    
    @Override
    public void run() {
        long num;
       
      while (!s1.isEmpty()){
          num = s1.poll();
            try {
                s2.put(generateFN(num));
            } catch (InterruptedException ex) {
               
            }
      }
    }
    
    public long generateFN(long n) throws InterruptedException{
            if ((n==0) || (n==1)){
                return n;
            }else{
                return generateFN(n-1) + generateFN(n-2);
            }
        
    }
    
}

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

public class Even
{
    private int n = 0;
      public int next()
    {
    n++;
    n++;
    return n;
    }

  
    
    public synchronized boolean isEven(double value) { 
    if (value % 2 == 0) {
        return true;
    } else {
        return false;
        }
    }
}


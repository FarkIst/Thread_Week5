/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Farkas
 */
public class Worker implements Runnable{
    
    private String result = "Error";
    private String url;
    
    
    public Worker(String url){
        this.url = url;
    }
    @Override
    public void run() {
         
        try {
            URL siteURL = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) siteURL
                    .openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
 
            int code = connection.getResponseCode();
            if (code == 200) 
                result = "Green";
            if(code==301)
                result="Redirect";
        } catch (Exception e) {
            result = "->Red<-";
        }
        Callable.add((url + " \tStatus:" + result));
    }
       
    }


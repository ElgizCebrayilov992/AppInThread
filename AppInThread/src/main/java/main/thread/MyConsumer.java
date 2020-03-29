/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author virtu
 */
public class MyConsumer implements Runnable{
    private String name;
    public MyConsumer(String name){
    this.name=name; 
    }
   
    @Override
    public void run(){
       // System.out.println("connect");
//        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                  }
            
            int a=Base.getA();
            a++;
        Base.incA();
      //  System.out.println(name+ " : "+Base.getA());
           // System.out.println("elgiz= "+Base.a);
        //}
       
    }
    
}

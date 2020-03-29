/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.UUID;
import main.thread.Base;
import main.thread.MyConsumer;
import main.thread.MyProducer;

/**
 *
 * @author virtu
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread count: "+Thread.activeCount());
  
        Thread[] threads=new Thread[100];
        for (int i = 0; i < 100; i++) {
            String s=UUID.randomUUID().toString();
           // System.out.println("1ci for ");
            threads[i]=new Thread(new MyConsumer(s));
        }
        for (int i = 0; i < 100; i++) {
            //System.out.println("2ci for");
            threads[i].start();
        }
        System.out.println("Thread count: "+Thread.activeCount());
        
        Thread.sleep(5000);
        System.out.println("main: "+Base.getA());
    }
    
}

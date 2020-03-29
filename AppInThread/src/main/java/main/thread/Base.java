/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.thread;

import java.util.ArrayList;
import java.util.List;
import jdk.nashorn.internal.codegen.types.Type;

/**
 *
 * @author virtu
 */
public class Base {
    private static volatile int a=0;
    
    public   static int  getA(){
        return a;
    }
    
    public  synchronized static void incA(){
            a++;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

import java.util.Calendar;

/**
 *
 * @author Delia
 */
public class Programacion2_2015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar now=Calendar.getInstance();
        System.out.println(now.getTime());
        //imprimir los milisegundos
        System.out.println(now.getTimeInMillis());
        
        Calendar old = Calendar.getInstance();
        old.setTimeInMillis(1);
        System.out.println(old.getTime());
        old.set(1995,Calendar.NOVEMBER , 19);
        System.out.println(old.getTime());
        //comparaciones
        if(now.getTimeInMillis()>old.getTimeInMillis())
            System.out.println("Now pasó después que old");
        if(now.after(old))
            System.out.println("Now pasó después que old");
        if(old.before(now))
            System.out.println("Old pasó antes que Now");
        
        
        
    }
    
}

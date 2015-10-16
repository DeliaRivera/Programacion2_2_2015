/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Delia
 */
public class ColeccionDinamica {
    public static void main(String[] args) {
        ArrayList<String> coleccion= new ArrayList<>();
        coleccion.add("Delia");
        coleccion.add("Melissa");
        coleccion.add("Hola");
        for(String cad: coleccion)
            System.out.println("-" + cad);
        
        for( int p= 0; p < coleccion.size();p++){
            System.out.println("-"+coleccion.get(p));
            //Esto da IndexOutOfBoundExeption
            //System.out.println()
            
        if(coleccion.contains("chuco"))
                System.out.println("Si encontre Chuco");
        coleccion.remove("Chuco");
        coleccion.remove(0);
        
    }      
    }
 
}

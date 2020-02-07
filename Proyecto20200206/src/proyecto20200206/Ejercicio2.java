/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto20200206;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Ejercicio2 {

    public Ejercicio2() {
    }
    
    public ArrayList<Integer> hallarListaDePosicionesIniciales(ArrayList listaBusqueda, ArrayList listaSecuencial){
        ArrayList<Integer> resultado = new ArrayList<Integer>();
            int i=0;
            for(int j=0;j<listaBusqueda.size();j++){
                if(listaBusqueda.get(j) == listaSecuencial.get(i)){
                    i++;
                    if(i==listaSecuencial.size()){
                        resultado.add(j-i+1);
                        i=0;
                    }
                   
                }
                
            }
          
        
        return resultado;
    }
}

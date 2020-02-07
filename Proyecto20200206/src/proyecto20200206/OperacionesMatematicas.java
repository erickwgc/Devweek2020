
package proyecto20200206;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class OperacionesMatematicas {

    public OperacionesMatematicas() {
    }
    public static Ecuacion sumarEcuaciones(Ecuacion ecuacion1, Ecuacion ecuacion2){
        Ecuacion resultado = new Ecuacion(new ArrayList<Termino>());
        int tamano1 = ecuacion1.size();
        int tamano2 = ecuacion2.size();
        
            Termino terminoSacado;
            int coeficienteX = 0;
            int coeficienteY = 0;
            int coeficienteIndependiente = 0;
            while(!ecuacion1.isEmpty()){
                terminoSacado = ecuacion1.remove(0);
                if(!terminoSacado.esIndependiente()){
                   if(terminoSacado.getVariable()=='x'){
                       coeficienteX+=terminoSacado.getCoeficiente();
                   }else{
                   if(terminoSacado.getVariable()=='y'){
                       coeficienteY+=terminoSacado.getCoeficiente();
                        }
                    }
                }else{
                    coeficienteIndependiente+=terminoSacado.getCoeficiente();
                }
            }
            while(!ecuacion2.isEmpty()){
                terminoSacado = ecuacion2.remove(0);
                if(!terminoSacado.esIndependiente()){
                   if(terminoSacado.getVariable()=='x'){
                       coeficienteX+=terminoSacado.getCoeficiente();
                   }else{
                   if(terminoSacado.getVariable()=='y'){
                       coeficienteY+=terminoSacado.getCoeficiente();
                        }
                    }
                }else{
                    coeficienteIndependiente+=terminoSacado.getCoeficiente();
                }
            }
        
        resultado.add(new Termino(coeficienteX,'x'));
        resultado.add(new Termino(coeficienteY,'y'));
        resultado.add(new Termino(coeficienteIndependiente));
        return resultado;
    }
  
    
}

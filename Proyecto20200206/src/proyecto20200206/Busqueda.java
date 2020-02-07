
package proyecto20200206;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
public class Busqueda {

    public Busqueda() {
    }
    
 public boolean busquedaLineal(Valor buscando, ArrayList lista){
    boolean encontrado=false;
     for(int i=0;i<lista.size();i++){
        if(buscando.get()==lista.get(i)){
            encontrado = true;
        }
    }
     return encontrado;
            
 }
 public int busquedaBinaria(int buscando, int[] lista){
  int n = lista.length;
  int centro,inf=0,sup=n-1;
   while(inf<=sup){
     centro=(sup+inf)/2;
     if(lista[centro]==buscando) return centro;
     else if(buscando < lista [centro] ){
        sup=centro-1;
     }
     else {
       inf=centro+1;
     }
   }
   return -1;
 }
}

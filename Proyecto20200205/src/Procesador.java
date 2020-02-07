
import java.util.ArrayList;



/**
 *
 * @author ASUS
 */
public class Procesador {

    public Procesador() {
    }
    public ArrayList<Digito> descomponerNumero(int numero){
        ArrayList<Digito> digitos = new ArrayList<Digito>();
        int posicion = 1;
        while(numero != 0){
            digitos.add(new Digito(numero%10,posicion));
            numero=numero/10;
            posicion++;
        }
        return digitos;
    }
    public int invertirNumero(int numero){
        int inverso = 0;
        int residuo;
        while(numero>0){
            residuo = numero % 10;
            inverso = inverso *10 + residuo;
            numero = numero/10;
        }
        return inverso;
    }
   
}

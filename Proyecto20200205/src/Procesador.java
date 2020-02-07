
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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

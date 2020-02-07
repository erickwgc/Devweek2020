/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class Pruebas20200205 {
    
    public Pruebas20200205() {
    }
     @Test
    public void convertirdecimal25ABinario(){
        NumeroDecimal numero = new NumeroDecimal(25);
        String esperado = "11001";
        String obtenido = numero.convertirDecimalABinario();
        assertEquals(esperado,obtenido);
    }
    
    @Test
    public void convertirbinario11001ADecimal(){
        NumeroBase numero = new NumeroBase("11001",2);
        int esperado  = 25;
        int obtenido = numero.convertirNumeroDeCualquierBaseADecimal();
        assertEquals(esperado, obtenido);
        
    }
    @Test
    public void convertir43014Base5ADecimal(){
        NumeroBase numero = new NumeroBase("43014",5);
        int esperado  = 2884;
        int obtenido = numero.convertirNumeroDeCualquierBaseADecimal();
        assertEquals(esperado, obtenido);
    }
    @Test
    public void decifrarMensaje(){
        int[] mensajeEjemplo = {34,66,105,101,110,118,101,110,105,100,111,
                                115,32,97,32,108,97,32,70,117,110,100,
                                97,99,105,111,110,32,74,97,108,97,32,
                                58,45,41,33,34};
        MensajeASCII mensaje = new MensajeASCII(mensajeEjemplo);
        String esperado = "\"Bienvenidos a la Fundacion Jala :-)!\"";
        String obtenido = mensaje.decifrarMensaje(mensajeEjemplo);
    
        assertEquals(esperado, obtenido);
    }
    @Test
    public void descomponerNumero(){
        Procesador procesador = new Procesador();
        int numero = 1237;
        ArrayList<Digito> esperado = new ArrayList<Digito>();
        esperado.add(new Digito(7,1));
        esperado.add(new Digito(3,2));
        esperado.add(new Digito(2,3));
        esperado.add(new Digito(1,4));
        ArrayList<Digito> obtenido = procesador.descomponerNumero(1237);
        assertEquals(esperado.get(0).getDigito(),obtenido.get(0).getDigito());
        System.out.println("Mostrando Dígitos de Izquierda A Derecha");
        for(int i=0;i<obtenido.size();i++){
            System.out.println("posicion "+obtenido.get(i).getPosicion()+": "+obtenido.get(i).getDigito());   
        }
    }
    @Test
    public void invertirNumero(){
        Procesador procesador = new Procesador();
        int numero = 1237;
        int esperado = 7321;
        int obtenido = procesador.invertirNumero(numero);
        assertEquals(esperado,obtenido);
    }
}

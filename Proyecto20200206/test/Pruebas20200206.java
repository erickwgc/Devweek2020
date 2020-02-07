/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import proyecto20200206.Busqueda;
import proyecto20200206.Ecuacion;
import proyecto20200206.Ejercicio2;
import proyecto20200206.Termino;
import proyecto20200206.OperacionesMatematicas;
import proyecto20200206.Valor;

/**
 *
 * @author ASUS
 */
public class Pruebas20200206 {
    
    public Pruebas20200206() {
    }
    @Test
    public void testSumarEcuaciones(){
        Ecuacion ecuacion1 = new Ecuacion( new ArrayList<Termino>());
                ecuacion1.add(new Termino(2,'x'));
                ecuacion1.add(new Termino(9,'y'));
                ecuacion1.add(new Termino(2));
        Ecuacion ecuacion2 = new Ecuacion(new ArrayList<Termino>());
               ecuacion2.add(new Termino(16,'x'));
               ecuacion2.add(new Termino(5,'y')); 
               ecuacion2.add(new Termino(36));
        Ecuacion esperado = new Ecuacion(new ArrayList<Termino>());
        esperado.add(new Termino(18,'x'));
        esperado.add(new Termino(14,'y'));
        esperado.add(new Termino(38));
        OperacionesMatematicas procesador= new OperacionesMatematicas();
        Ecuacion obtenido = procesador.sumarEcuaciones(ecuacion1,ecuacion2);
        assertEquals(esperado.get(0).getVariable(), obtenido.get(0).getVariable());
    }
    
    @Test
    public void testListaDePosicionesIniciales(){
        ArrayList<Integer> listaBusqueda = new ArrayList<Integer>();
        listaBusqueda.add(7);
        listaBusqueda.add(4);
        listaBusqueda.add(9);
        listaBusqueda.add(2);
        listaBusqueda.add(15);
        listaBusqueda.add(3);
        listaBusqueda.add(4);
        listaBusqueda.add(8);
        listaBusqueda.add(1);
        listaBusqueda.add(8);
        listaBusqueda.add(5);
        listaBusqueda.add(2);
        listaBusqueda.add(15);
        listaBusqueda.add(11);
        listaBusqueda.add(13);
        listaBusqueda.add(17);
        listaBusqueda.add(14);
        
        ArrayList<Integer> listaSecuencial = new ArrayList<Integer>();
        listaSecuencial.add(2);
        listaSecuencial.add(15);
        ArrayList<Integer> esperado = new ArrayList<Integer>();
        esperado.add(3);
        esperado.add(11);
        Ejercicio2 ejercicio2 = new Ejercicio2();
        ArrayList<Integer> obtenido = ejercicio2.hallarListaDePosicionesIniciales(listaBusqueda, listaSecuencial);
        assertArrayEquals(esperado.toArray(), obtenido.toArray());
    }
       @Test
       public void testBusquedaLineal(){
           Busqueda busqueda = new Busqueda();
           Valor<Integer> buscando = new Valor(5);
           
           ArrayList lista = new ArrayList();
           lista.add(4);
           lista.add("Hola");
           lista.add('j');
           lista.add(5);
           
           assertTrue(busqueda.busquedaLineal(buscando, lista));
       }
       @Test
       public void testBusquedaBinaria(){
           Busqueda busqueda = new Busqueda();
           int [] lista = {2,3,6,7,8,9};
           int buscando = 6;
           int esperado = 2;
           assertEquals(esperado,busqueda.busquedaBinaria(buscando, lista));
       }
}

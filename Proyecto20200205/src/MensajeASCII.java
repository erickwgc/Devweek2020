/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class MensajeASCII {
     int[] mensaje;
    public MensajeASCII(int[] mensaje){
        this.mensaje = mensaje;
    }
    public String decifrarMensaje(int[] mensaje){
        String mensajeDecifrado = "";
        for(int i=0;i<mensaje.length;i++){
            mensajeDecifrado +=(char)mensaje[i];
        }
        return mensajeDecifrado;
    }
}

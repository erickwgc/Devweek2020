
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

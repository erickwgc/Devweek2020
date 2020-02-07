
/**
 *
 * @author ASUS
 */
public class NumeroBase {
    String numero ;
    int base;
    public NumeroBase(String numero,int base){
        this.numero = numero;
        this.base = base;
    } 

    public String getNumero() {
        return numero;
    }

    public int getBase() {
        return base;
    }
    
    public int convertirNumeroDeCualquierBaseADecimal(){
        int decimal = 0;
        int longitud = numero.length();
        for(int posicion = 0 ; posicion<numero.length();posicion++){
            decimal += Character.getNumericValue(numero.charAt(longitud-1))*Math.pow(base,posicion);
            longitud--;
        }
        return decimal;
    }
}

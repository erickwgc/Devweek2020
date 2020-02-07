

/**
 *
 * @author ASUS
 */
public class NumeroDecimal {
     int numero ;
    public NumeroDecimal(int numero){
    this.numero = numero;
    }
    
    public String convertirDecimalABinario(){
        String binario ="";
        if(numero >0){
            while(numero>=2){
                binario = binario+numero%2;
                numero = numero/2;
            }
            binario = numero + binario;
        }
        return binario;
    }
    
}

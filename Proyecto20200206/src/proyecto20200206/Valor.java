
package proyecto20200206;

/**
 *
 * @author ASUS
 */
public class Valor<T> {
    private T t;
    public Valor(T t){
        this.t = t;
    }
    public void set(T t){
        this.t=t;
    }
    public T get(){
        return t;
    }
}

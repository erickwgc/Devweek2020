/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

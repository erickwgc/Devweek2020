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
public class Termino {
    private int coeficiente ;
    private char variable;
    private boolean esIndependiente;

    public Termino(int coeficiente, char variable) {
        this.coeficiente = coeficiente;
        this.variable = variable;
        esIndependiente = false;
    }

    public Termino(int coeficiente) {
        this.coeficiente = coeficiente;
        esIndependiente = true;
    }

    public int getCoeficiente() {
        return coeficiente;
    }

    public char getVariable() {
        return variable;
    }
    public boolean esIndependiente(){
        return esIndependiente;
    }
    
}

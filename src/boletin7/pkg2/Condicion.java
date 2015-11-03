/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class Condicion {
    
    private short numero1;
    private short numero2;
    
    public Condicion(){
        
    }
    public Condicion(short num1,short num2){
        numero1=num1;
        numero2=num2;
    }
    public short getNumero(){
        String respuesta = JOptionPane.showInputDialog("Introduce Número: ");
        short valor = Short.parseShort(respuesta);
        return valor;
    }
    public void comparar(short n1, short n2){
        numero1=n1;
        numero2=n2;
        if(n1>=n2){
            JOptionPane.showMessageDialog(null,"Resta= "+(n1-n2));
        }
        JOptionPane.showMessageDialog(null,"Suma= "+(n1+n2));
        }
}

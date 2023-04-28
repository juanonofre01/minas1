
package com.mycompany.buscaminas;

import javax.swing.JButton;
/**
 * integrantes
 * Juan Goyes 
 * Josue Cardona
 * Esneyder Ibarra
 * Juan Achicanoy
 * Esteban Riacos
 * Nicolas Benavides
 * 
 */

/**
 * Metodo para mostrar el cuadro donde se encuentran las minas 
 * 
 */
public class Cuadro extends JButton{
    private boolean mina;
    
    public Cuadro(){
        super();
        double random = Math.random();
        if (random > 0.9)
            mina=true;
        else
            mina=false;
    }
    public boolean estaMinado(){
        return mina;
    }
}

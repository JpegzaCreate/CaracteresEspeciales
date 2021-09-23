/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracteresespeciales;

/**
 *
 * @author javip
 */
public class CaracteresEspeciales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var centro = "CEEP";
        System.out.println("Salto de linea: \n" + centro);
        System.out.println("Tabulador: \t" + centro);
        System.out.println("Retroceso: \b" + centro);
        System.out.println("Comilla simple, solo una letra:" + 'c');
        System.out.println("Comilla doble:" + "CEEP");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lppo.exercicio01;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class CarregaDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarregaDriver.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Driver não encontrado!");
        }
    }
    
}

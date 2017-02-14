package lppo.exercicio01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class ConectaComOBanco {

    public static void main(String[] args) {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String url = "jdbc:derby://localhost:1527/lppo-2017-1";
            Connection conexao = DriverManager.getConnection(url, "usuario", "senha");
            System.out.println("Conexao aberta com sucesso!");
        } catch (ClassNotFoundException ex) {
            System.err.println("Driver indisponivel!");
            Logger.getLogger(ConectaComOBanco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.err.println("Problema ao acessar o banco!");
            Logger.getLogger(ConectaComOBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

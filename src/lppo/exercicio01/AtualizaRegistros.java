package lppo.exercicio01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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
public class AtualizaRegistros {

    public static void main(String[] args) {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String url = "jdbc:derby://localhost:1527/lppo-2017-1";
            Connection conexao = DriverManager.getConnection(url, "usuario", "senha");
            System.out.println("Conexao aberta com sucesso!");
            
            String sql="UPDATE contato SET nome = 'José', sobrenome = 'Antonio' WHERE id =3 ";
            Statement operacao = conexao.createStatement();
            Integer n = operacao.executeUpdate(sql);
            System.out.println(n+ " registros atualizados!");
            
        } catch (ClassNotFoundException ex) {
            System.err.println("Driver indisponivel!");
            Logger.getLogger(AtualizaRegistros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.err.println("Problema ao acessar o banco!");
            Logger.getLogger(AtualizaRegistros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

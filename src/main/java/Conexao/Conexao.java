package Conexao;

/**
 * @author Macamo, Vanio Anibal
 * @Date 12/2/2022
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexao {
    public static Connection getConexao(){
        Connection con=null;
        try{

            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/rent_car_eda?useTimezone=true&serverTimezone=UTC","root","");
            System.out.println("Conectado com sucesso!");
        }catch (SQLException e ){
            JOptionPane.showMessageDialog(null, "ERRO AO CONECTAR COM A BASE DE DADOS!");
            System.out.println(e);
        }
        return con;
    }


/*
    public static void main (String []args){
        Conexao.getConexao();

    }*/
}

package DAO;

import Conexao.ConnectionFactory;
import Model.Marca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Macamo, Vanio Anibal
 * @Date 12/2/2022
 */
public class MarcaDAO {

    private Connection connection = null;

    public MarcaDAO (){
        connection = ConnectionFactory.getConnection();
    }

    public boolean guardar(@org.jetbrains.annotations.NotNull Marca marca){
        String sql = "INSERT INTO marca(id,designacao) VALUES (?,?)";

        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement(sql);
            statement.setInt(1,marca.getId());
            statement.setString(2,marca.getDesignacao());
            statement.executeUpdate();

            return true;
        }catch (SQLException exception){
            return false;
        }finally {

        }
    }
}

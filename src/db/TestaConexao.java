package db;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

  public static void main(String[] args) throws SQLException, ClassNotFoundException {
    Connection conexao = Conexao.getConexao();
    System.out.println("Conexão aberta");
    conexao.close();
  }
}

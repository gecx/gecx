package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

  public static String status = "Não conectou...";

  public Conexao() {
  }

  public static Connection getConexao() throws SQLException, ClassNotFoundException {
    Connection conexao = null;
    String driv = "com.mysql.jdbc.Driver";
    String user = "root";
    String pass = "";
    String url = "jdbc:mysql://localhost:3306/gecx";
    try {
      Class.forName(driv);
      conexao = DriverManager.getConnection(url, user, pass);
      status = (conexao == null) ? "STATUS => Conectado" : "STATUS => Desconectado";
      return conexao;
    } catch (ClassNotFoundException ex) {
      System.out.println("Driver não localizado " + ex.getLocalizedMessage());
      return null;
    }
  }

  public static String statusConexao() {
    return status;
  }

  public static boolean fechaConexao() throws ClassNotFoundException {
    try {
      Conexao.getConexao().close();
      return true;
    } catch (SQLException e) {
      System.out.println(e.getLocalizedMessage());
      return false;
    }
  }

  public static java.sql.Connection reiniciaConexao() throws SQLException, ClassNotFoundException {
    fechaConexao();
    return Conexao.getConexao();
  }
}
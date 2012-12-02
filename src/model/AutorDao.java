package model;

import db.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import util.Funcoes;

public class AutorDao {

  public Connection conexao;
  PreparedStatement pstmt = null;
  Statement stmt = null;
  String sql = null;
  ResultSet result = null;

  public AutorDao() {
    try {
      this.conexao = Conexao.getConexao();
    } catch (SQLException | ClassNotFoundException ex) {
      System.out.println(ex.getLocalizedMessage());
    }
  }

  public void inserir(Autor autor) throws SQLException {
    sql = "insert into autores (nome, nascimento) values (?, ?)";
    try {
      pstmt = this.conexao.prepareStatement(sql);
      pstmt.setString(1, autor.getNome().toUpperCase());
      pstmt.setDate(2, autor.getNascimento());

      pstmt.execute();
      pstmt.close();
    } catch (SQLException e) {
      System.out.println(e.getLocalizedMessage());
    }
  }

  public static boolean existemRegistros(String texto) throws SQLException, ClassNotFoundException {
    boolean existe = false;
    String consulta = "select count(id) as qtde from autores where upper(nome) like upper('%" + texto + "%')";
    Connection conexao = Conexao.getConexao();
    Statement ponte = conexao.createStatement();
    ResultSet retorno = ponte.executeQuery(consulta);
    while (retorno.next()) {
      int qtde = retorno.getInt("qtde");
      if (qtde > 0) {
        existe = true;
      } else {
        existe = false;
      }
    }
    return existe;
  }

  public ResultSet listaPorNome(String texto) throws SQLException, ClassNotFoundException {
    ResultSet autores = null;
    if (existemRegistros(texto)) {
      sql = "select * from autores where upper(nome) like upper('%" + texto + "%') order by nome";
      try {
        stmt = conexao.createStatement();
        stmt.executeQuery(sql);
        autores = stmt.getResultSet();
      } catch (SQLException ex) {
        Funcoes.erro(ex.getLocalizedMessage());
      }
    }
    return autores;
  }

  public ResultSet retornaAutor(int codigo) throws SQLException {
    ResultSet autor = null;
    sql = "select * from autores where id=" + codigo;
    try {
      stmt = conexao.createStatement();
      stmt.executeQuery(sql);
      autor = stmt.getResultSet();
    } catch (SQLException ex) {
      Funcoes.erro(ex.getLocalizedMessage());
    }
    return autor;
  }
}

package frames;

import db.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import model.Autor;
import model.AutorDao;
import util.FormataData;
import util.Funcoes;

public class FrameAutor extends javax.swing.JFrame {

  AutorDao dao = null;
  DefaultTableModel model = null;
  String sql = null;
  Statement stmt = null;
  ResultSet result = null;
  FormataData dataBr = new FormataData();

  class CenterRenderer extends DefaultTableCellRenderer {

    public CenterRenderer() {
      setHorizontalAlignment(CENTER);
    }
  }

  class DateRenderer extends DefaultTableCellRenderer {

    public DateRenderer() {
      SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");

    }
  }

  public FrameAutor() throws ClassNotFoundException, SQLException {
    initComponents();
    Connection conexao = Conexao.getConexao();
    model = (DefaultTableModel) jTable1.getModel();
    try {
      stmt = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    } catch (SQLException e) {
      System.out.println(e.getLocalizedMessage());
    }
    jTable1.getColumnModel().getColumn(0).setResizable(false);
    jTable1.getColumnModel().getColumn(0).setPreferredWidth(15);
    jTable1.getColumnModel().getColumn(1).setResizable(false);
    jTable1.getColumnModel().getColumn(1).setPreferredWidth(500);
    jTable1.getColumnModel().getColumn(2).setResizable(false);
    jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);

    TableCellRenderer center = new CenterRenderer();
    jTable1.getColumnModel().getColumn(0).setCellRenderer(center);
    jTable1.getColumnModel().getColumn(2).setCellRenderer(center);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    btNovo = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    btSalvar = new javax.swing.JButton();
    txtNascimento = new javax.swing.JFormattedTextField();
    txtNome = new javax.swing.JFormattedTextField();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    txtPesquisa = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    txtCodigo = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("CADASTRO DE AUTORES");
    setResizable(false);

    btNovo.setText("Novo");

    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel1.setText("Nome:");

    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel2.setText("Nascimento:");

    btSalvar.setText("Salvar");
    btSalvar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btSalvarActionPerformed(evt);
      }
    });

    txtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null}
      },
      new String [] {
        "Cód", "Nome", "Nascimento"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jTable1MouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(jTable1);

    txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txtPesquisaKeyPressed(evt);
      }
    });

    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel3.setText("Pesquisar:");

    jLabel4.setText("Código:");

    txtCodigo.setEditable(false);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
              .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
              .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel2)
                .addComponent(jLabel4))
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(txtNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addComponent(txtCodigo))
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                  .addGap(18, 18, 18)
                  .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(txtNome))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addGap(154, 154, 154)
                  .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel4)
          .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel3))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btNovo)
          .addComponent(btSalvar))
        .addContainerGap())
    );

    java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    setBounds((screenSize.width-690)/2, (screenSize.height-400)/2, 690, 400);
  }// </editor-fold>//GEN-END:initComponents

  private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
    try {
      Autor autor = new Autor();
      SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
      java.util.Date data1 = df.parse(txtNascimento.getText());
      java.sql.Date data2 = new java.sql.Date(data1.getTime());

      autor.setNome(txtNome.getText());
      autor.setNascimento(data2);
      dao.inserir(autor);
    } catch (SQLException | ParseException ex) {
      System.out.println(ex.getLocalizedMessage());
    }
  }//GEN-LAST:event_btSalvarActionPerformed

  private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
    if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
      try {
        Funcoes.removeLinha(model);
        dao = new AutorDao();
        if (!AutorDao.existemRegistros(txtPesquisa.getText())) {
          Funcoes.informacao("Nenhum Autor Localizado!");
          txtPesquisa.requestFocusInWindow();
        } else {
          ResultSet listAutores = dao.listaPorNome(txtPesquisa.getText());
          while (listAutores.next()) {
            String vnasc = dataBr.getDataBR(listAutores.getDate("nascimento"));
            String codigo = new java.text.DecimalFormat("000").format(new Integer(listAutores.getInt("id")));
            model.addRow(new Object[]{codigo, listAutores.getString("nome"), vnasc});
          }
        }
      } catch (SQLException | ClassNotFoundException ex) {
        Funcoes.erro(ex.getMessage());
      }
    }
  }//GEN-LAST:event_txtPesquisaKeyPressed

  private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    dao = new AutorDao();
    int linha = jTable1.getSelectedRow();
    String codigo = model.getValueAt(linha, 0).toString();
    if (evt.getClickCount() == 2) {
      try {
        ResultSet autor = dao.retornaAutor(Integer.parseInt(codigo));
        Funcoes.desabilitaEdits(txtCodigo, txtNascimento, txtNome);
        while (autor.next()) {
          txtCodigo.setText(new java.text.DecimalFormat("000").format(new Integer(autor.getInt("id"))));
          txtNome.setText(autor.getString("nome"));
          txtNascimento.setText(dataBr.getDataBR(autor.getDate("nascimento")));
        }
      } catch (SQLException e) {
        Funcoes.informacao(e.getLocalizedMessage());
      }
    }
  }//GEN-LAST:event_jTable1MouseClicked

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        try {
          new FrameAutor().setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
          System.out.println(ex.getLocalizedMessage());
        }
      }
    });
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btNovo;
  private javax.swing.JButton btSalvar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTable1;
  private javax.swing.JTextField txtCodigo;
  private javax.swing.JFormattedTextField txtNascimento;
  private javax.swing.JFormattedTextField txtNome;
  private javax.swing.JTextField txtPesquisa;
  // End of variables declaration//GEN-END:variables
}

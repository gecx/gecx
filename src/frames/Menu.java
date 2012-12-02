package frames;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Funcoes;

public class Menu extends javax.swing.JFrame {

  public Menu() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jMenu3 = new javax.swing.JMenu();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    jMenuItem1 = new javax.swing.JMenuItem();
    jMenu2 = new javax.swing.JMenu();
    jMenu4 = new javax.swing.JMenu();

    jMenu3.setText("jMenu3");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("SISTEMA DE GESTÃO DE BIBLIOTECA");
    setResizable(false);

    jMenu1.setText("Cadastro");

    jMenuItem1.setText("Autores");
    jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItem1ActionPerformed(evt);
      }
    });
    jMenu1.add(jMenuItem1);

    jMenuBar1.add(jMenu1);

    jMenu2.setText("Movimento");
    jMenuBar1.add(jMenu2);

    jMenu4.setText("Relatórios");
    jMenuBar1.add(jMenu4);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 790, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 449, Short.MAX_VALUE)
    );

    java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    setBounds((screenSize.width-800)/2, (screenSize.height-500)/2, 800, 500);
  }// </editor-fold>//GEN-END:initComponents

  private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    FrameAutor autor;
    try {
      autor = new FrameAutor();
      autor.setVisible(true);
    } catch (ClassNotFoundException | SQLException ex) {
      Funcoes.erro(ex.getMessage());
    }
  }//GEN-LAST:event_jMenuItem1ActionPerformed

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Menu().setVisible(true);
      }
    });
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenu jMenu2;
  private javax.swing.JMenu jMenu3;
  private javax.swing.JMenu jMenu4;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JMenuItem jMenuItem1;
  // End of variables declaration//GEN-END:variables
}

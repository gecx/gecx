package util;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Funcoes {

  public static boolean removeLinha(DefaultTableModel model) {
    int linha = model.getRowCount();
    for (int i = linha - 1; i >= 0; --i) {
      model.removeRow(i);
    }
    return false;
  }

  public static void informacao(String msg) {
    JOptionPane.showMessageDialog(null, msg, "Atenção", JOptionPane.INFORMATION_MESSAGE);
  }

  public static void erro(String msg) {
    JOptionPane.showMessageDialog(null, msg, "Atenção", JOptionPane.ERROR_MESSAGE);
  }

  public static void cuidado(String msg) {
    JOptionPane.showMessageDialog(null, msg, "Atenção", JOptionPane.WARNING_MESSAGE);
  }

  public static void limpaEdits(JTextField... edits) {
    for (int i = 0; i < edits.length; i++) {
      edits[i].setText(null);
    }
  }

  public static void habilitaEdits(JTextField... edits) {
    for (int i = 0; i < edits.length; i++) {
      edits[i].setEnabled(true);
    }
  }

  public static void desabilitaEdits(JTextField... edits) {
    for (int i = 0; i < edits.length; i++) {
      edits[i].setEnabled(false);
    }
  }

  public static void habilitaBotoes(JButton... botoes) {
    for (int i = 0; i < botoes.length; i++) {
      botoes[i].setEnabled(true);
    }
  }

  public static void desabilitaBotoes(JButton... botoes) {
    for (int i = 0; i < botoes.length; i++) {
      botoes[i].setEnabled(false);
    }
  }
}

package util;

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

  public static void desabilitaEdits(JTextField... edits) {
    for (int i = 0; i < edits.length; i++) {
      edits[i].setEnabled(false);
    }
  }
}

package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FormataData {

  String data_br;
  java.util.Date data;
  DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

  public String getDataBR(java.util.Date data) {
    try {
      data_br = df.format(data);
    } catch (Exception e) {
      data_br = "";
    }
    return data_br;
  }

  public java.util.Date getData(String data_br) {
    try {
      data = df.parse(data_br.trim());
    } catch (ParseException ex) {
      data = null;
    }

    return data;
  }
}

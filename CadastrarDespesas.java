package org.example;

public class CadastrarDespesas {
  private String credor;
  private String despesa;
  private String vencimento;

  public String getCredor() {
    return credor;
  }

  public void setCredor(String credor) {
    this.credor = credor;
  }

  public String getDespesa() {
    return despesa;
  }

  public void setDespesa(String despesa) {
    this.despesa = despesa;
  }

  public String getVencimento() {
    return vencimento;
  }

  public void setVencimento(String vencimento) {
    this.vencimento = vencimento;
  }

  public CadastrarDespesas(String credor, String despesa, String vencimento) {
    this.credor = credor;
    this.despesa = despesa;
    this.vencimento = vencimento;
  }
}

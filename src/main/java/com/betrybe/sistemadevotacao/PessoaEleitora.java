package com.betrybe.sistemadevotacao;

public class PessoaEleitora extends Pessoa {

  private static String cpf;

  public PessoaEleitora(String nome, String cpf) {
    super(nome);
    PessoaEleitora.cpf = cpf;
  }

  /**
   * Returns the cpf of the candidate.
   *
   * @return The cpf of the candidate.
   */
  public static String getCpf() {
    return cpf;
  }

  /**
   * Sets the cpf of the candidate.
   *
   * @param cpf The cpf of the candidate to set.
   */
  public void setCpf(String cpf) {
    PessoaEleitora.cpf = cpf;
  }

  /**
   * Returns the nome of the candidate.
   *
   * @return The nome of the candidate.
   */
  @Override
  public String getNome() {
    return super.getNome();
  }

  /**
   * Sets the nome of the candidate.
   *
   * @param nome The nome of the candidate to set.
   */
  @Override
  public void setNome(String nome) {
    super.setNome(nome);
  }
}

package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * Classe Principal.
 */
public class Principal {
  /**
   * metodo main.
   */
  public static void main(String[] args) {
    GerenciamentoVotacao gerenciamentoVotacao
        = new GerenciamentoVotacao();
    Scanner scanner = new Scanner(System.in);
    int optionNumber;
    do {
      System.out.println("Cadastrar pessoa candidata?\n"
          +
          "1 - Sim\n"
          +
          "2 - Não\n"
          +
          "Entre com o número correspondente à opção desejada:");
      optionNumber = Integer.parseInt(scanner.nextLine());
      if (optionNumber == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String name = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        int candidateNumber = Integer.parseInt(scanner.nextLine());
        gerenciamentoVotacao
            .cadastrarPessoaCandidata(name, candidateNumber);
      }
    } while (optionNumber == 1);

    do {
      System.out.println("Cadastrar pessoa eleitora?\n"
          +
          "1 - Sim\n"
          +
          "2 - Não\n"
          +
          "Entre com o número correspondente à opção desejada:");
      optionNumber = Integer.parseInt(scanner.nextLine());
      if (optionNumber == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String name = scanner.nextLine();
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String candidateCpf = scanner.nextLine();
        gerenciamentoVotacao
            .cadastrarPessoaEleitora(name, candidateCpf);
      }
    } while (optionNumber == 1);

    do {
      System.out.println(" Entre com o número correspondente à opção desejada:\n"
          +
          " 1 - Votar\n"
          +
          " 2 - Resultado Parcial\n"
          +
          " 3 - Finalizar Votação");
      optionNumber = Integer.parseInt(scanner.nextLine());
      if (optionNumber == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        int candidateNumber = Integer.parseInt(scanner.nextLine());
        gerenciamentoVotacao
            .votar(cpf, candidateNumber);
      }
      if (optionNumber == 2) {
        gerenciamentoVotacao
            .mostrarResultado();
        optionNumber = 1;
      }
      if (optionNumber == 3) {
        gerenciamentoVotacao
            .mostrarResultado();
      }
    } while (optionNumber == 1);


  }

}
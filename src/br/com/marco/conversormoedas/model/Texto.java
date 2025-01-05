package br.com.marco.conversormoedas.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Texto {

		public void TextoMenu(){
				System.out.println(
								"\nBem-vindo(a) ao Conversor de Moedas!\n" +
												"======== MENU PRINCIPAL ========\n" +
												"1 - Dólar (USD) para Real Brasileiro (BRL)\n" +
												"2 - Real Brasileiro (BRL) para Dólar (USD)\n" +
												"3 - Euro (EUR) para Real Brasileiro (BRL)\n" +
												"4 - Real Brasileiro (BRL) para Euro (EUR)\n" +
												"5 - Libra Esterlina (GBP) para Real Brasileiro (BRL)\n" +
												"6 - Real Brasileiro (BRL) para Libra Esterlina (GBP)\n" +
												"7 - Exibir ou Salvar histórico\n" +
												"8 - Sair\n" +
												"================================\n\n" +
												"Digite a opção desejada: "
				);
		}

		public int ValidaOpcao(Scanner leitura) {
				int key = 0;
				while (true) {
						try {
								key = leitura.nextInt();
								if (key < 1 || key > 8) {
										System.out.println("Opção inválida! Por favor, insira um número entre 1 e 8.");
								} else {
										break;
								}
						} catch (InputMismatchException e) {
								System.out.println("Entrada inválida! Por favor, insira um número entre 1 e 8!\n");
								leitura.nextLine();
						}
				}
				return key;
		}
}
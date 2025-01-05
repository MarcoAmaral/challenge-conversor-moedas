package br.com.marco.conversormoedas.principal;

import br.com.marco.conversormoedas.model.Historico;
import br.com.marco.conversormoedas.model.Texto;
import br.com.marco.conversormoedas.service.Converte;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
		public static void main(String[] args) {
				Scanner leitura = new Scanner(System.in);
				Texto texto = new Texto();
				Historico historico = new Historico(leitura);
				Converte exchange = new Converte(historico);

				var key = 0;

				while (key != 8) {
						texto.TextoMenu();
						key = texto.ValidaOpcao(leitura);

						double valor = 0;
						if (key != 7 && key != 8) {
								try {
										System.out.println("\nQual o valor que deseja converter?");
										valor = leitura.nextDouble();
								} catch (InputMismatchException e) {
										System.out.println("Entrada inválida! Por favor, tente novamente!\n\n");
										leitura.nextLine();
										continue;
								}
						}

						switch (key) {
								case 8:
										System.out.println("Saindo...");
										break;
								case 7:
										historico.TemHistorico();
										break;
								case 1:
										exchange.Converter("USD", "BRL", valor);
										break;
								case 2:
										exchange.Converter("BRL", "USD", valor);
										break;
								case 3:
										exchange.Converter("EUR", "BRL", valor);
										break;
								case 4:
										exchange.Converter("BRL", "EUR", valor);
										break;
								case 5:
										exchange.Converter("GBP", "BRL", valor);
										break;
								case 6:
										exchange.Converter("BRL", "GBP", valor);
										break;
								default:
										System.out.println("Opção inválida.");
						}
				}
				leitura.close();
		}
}
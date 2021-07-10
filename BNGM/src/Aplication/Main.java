package Aplication;

import java.util.Scanner;

import Entities.Contas;

public class Main extends Contas {
	
	public Main(int numConta, double saldo) {
		super( numConta, saldo);
		
	}

	public static void main(String[] args) {
				Scanner leia = new Scanner(System.in);
				Contas cliente = new Contas (13,0);
				int opcao;
				for(int y = 0 ; y< 99999; y++){
					cliente.chamaNomes();
					cliente.menu();
					System.out.printf("\n");
					System.out.printf("Digite uma opção de 0 a 5: ");
					opcao = leia.nextInt();
					
					if(opcao == 0) {
						System.out.printf("Conta Poupança");
						for(int e = 0; e< 2; e++) {
							System.out.printf("\nInforme o valor do credito: \n");
							cliente.credito(leia.nextDouble());
							cliente.verSaldo();
						}
					}
					else if (opcao == 1) {
						System.out.printf("Conta Corrente");
					}
					else if(opcao == 2) {
						System.out.printf("Conta Especial");
					}
					else if (opcao == 3) {
						System.out.printf("Conta Empresarial");
					}
					else if(opcao == 4) {
						System.out.printf("Conta Estudantil");
					}
					else if(opcao == 5) {
						System.out.printf("Obrigado por usar nosso banco!");
						break;
					}
					else {
						System.out.println("Digite uma opção válida do menu!");
					}
				}
				
				
				
		
		
		
		
		
		/*for(int x = 0; x <= 10; x++){
		System.out.printf("\nInforme o valor do crédito: \n");
		cliente.credito(leia.nextDouble());
		cliente.verSaldo();
		System.out.printf("\nInforme o valor do débito: \n");
		cliente.debito(leia.nextDouble());
		cliente.verSaldo();
		}
		*/
		
		
		
		
		
	}

}

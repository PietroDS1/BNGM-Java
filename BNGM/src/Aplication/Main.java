package Aplication;

import java.util.Scanner;

import Entities.ContaEstudantil;
import Entities.Contas;
//APAGUE-ME

public class Main{

	public static void main(String[] args) {
				Scanner leia = new Scanner(System.in);
				Contas cliente = new Contas (13,0);
				ContaEstudantil clienteEstudantil = new ContaEstudantil(14,0, 5000);
				int opcao;
				for(int y = 0 ; y< 99999; y++){
					cliente.chamaNomes();
					cliente.menu();
					System.out.printf("\n");
					System.out.printf("Digite uma opção de 0 a 5: ");
					opcao = leia.nextInt();
					
					if(opcao == 0) {
						System.out.printf("-----------------------------\n");
						System.out.printf("   Tipo de conta: Poupança\n");
						System.out.printf("-----------------------------\n");
						for(int x = 0; x <= 10; x++){
							System.out.printf("\nInforme o valor do crédito: \n");
							cliente.credito(leia.nextDouble());
							cliente.verSaldo();
						}
					}
					else if (opcao == 1) {
						System.out.printf("-----------------------------\n");
						System.out.printf("   Tipo de conta: Corrente\n");
						System.out.printf("-----------------------------\n");
						for(int x = 0; x <= 10; x++){
							System.out.printf("\nInforme o valor do crédito: \n");
							cliente.credito(leia.nextDouble());
							cliente.verSaldo();
						}
					}
					else if(opcao == 2) {
						System.out.printf("-----------------------------\n");
						System.out.printf("   Tipo de conta: Especial\n");
						System.out.printf("-----------------------------\n");
						for(int x = 0; x <= 10; x++){
							System.out.printf("\nInforme o valor do crédito: \n");
							cliente.credito(leia.nextDouble());
							cliente.verSaldo();
						}
					}
					else if (opcao == 3) {
						System.out.printf("-----------------------------\n");
						System.out.printf("   Tipo de conta: Empresa\n");
						System.out.printf("-----------------------------\n");
						for(int x = 0; x <= 10; x++){
							System.out.printf("\nInforme o valor do crédito: \n");
							cliente.credito(leia.nextDouble());
							cliente.verSaldo();
						}
					}
					else if(opcao == 4) {
						for(int q = 0; q<10; q++) {
							System.out.printf("\n-----------------------------\n");
							System.out.printf("   Tipo de conta: Estudantil\n");
							System.out.printf("-----------------------------\n");
							
								int escolha;
								clienteEstudantil.menuEstudantil();
								System.out.printf("\nDigite uma opção do menu\n");
								escolha = leia.nextInt();
								if(escolha == 0) {
									System.out.printf("-----------------------------\n");
									System.out.printf("   Tipo e operação:  Débito \n");
									System.out.printf("-----------------------------\n");
									clienteEstudantil.checaSaldo();
									System.out.printf("\nSeu saldo para limite estudantil é: R$ "+ clienteEstudantil.getLimite() + "\n\n");
									System.out.printf("Digite o valor de débito: \n");
									clienteEstudantil.checaLimite(leia.nextInt());
								}
								else if(escolha == 1) {
									System.out.printf("-----------------------------\n");
									System.out.printf("   Tipo e operação:  Crédito \n");
									System.out.printf("-----------------------------\n");
									System.out.printf("\nSeu saldo de conta é: R$ "+clienteEstudantil.getSaldo() +"\n");
									System.out.printf("Digite o valor de crédito: \n");
									clienteEstudantil.credito(leia.nextDouble());       
								}
								else if(escolha == 2) {
									clienteEstudantil.checaSaldo();
									clienteEstudantil.checaLimiteValor();
								}
								else if(escolha == 3){
									break;
								}
						}
						
							
					}
					else if(opcao == 5) {
						System.out.printf("--------------------------------\n");
						System.out.printf(" Obrigado por usar o banco BNGM\n");
						System.out.printf("          Volte sempre!\n");
						System.out.printf("--------------------------------\n");
						
						break;
					}
					else {
						System.out.println("Digite uma opção válida do menu!");
					}
				}
				
				
				
		
		
		
		
	
		
	}

}

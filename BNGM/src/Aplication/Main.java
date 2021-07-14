package Aplication;

import java.util.Random;
import java.util.Scanner;
import Entities.ContaCorrente;
import Entities.ContaEmpresa;
import Entities.ContaEspecial;
import Entities.ContaEstudantil;
import Entities.ContaPoupanca;
//ApagueME

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random sorteador = new Random();
        int numero = sorteador.nextInt(99999)+1;
		ContaPoupanca clientePoupanca = new ContaPoupanca(numero,0,14);
		ContaCorrente clienteCorrente1 = new  ContaCorrente(numero,0);
		ContaEspecial clienteEspecial = new ContaEspecial(numero,0,1000.00);
		ContaEmpresa clienteEmpresa = new ContaEmpresa(numero, 0);
		ContaEstudantil clienteEstudantil = new ContaEstudantil(numero, 0, 5000);
	System.out.println("##::::'##:'####:'########:::::'###:::::'######::"); 
        System.out.println("###::'###:. ##:: ##.... ##:::'## ##:::'##... ##:");
        System.out.println("####'####:: ##:: ##:::: ##::'##:. ##:: ##:::..::"); 
        System.out.println("## ### ##:: ##:: ##:::: ##:'##:::. ##:. ######::"); 
        System.out.println("##. #: ##:: ##:: ##:::: ##: #########::..... ##:"); 
        System.out.println("##:.:: ##:: ##:: ##:::: ##: ##.... ##:'##::: ##:");
        System.out.println("##:::: ##:'####: ########:: ##:::: ##:. ######::"); 
        System.out.println("..:::::..::....::........:::..:::::..:::......:::");
		int opcao;
	
		for (int y = 0; y < 99999; y++) {
			
			
			System.out.println("-------------------------------\n Bem vindo ao banco: BNGM - G2\n");
			System.out.println(" Onde o seu dinheiro vale ouro! \n-------------------------------\n" );
<<<<<<< HEAD
			System.out.println("\n--------Menu Inicial---------\n" );
			String menuPrincipal[] = {"Conta Poupan�a", "Conta Corrente", "Conta Especial", "Conta Empresa", "Conta Estudantil ", "Sair"};
=======
			
			String menuPrincipal[] = {"Conta Poupança", "Conta Corrente", "Conta Especial", "Conta Empresa", "Conta Estudantil ", "Sair"};
>>>>>>> 108127e2b8ca2b9750050e63853af30829adfcac
				
				for(int x = 0; x<menuPrincipal.length; x++) {
					System.out.print(x + " - " + menuPrincipal[x] + "\n");
			}
			System.out.printf("\n");
			System.out.printf("Digite uma opção de 0 a 5: ");
			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.printf("-----------------------------\n");
				System.out.printf("   Tipo de conta: Poupança\n");
				System.out.printf("-----------------------------\n");
				System.out.println("Numero da conta: "+ clientePoupanca.getNumConta()+"-0\n");
				
				for(int x = 0; x <= 10; x++){
					System.out.println("\n--------Menu---------\n" );
					int escolha;
					clientePoupanca.menuPoupanca();
					System.out.printf("\nDigite uma opção do menu\n");
					escolha = leia.nextInt();
					//--------------------------DEBITO-----------------------
					if(escolha == 0) {
						System.out.printf("-----------------------------\n");
						System.out.printf("   Tipo e operação:  Débito \n");
						System.out.printf("-----------------------------\n");
						clientePoupanca.verSaldo();
						System.out.printf("\nDigite o valor de débito: \n");
						clientePoupanca.debito(leia.nextDouble());
						System.out.println("\nVerificaçaõ de data aniversário conta poupança\n");	
						System.out.print("Digite que dia é hoje?");
						clientePoupanca.verData(leia.nextInt());	
					}
					else if(escolha == 1) {
						System.out.printf("-----------------------------\n");
						System.out.printf("   Tipo e operação:  Crédito \n");
						System.out.printf("-----------------------------\n");
						clientePoupanca.verSaldo();
						System.out.printf("\nDigite o valor de crédito: \n");
						clientePoupanca.credito(leia.nextDouble());
						System.out.println("\nVerificaçaõ de data aniversário conta poupança\n");	
						System.out.print("Digite que dia é hoje?");
						clientePoupanca.verData(leia.nextInt());	
					}
					else if(escolha == 2) {
						clientePoupanca.checaSaldo();
						clientePoupanca.checaData();
					}
					else if(escolha == 3){
						break;
					}else {
						System.out.println("Número inválido, digite uma opção do menu 0 à 3!");
					}
					
				}
					
				
			} else if (opcao == 1) {
				System.out.printf("-----------------------------\n");
				System.out.printf("   Tipo de conta: Corrente\n");
				System.out.printf("-----------------------------\n");
				System.out.println("Numero da conta: "+ clienteCorrente1.getNumConta()+"-1\n");
				System.out.println("\n--------Menu---------\n" );
				for(int x = 0; x <= 10; x++){
				    int escolha;
				    
					clienteCorrente1.menuCorrente();
					System.out.printf("\nDigite uma opção do menu\n");
					escolha = leia.nextInt();
					//Debito
					if(escolha == 0) {
						System.out.printf("-----------------------------\n");
						System.out.printf("   Tipo de operação:  Débito \n");
						System.out.printf("-----------------------------\n");
						clienteCorrente1.verSaldo();
						System.out.printf("\nSeu limite de talões é: "+ clienteCorrente1.getlimiteTalao()+ "\n\n");
						System.out.printf("Digite o valor de débito: \n");
						clienteCorrente1.debito(leia.nextInt());
					}
				    
					//credito
					else if(escolha == 1) {
						System.out.printf("-----------------------------\n");
						System.out.printf("   Tipo de operação:  Crédito \n");
						System.out.printf("-----------------------------\n");
						clienteCorrente1.verSaldo();
						System.out.printf("\nSeu limite de talões é: "+ clienteCorrente1.getlimiteTalao()+ "\n\n");
						System.out.printf("Digite o valor de crédito: \n");
						clienteCorrente1.credito(leia.nextDouble());       
					}
					else if(escolha ==2) {
						System.out.printf("-----------------------------\n");
						System.out.printf("   Tipo de operação:  Saldo \n");
						System.out.printf("-----------------------------\n");
						clienteCorrente1.verSaldo();
						clienteCorrente1.SaldoTalao();
					}
					
					else if(escolha ==3) {
						System.out.printf("-----------------------------\n");
						System.out.printf("   Tipo de operação : Talão\n");
						System.out.printf("-----------------------------\n");
						clienteCorrente1.verSaldo();
					    System.out.println("\nDigite 1 para pedir talão.\n");
						clienteCorrente1.talao(leia.nextInt());
					
				}else if(escolha == 4){
					break;
				 }
				}
			}
			 else if (opcao == 2) {
				
				 	System.out.printf("-----------------------------\n");
					System.out.printf("   Tipo de conta: Especial\n");
					System.out.printf("-----------------------------\n");
					System.out.println("\n--------Menu---------\n" );
					for(int x = 0; x <= 10; x++){
						int escolha;
						clienteEspecial.menuEspecial();
						System.out.printf("\nDigite uma opção do menu\n");
						escolha = leia.nextInt();
						if(escolha == 0) {
							System.out.printf("-----------------------------\n");
							System.out.printf("   Tipo e operação:  Débito \n");
							System.out.printf("-----------------------------\n");
							clienteEspecial.checaSaldo();//checasaldo
							System.out.printf("\nSeu saldo para limite especial é: R$ "+ clienteEspecial.getLimite()+ "\n\n");
							System.out.printf("Digite o valor de débito: \n");
							clienteEspecial.debito(leia.nextInt());//checa limite
							
						}
						else if(escolha == 1) {
							System.out.printf("-----------------------------\n");
							System.out.printf("   Tipo e operação:  Crédito \n");
							System.out.printf("-----------------------------\n");
							System.out.printf("\nSeu saldo de conta é: R$ "+clienteEspecial.getSaldo() +"\n");
							System.out.printf("Digite o valor de crédito: \n");
							clienteEspecial.credito(leia.nextDouble());       
						}
						else if(escolha == 2) {
							clienteEspecial.verSaldo(); //checa saldo
							clienteEspecial.checaLimiteValor();// che
						}
						else if(escolha == 3){
							break;
						}
						else {
							System.out.println("Número inválido!");
						}
					}
					
				}
				
			 else if (opcao == 3) {
				
				for (int x = 0; x <= 10; x++) {
					
					System.out.printf("-----------------------------\n");
					System.out.printf("   Tipo de conta: Empresa\n");
					System.out.printf("-----------------------------\n");
					System.out.println("Numero da conta: "+ clienteEmpresa.getNumConta()+"-3\n");
					System.out.println("\n--------Menu---------\n" );
					int escolha;
					clienteEmpresa.menuEmpresa();
					System.out.printf("\nDigite uma opção do menu\n");
					escolha = leia.nextInt();
					if(clienteEmpresa.getMovimentos() > 9 ) {
						System.out.println("Limite de movimentos diarios!\nVoltando ao menu principal!");
						break;
					}
					if (escolha == 0) {
						System.out.printf("-----------------------------\n");
						System.out.printf("   Tipo de operação:  Débito \n");
						System.out.printf("-----------------------------\n");
						clienteEmpresa.verSaldo();
						System.out.printf("\nSeu saldo para Emprestimo é: R$ " + clienteEmpresa.getEmprestimoL() + "\n\n");
						System.out.printf("Digite o valor de débito: \n");
						clienteEmpresa.debito(leia.nextDouble());
					} else if (escolha == 1) {
						System.out.printf("-----------------------------\n");
						System.out.printf("   Tipo de operação:  Crédito \n");
						System.out.printf("-----------------------------\n");
						clienteEmpresa.verSaldo();
						System.out.printf("\nSeu saldo para Emprestimo é: R$ " + clienteEmpresa.getEmprestimoL() + "\n\n");
						System.out.printf("Digite o valor de crédito: \n");
						clienteEmpresa.credito(leia.nextDouble());
					} else if (escolha == 2) {
						System.out.printf("-----------------------------\n");
						System.out.printf("   Tipo de operação:  Emprestimo \n");
						System.out.printf("-----------------------------\n");
						clienteEmpresa.verSaldo();
						System.out.printf("\nSeu saldo para Emprestimo é de R$: " + clienteEmpresa.getEmprestimoL());
						System.out.printf("\nSeu valor de Emprestimo já solicitado é de R$: "+ clienteEmpresa.getEmprestimoS() + "\n\n");
						System.out.println("Digite o valor de emprestimo: \n");
						clienteEmpresa.emprestimo(leia.nextDouble());
					} else if (escolha == 3) {
						System.out.printf("-----------------------------\n");
						System.out.printf("   Tipo de operação:  Saldo \n");
						System.out.printf("-----------------------------\n");
						clienteEmpresa.verSaldo();
						System.out.printf("\nSeu saldo para Emprestimo é: R$ " + clienteEmpresa.getEmprestimoL() + "\n\n");
					} else if (escolha == 4) {
						break;
					} else {
						System.out.println("Digite uma opção válida do menu!");
			    	}

				}
			}
				else if(opcao == 4) {
					for(int q = 0; q<10; q++) {
						System.out.printf("\n-----------------------------\n");
						System.out.printf("   Tipo de conta: Estudantil\n");
						System.out.printf("-----------------------------\n");
						System.out.println("Numero da conta: "+ clienteEstudantil.getNumConta()+"-4");
						System.out.println("\n--------Menu---------\n" );
						
							int escolha;
							clienteEstudantil.menuEstudantil();
							System.out.printf("\nDigite uma opção do menu\n");
							escolha = leia.nextInt();
							//--------------------------DEBITO-----------------------
							if(escolha == 0) {
								System.out.printf("-----------------------------\n");
								System.out.printf("   Tipo e operação:  Débito \n");
								System.out.printf("-----------------------------\n");
								clienteEstudantil.checaSaldo();
								System.out.printf("\nSeu saldo para limite estudantil é: R$ "+ clienteEstudantil.getLimite() + "\n\n");
								System.out.printf("Digite o valor de débito: \n");
								clienteEstudantil.checaLimite(leia.nextInt());
							}
							//------------------------------CREDITO---------------------------------
							else if(escolha == 1) {
								System.out.printf("-----------------------------\n");
								System.out.printf("   Tipo e operação:  Crédito \n");
								System.out.printf("-----------------------------\n");
								clienteEstudantil.checaSaldo();
								System.out.printf("Digite o valor de crédito: \n");
								clienteEstudantil.checaCredito(leia.nextDouble());       
							}
							//----------------------------------SALDO+LIMITE----------------------------------
							else if(escolha == 2) {
								clienteEstudantil.checaSaldo();
								clienteEstudantil.checaLimiteValor();
							}
							//-------------------------------------SAIR-------------------------------
							else if(escolha == 3){
								break;
							}
							else {
								System.out.printf("Número inválido \n");
							}
					}
					
						
				
			}
			 else if (opcao == 5) {
				System.out.printf("--------------------------------\n");
				System.out.printf(" Obrigado por usar o banco BNGM\n");
				System.out.printf("          Volte sempre!\n");
				System.out.printf("--------------------------------\n");

				break;
			} else {
				System.out.println("Digite uma opção válida do menu!");
			}
		}

	}

}

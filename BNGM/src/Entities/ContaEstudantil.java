package Entities;

import java.util.Scanner;

public class ContaEstudantil extends Contas{
		
		Scanner leia = new Scanner(System.in);
		//ATRIBUTO
		private double limite= 5000;
		private double valorDebitoS = 0.0;
		private double saldo = 0.00;
		
		//CONSTRUTOR
		public ContaEstudantil(int numConta, double saldo, double limite){
		super(numConta, saldo);
		this.limite = limite;
		}
		//ENCAPSULAMENTO
		public double getLimite() {
			return limite;
		}
		
		
		public void menuEstudantil() {
			String menuEstudantil[] = {"Débito", "Crédito", "Saldo", "Sair"};
			
			for(int x = 0; x<menuEstudantil.length; x++) {
				System.out.print(x + " - " + menuEstudantil[x] + "\n");
			}
		}
		
		public void checaLimite(int valorDebito) {
					int opcao1;
					System.out.printf("Digite: \n1 - Confirmar \n2 - Sair");
					opcao1 = leia.nextInt();
					if(opcao1 == 1) {
						if(valorDebito < saldo) {
							super.debito(valorDebito);
							limite -= valorDebito;
							saldo += valorDebito;
							movimentos++;
						}
						else if(valorDebito <= 5000.00){
							
							if(valorDebito + valorDebitoS  >= 5000.01){
								System.out.printf("\n\nValor insuficiente para retirar!!!\n\n");
								menuEstudantil();
							}
							else{
							saldo += valorDebito; // Saldo = saldo + valorDebito
							limite -= valorDebito; //limite = saldo + valorDebito
							valorDebitoS += valorDebito;
							movimentos++;
							}
						 }
						else {
							saldo -= valorDebito;
							movimentos++;
						}
						
				}
					else if(opcao1 == 2){
						menuEstudantil();
					}
					else {
						System.out.printf("Número inválido");
					}	
			}	
		//}
		/*
		public void pulaLinha() {
			for(int r = 0; r<10; r++) {
				System.out.printf("\n");
			}*/
		
		public void checaLimiteValor() {
			System.out.printf("\nLimite estudantil atual é de: %.2f ", limite, "\n");
		}
		public void checaSaldo() {
			System.out.printf("\nSeu saldo atual é de: %.2f ",saldo, "\n");
		}
		
}
		
		
		
		
		
		
		
	
		
		
		
	


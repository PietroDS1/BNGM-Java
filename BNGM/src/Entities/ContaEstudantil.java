package Entities;

import java.util.Scanner;
//ApagueME
public class ContaEstudantil extends Contas{
		
		Scanner leia = new Scanner(System.in);
		//ATRIBUTO
		private double limite= 5000;
		private double valorDebitoS = 0.0;
		
		
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
			String menuEstudantil[] = {"D�bito", "Cr�dito", "Saldo", "Sair"};
			
			for(int x = 0; x<menuEstudantil.length; x++) {
				System.out.print(x + " - " + menuEstudantil[x] + "\n");
			}
		}
		
		public void checaLimite(double valorDebito) {
					int opcao1;
					System.out.printf("Digite: \n1 - Confirmar \n2 - Sair");
					opcao1 = leia.nextInt();
					if(opcao1 == 1) {
					if (valorDebito >0) {
						
					
						if(saldo >= valorDebito) {
							saldo-=valorDebito;
						}
						else if(valorDebito > saldo) {
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
						 }else if(valorDebito > saldo) {
							 System.out.printf("N�mero Inv�lido!!!");
						 }
						 
						else {
							saldo -= valorDebito;
							movimentos++;
						}
						
				}else {
					 System.out.printf("N�mero Inv�lido, digite um n�mero positivo!!!");
				}
					}
					else if(opcao1 == 2){
						menuEstudantil();
					}
					
					else {
						System.out.printf("N�mero inv�lido!!!");
					}	
			}	
		public void checaLimiteValor() {
			System.out.printf("\nLimite estudantil atual � de: %.2f ", limite, "\n");
		}
		public void checaSaldo() {
			System.out.printf("\nSeu saldo atual � de: %.2f ",saldo, "\n");
		}
		public void checaCredito(double valorCreditado) {
			credito(valorCreditado);
			System.out.printf("\nSeu saldo atual � de: %.2f ",saldo, "\n");
		}
}
		
		
		
		
		
		
		
	
		
		
		
	


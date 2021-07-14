package Entities;

import java.util.Scanner;

public class ContaEspecial extends Contas {
	Scanner leia = new Scanner(System.in);
	
	
		private double limite = 1000.00;
		private double valorDebitoS = 0.0;
		private double usarLimiteEspecial = 0.00;
		private double variavelExtra = 0.00;
		
		//CONSTRUTOR
		public ContaEspecial(int numConta, double saldo, double limite) {
			super(numConta, saldo);
			this.limite = limite;
		}
		//ENCAPSULAMENTO
		
		public double getLimite() {
			return limite;
		}
		public void menuEspecial() {
			String menuEspecial[] = {"Débito", "Crédito", "Saldo", "Sair"};
			
			for(int x = 0; x<menuEspecial.length; x++) {
				System.out.print(x + " - " + menuEspecial[x] + "\n");
			}
		}
			@Override
			public void debito(double valorDebito) {
				
				if(movimentos>10) {
					System.out.println("Número de Rodadas estourado!");
				}
				
				else if(valorDebito <=0) {
					System.out.println("Número inválido, digite um número positivo!");
				}
				else if(saldo == 0 && valorDebito>limite) {
					System.out.println("Saldo insuficiente!");
				}
				else if(valorDebito>saldo+limite) {
					System.out.println("Saldo e limite insuficiente!");
				}
				else if(valorDebito<saldo) {
					saldo -= valorDebito;
					System.out.println("Você retirou "+valorDebito+"movimento do seu saldo.");
				}
				else if(saldo==0 && valorDebito<limite) {
					limite -= valorDebito;
					System.out.println("Você retirou "+valorDebito+"movimento do seu limite.");
				}
				else if(saldo<valorDebito) {
					variavelExtra = valorDebito - saldo;
					limite -= variavelExtra;
					saldo = 0.00;
					System.out.println("Debito concluido");
				}
			}
		public void checaSaldo() {
			System.out.printf("\nSeu saldo atual é de: %.2f ",saldo, "\n");
		}
		public void checaLimiteValor() {
			System.out.printf("\nLimite especial atual é de: %.2f ", limite, "\n");
		}

	}

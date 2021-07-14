package Entities;

import java.util.Scanner;

public class ContaPoupanca extends Contas {
	Scanner leia= new Scanner (System.in);
	// Atributos
	private int diaAniversarioPoupanca=0;
	private int data=0;
	//Construtor
	public ContaPoupanca(int numConta, double saldo, int diaAniversarioPoupanca) {
		super(numConta, saldo);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
		//this.data = data;
	}
	//Encapsulamento
	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}
	
	public int getData() {
		return data;
	}
	//Metodos
	public void menuPoupanca() {
		String menuPoupanca[] = {"Débito", "Crédito", "Saldo", "Sair"};
		
		for(int x = 0; x<menuPoupanca.length; x++) {
			System.out.print(x + " - " + menuPoupanca[x] + "\n");
		}
	}
	
	
	public void verData(int data) {
		if(data <=0){
			System.out.println("\nDigite um valor positivo\n");
	}
		else if(data >=32){
			System.out.println("\nOpção inválida, digitar números de 1 à 31!");
		}
		else if (data==diaAniversarioPoupanca){
		saldo=(saldo*0.05)-(-saldo);
			System.out.println("Saldo atualizado é:"+saldo);
		}
	}
	public void checaData() {
		System.out.println("\nO dia de aniversário da sua conta Poupança é: "+ diaAniversarioPoupanca+"\n");
	}
	public void checaSaldo() {
		System.out.printf("\nSeu saldo atual é de: %.2f ",saldo, "\n");
	}
}

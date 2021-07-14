package Entities;
import java.util.Scanner;
public class ContaCorrente extends Contas {
	
	Scanner leia = new Scanner(System.in);
	
	private double  talao;
	private int  limiteTalao=3;

	public ContaCorrente(int numConta, double saldo) {
		super(numConta, saldo);
	}

	public double getTalao() {
		return talao;
	} 
	
	public int getlimiteTalao(){
		
		return limiteTalao;
	}
	

	public void menuCorrente() {
		String menuCorrente[] = {"Débito", "Crédito", "Saldo","Talão", "Sair"};
		
		for(int x = 0; x<menuCorrente.length; x++) {
			System.out.print(x + " - " + menuCorrente[x] + "\n");
		}
	}
	
	 public void talao(int valorTalao) {
		 int contador=0;
		 int LimiteTalao=30;
		 int SimNao;
		
		 if(saldo>LimiteTalao && limiteTalao>0) {
			if(limiteTalao==0) {
				System.out.println("\nLimite de talão excedido!");
			}else {
				for(int x=0;x<3;x++) {
					 System.out.print("Deseja pedir talão?\nsim-1 nao-2");
					  SimNao= leia.nextInt();
					  if(valorTalao<4 && valorTalao>0  && limiteTalao>0) {
						  if(SimNao==1 && x<3) {
							  saldo-=LimiteTalao;
							  limiteTalao--;
							  movimentos++;
							  contador++;
							  
						  }else if(SimNao==2) {
							  break;
							  
						  }
						  
						  else {
							  System.out.print("Opcão invalida!");
							  break;
						 }
			     }else if(SimNao == 4){
					  menuCorrente();
					}
			 
	     }
				  
}
			 
		 }else {
			 System.out.println("\nSaldo insuficiente para pedir talões!");
		 }
		 
	 }
	public void SaldoTalao() {
		System.out.println("\nSeu limite de talões é "+limiteTalao);
	}
}
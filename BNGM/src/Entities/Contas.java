package Entities;
//APAGUE-ME
abstract class Contas {
		//ATRIBUTO
		protected String nomeBanco = "BNGM";
		private int numConta;
		protected String slogan = "Onde o seu dinheiro vale ouro!";
		protected double saldo = 0;
		protected int movimentos;
		//CONSTRUCTOR
		public Contas(int numConta, double saldo) {
			super();
			//this.nomeBanco = nomeBanco;
			this.numConta = numConta;
			//this.slogan = slogan;
			this.saldo = saldo;
		}
		//ENCAPSULAMENTO
		public String getNomeBanco() {
			return nomeBanco;
		}
		
		public int getNumConta() {
			return numConta;
		}
		
		public String getSlogan() {
			return slogan;
		}
		
		public double getSaldo() {
			return saldo;
		}
		
		public int getMovimentos() {
			return movimentos;
		}
		//METODOS
		public void credito(double valorCredito) {		
			if(valorCredito <=0) {
				System.out.println("Número inválido, digite um número positivo!");			}
			else{
				saldo+= valorCredito; //saldo = saldo + valorCredito;
				movimentos++;
			}
		}	
		public void debito(double valorDebito) {
			
			if(movimentos>10) {
				System.out.println("Número de Rodadas estourado!");
			}
			
			else if(valorDebito <=0) {
				System.out.println("Número inválido, digite um número positivo!");
			}
			else if(valorDebito > saldo) {
				System.out.println("Número inválido, saldo insuficiente!");
			}
			else {
				saldo-= valorDebito; //saldo = saldo - valorDedito;
				movimentos++;
				
			}			
		}
		public void verSaldo(){
			System.out.printf("Seu saldo atual é: R$ %.2f ", saldo , "\n");
		}
		
		/*public void chamaNomes() {
			System.out.printf("-------------------------------\n Bem vindo ao banco: %s - G2\n", nomeBanco);
			System.out.printf(" %s \n-------------------------------\n", slogan );
		}*/
		
		/*public void menu() {
			String menuPrincipal[] = {"Conta Poupança", "Conta Corrente", "Conta Especial", "Conta Empresa", "Conta Estudantil ", "Sair"};
			
			for(int x = 0; x<menuPrincipal.length; x++) {
				System.out.print(x + " - " + menuPrincipal[x] + "\n");
			}
		}*/
		
		public void limpaDados() {
			saldo = 0;
			movimentos = 0;
		}
}
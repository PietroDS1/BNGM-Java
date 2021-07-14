package Entities;

public class ContaEmpresa extends Contas {

	private double emprestimoL = 10000.00;
	private double emprestimoS = 0.00;

	public ContaEmpresa(int numConta, double saldo) {
		super(numConta, saldo);
		// this.emprestimoL = emprestimoL;
		// this.emprestimoS = emprestimoS;
	}

	public double getEmprestimoL() {
		return emprestimoL;
	}

	public double getEmprestimoS() {
		return emprestimoS;
	}

	public void emprestimo(double valorEmprestimo) {
		if (valorEmprestimo <= 0) {
			System.out.println("\nDigite um valor positivo!");
		} else if (valorEmprestimo <= 10000.00) {
			if (valorEmprestimo + emprestimoS >= 10000.01) {
				System.out.println("\nValor insuficiente para emprestimo!!\n");
			} else {
				saldo += valorEmprestimo;
				emprestimoL -= valorEmprestimo;
				emprestimoS += valorEmprestimo;
				movimentos++;
			}
		}
	}

	public void menuEmpresa() {
		String menuEmpresa[] = { "Débito", "Crédito", "Emprestimo", "Saldo", "Sair" };

		for (int x = 0; x < menuEmpresa.length; x++) {
			System.out.print(x + " - " + menuEmpresa[x] + "\n");
		}
	}
}

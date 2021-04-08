
public class EmpregadoMensalista extends Empregado {
	
	private int salarioMensal;
	private double taxaEncargosTrabalhistas;
	
	EmpregadoMensalista(int salario, double d)
	{
		salarioMensal = salario;
		taxaEncargosTrabalhistas = d;
	}

	@Override
	int pagamentoDoMes() {
		// TODO Auto-generated method stub
		return (int)(salarioMensal * taxaEncargosTrabalhistas);
	}

}

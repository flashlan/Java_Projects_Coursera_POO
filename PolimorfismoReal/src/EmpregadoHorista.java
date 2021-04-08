
public class EmpregadoHorista extends Empregado {
	private int salarioPorHora;
	private int horasTrabalhadas;
	
	EmpregadoHorista(int salarioPorHora, int horas)
	{
		this.salarioPorHora = salarioPorHora;
		this.horasTrabalhadas = horas;
	}

	@Override
	int pagamentoDoMes() {
		// TODO Auto-generated method stub
		return salarioPorHora * horasTrabalhadas;
	}

}

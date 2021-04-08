
public class EmpregadoAvulso extends Empregado {
	private int pagamento;
	
	//construtor (sem this/ 1 atributo)
	
	EmpregadoAvulso (int valor) 
	{
		pagamento = valor;
	}

	@Override
	int pagamentoDoMes() {
		// TODO Auto-generated method stub
		return pagamento;
	}

}

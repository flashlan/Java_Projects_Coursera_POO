import java.util.List;
import java.util.ArrayList;

abstract public class Empregado {
	abstract int pagamentoDoMes();
	
	public static void main(String[] args) {
		List<Empregado> corpoDeTrabalho = new ArrayList<>();
		
		corpoDeTrabalho.add(new EmpregadoHorista(100, 30));
		corpoDeTrabalho.add(new EmpregadoMensalista(500, 1.8));
		corpoDeTrabalho.add(new EmpregadoAvulso(7000));
		
		int custoTotal = 0;
		for (Empregado trabalhador: corpoDeTrabalho)
			custoTotal += trabalhador.pagamentoDoMes(); //POLIMORFISMO EM AÇÃO!
		System.out.println("Minha folha de pagamento neste mês vai custar: "+ custoTotal);
		System.out.println(corpoDeTrabalho);
	}

}

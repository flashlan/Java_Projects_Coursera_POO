package testeAbstrato2;

//apenas declara mas n�o implementa

public interface ObjetoEspacial {
	int k  = 42;
	
	int getPosicaoX();
	int getPosicaoY();
	
	void setPosicaoX();
	void setPosicaoY();
	
	void exploda(int intensidadeDaExplosao);
	
	boolean colidecom (ObjetoEspacial oe);
	
	String nome();
	String descricao();

}

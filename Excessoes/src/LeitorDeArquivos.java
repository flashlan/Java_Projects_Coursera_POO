import java.io.FileReader;

public class LeitorDeArquivos {
	
	static char[] leArquivo (String nomeArq) /* throws IOException */  {
		char [] conteudo = new char[1024];
		try {
			//exception criada
			if(nomeArq.endsWith(".txt"))
				throw new UglyFileException();
			FileReader fr = new FileReader (nomeArq);
			fr.read(conteudo);
			fr.close();
		}
		catch (Exception e) {
			System.out.println("Nao deu certo mamae: " + e);
		}
		return conteudo;

	}
	
	public static void main(String[] args) {
		try {
		System.out.println(leArquivo(args[0]));
		}
		catch (Exception e) {
			System.out.println("Nao deu certo papi: " + e);
		}
	}
}

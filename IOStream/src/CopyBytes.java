import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


//l� arquivo byte a byte e copia para outro arquivo


public class CopyBytes {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			
			in = new FileInputStream("arquivo_de_entrada.txt");
			out = new FileOutputStream("arquivo_de_saida.txt");
			int c;
			
			while ((c = in.read())  != -1) {
				out.write(c);	
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}		
	}
	

}

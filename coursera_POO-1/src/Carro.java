
public class Carro extends veiculo {
		private int cilindrada;
		private boolean airbag;

		public String toStyring() {
			return "Carro fabricado em " + getAnoDeFabricacao() + "com " + cilindradas + "cilindradas";
		}
		
		public static void main (String args[]) {
			Carro fordBigode = new Carro();
		}
}

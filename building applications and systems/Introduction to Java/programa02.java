public class programa02 {

	public static void main(String entrada[]) {

		// declaracao de variaveis
		int n1, n2, mod, div;
		double raiz, pot;
		String mensagem = "";

		// entrada de dados pela linha de comando
		n1 = Integer.parseInt(entrada[0]);
		n2 = Integer.parseInt(entrada[1]);

		// processamento
		mod = n1 % n2;
		div = (int)n1 / (int)n2;
		raiz = Math.sqrt(n1);
		pot = Math.pow(n1, n2);

		// saida de resultados
		mensagem = "n1 = " + n1 + " n2 = " + n2 + "\n";
		mensagem = mensagem + "resto da divisao de n1 por n2 = " + mod + "\n";
		mensagem = mensagem + "quociente da divisao de n1 por n2 = " + div + "\n";
		mensagem = mensagem + "raiz quadrada de n1 = " + raiz + "\n";
		mensagem = mensagem + "potencia de n1 elevado a n2 = " + pot + "\n";

		System.out.println(mensagem);

		System.exit(0);
	}
}

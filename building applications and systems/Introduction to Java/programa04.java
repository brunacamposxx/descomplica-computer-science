import javax.swing.*;

public class programa04 {

	public static void main(String entrada[]) {

		// declaracao de variaveis
		int n1, n2, div;
		double pot;
		String mensagem = "";

		// entrada de dados pela linha de comando
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));

		// processamento
		div = (int)n1 / (int)n2;
		pot = Math.pow(n1, n2);

		// saida de resultados
		mensagem = mensagem + "O quociente da divisao de "+ n1 + " por " + n2 + " = " + div + "\n";
		mensagem = mensagem + "A potencia de " + n1 + " por " + n2 + " = " + pot + "\n";

		JOptionPane.showMessageDialog(null, mensagem);

		System.exit(0);
	}
}

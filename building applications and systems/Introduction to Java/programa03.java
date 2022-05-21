import javax.swing.*;

public class programa03 {

	public static void main(String entrada[]) {

		// declaracao de variaveis
		int n1, n2, mod;
		double raiz1, raiz2;
		String mensagem = "";

		// entrada de dados pela linha de comando
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));

		// processamento
		mod = n1 % n2;
		raiz1 = Math.sqrt(n1);
		raiz2 = Math.sqrt(n2);

		// saida de resultados
		mensagem = "Resto da divisão de " + n1 + " por " + n2 + " = " + mod + "\n";
		mensagem = mensagem + "Raiz quadrada de " + n1 + " = " + raiz1 + "\n";
		mensagem = mensagem + "Raiz quadrada de " + n2 + " = " + raiz2 + "\n";
		
		JOptionPane.showMessageDialog(null, mensagem);

		System.exit(0);
	}
}

import javax.swing.*;

class ProgDecision {

	public static void main(String input[]) {

		int num;
		char op = 0;
		String message = "", messageInput = "Digite '1' para 'par ou impar' \n Digite '2' para 'positivo ou negativo'";
		String messageDialog = "Digite um número inteiro";
		
		num = Integer.parseInt(JOptionPane.showInputDialog(messageDialog));
		op = JOptionPane.showInputDialog(messageInput).charAt(0);

		switch (op) {

			case '1': {
				if (num % 2 == 0) {
					message = message + num + " é Par. \n";
				} else {
					message = message + num + " é Impar. \n";
				}
				break;
			}

			case '2': {
				if (num > 0) {
					message = message + num + " é Positivo. \n";
				} else {
					message = message + num + " é Negativo. \n";
				}
				break;
			}

			default: JOptionPane.showMessageDialog(null, "Opção inválida. Calculo não realizado.");

		}
		
		if (op == '1' || op == '2') {
			JOptionPane.showInputDialog(null, message);
		}

		System.exit(0);

	}

}
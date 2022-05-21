class DynamicHelloWorld {

	public static void main (String entrada[]) {

		// declaração de variaveis locais
		int n1, n2, soma;

		// entrada de dados pela linha de comando;
		// os tipos de dados inseridos na linha de comando são strings;
		// parseInt converte a string para um inteiro;
		n1 = Integer.parseInt(entrada[0]);
		n2 = Integer.parseInt(entrada[1]);

		// processamento;
		soma = n1 + n2;

		// saída de resultados;
		System.out.println(n1 + " + " + n2 + " = " + soma);
		System.exit(0);
	}

}

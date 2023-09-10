package controller;

public class ThreadVetor extends Thread {

	int vet[] = new int[1000];
	int valor;

	public ThreadVetor(int[] vet, int valor) {
		this.vet = vet;
		this.valor = valor;
	}

	public void run() {
		percorreVetor();
	}

	private void percorreVetor() {
		if (valor % 2 == 0) {
			double tipar = System.nanoTime();
			for (int i = 0; i < vet.length; i++) {

			}
			double tfpar = System.nanoTime();
			double ttpar = (tfpar - tipar);
			ttpar = ttpar / (Math.pow(10, 9));
			System.out.println("Tempo FOR: " + ttpar + "s --> Valor: " + valor);
		} else if (valor % 2 != 0) {
			double tiimpar = System.nanoTime();
			for (int i : vet) {

			}
			double tfimpar = System.nanoTime();
			double ttimpar = (tfimpar - tiimpar);
			ttimpar = ttimpar / (Math.pow(10, 9));
			System.out.println("Tempo FOREACH: " + ttimpar + "s --> Valor: " + valor);
		}

	}
}

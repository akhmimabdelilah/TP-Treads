package threads;

public class Operation extends Thread {
	private Compte compte;

	public Operation(String nom, Compte compte) {
		super(nom);
		this.compte = compte;
	}

	public void run() {
		while (true) {
			int solde = 0;
			int i = (int) (Math.random() * 10000);
			String nom = getName();
			System.out.print(nom);
			synchronized (compte) {
				compte.ajouter(i);
				compte.retirer(i);
//				compte.getSolde();
			}

//			compte.operationNulle(i);
			 solde = compte.getSolde();
			System.out.print(solde);
			if (solde != 0) {
				System.out.println(nom + ":**solde=" + solde);
				System.exit(1);
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		Compte compte = new Compte();
		for (int i = 0; i < 20; i++) {
			Operation operation = new Operation("" + (char) ('A' + i), compte);
			operation.start();
		}
	}
}

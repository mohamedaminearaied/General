package b;

class CompteEpargne<T> extends Compte<T> {
    private double taux;
    public CompteEpargne(int numeroCompte, double solde, T devise, double taux) {
        super(numeroCompte, solde, devise);
        this.taux = taux;
    }

    public void calculerInteret() {
        solde += solde * (taux/100);
    }
    @Override
    public void afficherSolde() {
        System.out.println("Compte Épargne - Solde: " + solde + " " + devise);
    }
}
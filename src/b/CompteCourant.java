package b;
class CompteCourant<T> extends Compte<T> {
    private double limite;
    public CompteCourant(int numeroCompte, double solde, T devise, double limite) {
        super(numeroCompte, solde, devise);
        this.limite = limite;
    }
    @Override
    public boolean retirer(double montant) {
        if (solde - montant >= -limite) {
            solde -= montant;
            return true;
        }
        return false;
    }
    @Override
    public void afficherSolde() {
        System.out.println("Compte Courant - Solde: " + solde + " " + devise);
    }
}

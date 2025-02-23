package b;

class CompteCourantSecurise<T> extends CompteCourant<T> implements Securisable {
    private String id;

    public CompteCourantSecurise(int numeroCompte, double solde, T devise, double limite, String id) {
        super(numeroCompte, solde, devise, limite);
        this.id = id;
    }
    @Override
    public boolean verifierIdentite(String id) {
        return this.id.equals(id);
    }

    public void retirerSecurise(String id, double montant) throws AccesInterditException {
        if (verifierIdentite(id)) {
            if (!retirer(montant)) {
                System.out.println("Fonds insuffisants, retrait refusé.");
            }
        } else {
            throw new AccesInterditException("Impposible d'accès: id incorrect.");
        }
    }
    @Override
    public void afficherSolde() {
        System.out.println("Compte Compte Courant - Solde: " + solde + " " + devise);
    }
}
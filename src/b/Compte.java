package b;
public class Compte<T> {
    protected int numeroCompte;
    protected double solde;
    protected T devise;
    public Compte(int numeroCompte, double solde, T devise) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.devise = devise;
    }
    public void deposer(double montant) {
        solde = solde +montant;
    }
    public boolean retirer(double montant) {
        if (solde >= montant) {
            solde = solde -montant;
            return true;
        }
        return false;
    }
    public void afficherSolde() {
        System.out.println("la solde de compte est: " + solde + " " + devise);
    }
    public static <T> void transferer(Compte<T> source, Compte<T> destination, double montant) {
        if (source.retirer(montant)) {
            destination.deposer(montant);
        } else {
            System.out.println("Impposible de transferer: solde insuffisant.");
        }
    }
    public double getSolde() {
        return solde;
    }
}

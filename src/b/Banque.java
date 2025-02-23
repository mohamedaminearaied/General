package b;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
class Banque {
    private Map<Integer, Compte<?>> comptes = new HashMap<>();
    public void ajouterCompte(Compte<?> compte) {
        comptes.put(compte.numeroCompte, compte);
    }
    public Compte<?> rechercherCompte(int numeroCompte) {
        return comptes.get(numeroCompte);
    }
    public void supprimerCompte(int numeroCompte) {
        comptes.remove(numeroCompte);
    }
    public void afficherComptesTries() {
        comptes.values().stream()
        .sorted(Comparator.comparingDouble(compte -> ((Compte<Object>) compte).getSolde()).reversed()).forEach(compte -> {
                    System.out.print(compte.getClass().getSimpleName() + " - ");
                    compte.afficherSolde();
                });
    }
}

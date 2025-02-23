package b;
public class General {
    public static void main(String[] args) {
        Banque banque = new Banque();
        CompteCourant<String> a = new CompteCourant<>(1001, 8000, "TND", 2300);
        CompteEpargne<String> b = new CompteEpargne<>(1002, 15000, "TND", 3.75);
        CompteCourantSecurise<String> c = new CompteCourantSecurise<>(1003, 9000, "TND", 1500, "u555");  
        banque.ajouterCompte(a);
        banque.ajouterCompte(b);
        banque.ajouterCompte(c);
        b.calculerInteret();
        a.retirer(6000); 
        b.retirer(5000);
        c.deposer(500);
        try {
            c.retirerSecurise("User incorrect", 500);
        } catch (AccesInterditException e) {
            System.out.println(e.getMessage());
        } 
        System.out.println("Comptes tri:");
        banque.afficherComptesTries();
    }
}

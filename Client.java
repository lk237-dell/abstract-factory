public class Client {
    public static void  main(String[] args){
       
        IProduitFactory IProduitFactory1 = new IProduitFactory1();
        IProduitFactory IProduitFactory2= new IProduitFactory2();

        ProduitA produitA = null;
        ProduitB produitB = null;
        ProduitC produitC = null;
        System.out.println("Utilisation de la première fabrique");
        
        produitA = IProduitFactory1.getProduitA();
        produitB = IProduitFactory1.getProduitB();
        produitC = IProduitFactory1.getProduitC();

        produitA.methodeA();
        produitB.methodeB();
        produitC.methodeC();

        System.out.println("Utilisation de la deuxième fabrique");
        
        produitA = IProduitFactory2.getProduitA();
        produitB = IProduitFactory2.getProduitB();
        produitC = IProduitFactory2.getProduitC();

        produitA.methodeA();
        produitB.methodeB();
        produitC.methodeC();
    }
    
}

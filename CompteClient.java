import java.rmi.*;

public class CompteClient {

  public static void main (String [] args) {
    //System.setSecurityManager(new RMISecurityManager());
    try{
		   CompteInterface c = (CompteInterface) Naming.lookup ("rmi://localhost:1099/MyCompte");
      
	 int montant=10;
	 int solde=100;
	 
      c.Deposer_argent(montant);
	  c.Retirer_argent(montant);
	 c.Donner_solde(montant);
      
     
    }
    catch (Exception e) {
      System.out.println ("Erreur d'accès à l'objet distant.");
      System.out.println (e.toString());
    }
  }
}

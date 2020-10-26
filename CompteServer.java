import java.rmi.*;
import java.rmi.server.*;

public class CompteServer {
  public static void main(String[] args) {
    try {
	 int solde;
      
       
	  System.out.println( "Serveur : Construction de l'implémentation ");
      Compte c= new Compte(65);
      System.out.println("Objet Reverse lié dans le RMIregistry");
      Naming.rebind("rmi://localhost:1099/MyCompte", c);
    }
    catch (Exception e) {
      System.out.println("Erreur de liaison de l'objet Hello"); 
      System.out.println(e.toString());
    }
  } // fin du main 
} // fin de la classe

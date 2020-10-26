import java.rmi.*;
import java.rmi.server.*;

public class Compte extends UnicastRemoteObject implements CompteInterface {
  //private String name;String s name=s;
  private int solde = 100;
  public Compte(int sol) throws RemoteException {
    	super();
		int montant=10;
 
	Deposer_argent(montant);
	Retirer_argent(montant);
	Donner_solde(montant);

  } 
  
public void Deposer_argent(int montant){
solde = solde + montant;
}
public void Retirer_argent(int montant){
solde = solde - montant;
}
public void Donner_solde(int montant ){
	montant=7;
	int solde=5;
	 
this.Retirer_argent(montant);
	montant=7;
this.Deposer_argent(montant);
}
 

 
}
 
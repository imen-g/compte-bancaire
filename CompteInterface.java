import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CompteInterface extends Remote {
	 int solde=5;
	 
  public void Deposer_argent(int montant) throws RemoteException;
  public void Retirer_argent(int montant) throws RemoteException;
  public void Donner_solde(int montant) throws RemoteException;
  
}

import java.rmi.Naming;
import java.rmi.RemoteException;
/**
 *
 * @author pedro
 */
public class DistribuidoraControl extends java.rmi.server.UnicastRemoteObject implements Distribuidora{
    
    public DistribuidoraControl()
            throws java.rmi.RemoteException {
        super();
    }
    
    @Override
    public int comprar(int a, int b) throws java.rmi.RemoteException{
        switch (a) {
            case 1:
                System.out.println("Vendido " + b + " filme1");
                break;
            case 2:
                System.out.println("Vendido " + b + " filme2");
                break;
            case 3:
                System.out.println("Vendido " + b + " filme3");
                break;
            default:
                break;
        }
        return b;
    }
}

import java.rmi.RemoteException;
/**
 *
 * @author pedro
 */
public interface Distribuidora extends java.rmi.Remote{
    
    public int comprar(int a, int b) throws java.rmi.RemoteException;
}

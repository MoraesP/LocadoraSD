import java.rmi.RemoteException;
/**
 *
 * @author pedro
 */
public interface Locadora extends java.rmi.Remote{
    
    public String locar(int a) throws java.rmi.RemoteException;
    public String adicionar(int a, int b) throws java.rmi.RemoteException;
}

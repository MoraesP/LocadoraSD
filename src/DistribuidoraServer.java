import java.rmi.Naming;
/**
 *
 * @author pedro
 */
public class DistribuidoraServer {
    
    public DistribuidoraServer() {
        try {
            Distribuidora d = new DistribuidoraControl();
            Naming.rebind("//127.0.0.2:1099/DistribuidoraService", d);
        } catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
    }

    public static void main(String args[]) {
        new DistribuidoraServer();
    }
}

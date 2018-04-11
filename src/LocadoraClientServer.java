import java.rmi.Naming;
import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class LocadoraClientServer {

    public LocadoraClientServer() {
        try {
            Scanner scan = new Scanner(System.in);
            Locadora l = new LocadoraControl();
            Naming.rebind("//127.0.0.2:1099/LocadoraService", l);
            System.out.println("Comprar mais filmes: <1> sim <2> não");
            int op = scan.nextInt();
            if(op ==  1){
                Distribuidora d = (Distribuidora) Naming.lookup("//127.0.0.2:1099/DistribuidoraService");
                System.out.println("Qual filme deseja comprar:"
                        + "<1> filme1 <2> filme2 <3> filme3");
                int a = scan.nextInt();
                System.out.println("Quantidade:");
                int b = scan.nextInt();
                
                System.out.println("Você comprou " + d.comprar(a, b) + " quantidades do " +
                        l.adicionar(a, b));
            }
        } catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
    }

    public static void main(String args[]) {
        new LocadoraClientServer();
    }
}

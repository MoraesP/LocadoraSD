import java.rmi.Naming;
import java.util.Scanner;
/*
javac *.java
rmic LocadoraControl
rmic DistribuidoraControl
rmiregistry &
java LocadoraClientServer
java DistribuidoraServer
java ClienteA
(/

*/
/**
 *
 * @author pedro
 */
public class ClienteA {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n;
        
        try {
            Locadora l = (Locadora) Naming.lookup("//127.0.0.2:1099/LocadoraService");
            
            System.out.print("Qual filme deseja locar:\n"
                    + "<1> filme1\n<2> filme2 \n<3> filme3\n"
                    + "Selecicone a opção: ");
            
        n = scan.nextInt();
        
        if(n == 1){
            System.out.println(l.locar(n));    
        }
        else if(n == 2){
            System.out.println(l.locar(n));    
        }
        else if(n == 2){
            System.out.println(l.locar(n));    
        }
        
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

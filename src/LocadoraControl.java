import java.rmi.Naming;
import java.rmi.RemoteException;
/**
 *
 * @author pedro
 */
public class LocadoraControl extends java.rmi.server.UnicastRemoteObject implements Locadora {

    public LocadoraControl()
            throws java.rmi.RemoteException {
        super();
    }

    private int filme1 = 5;
    private int filme2 = 5;
    private int filme3 = 5;
    private int filme1res = 0;
    private int filme2res = 0;
    private int filme3res = 0;

    @Override
    public String locar(int a) throws java.rmi.RemoteException {
        String retorno = "error";
        switch (a) {
            case 1:
                if(this.filme1 == 0){
                    retorno = "Não disponivel";
                }else{
                    this.filme1--;
                    this.filme1res++;
                    retorno = "Você locou o filme1";
                    System.out.println("filme1 quantidade disponivel: "+this.filme1);                    
                }
                break;
            case 2:
                if(this.filme2 == 0){
                    retorno = "Não disponivel";
                }else{
                    this.filme2--;
                    this.filme2res++;
                    retorno = "Você locou o filme2";
                    System.out.println("filme2 quantidade disponivel: "+this.filme2);                    
                }
                break;
            case 3:
                if(this.filme3 == 0){
                    retorno = "Não disponivel";
                }else{
                    this.filme3--;
                    this.filme3res++;
                    retorno = "Você locou o filme3";
                    System.out.println("filme3 quantidade disponivel: "+this.filme3);                    
                }
                break;
            default:
                break;
        }
        return retorno;
    }
    
    @Override
    public String adicionar(int a, int b) throws java.rmi.RemoteException {
        String retorno = "error";
        switch (a) {
            case 1:
                this.filme1 = this.filme1 + b;
                retorno = "filme1. Total " + (this.filme1 + this.filme1res) + ". "
                        + "Quantidade em reserva" + this.filme1res;
                break;
            case 2:
                this.filme2 = this.filme2 + b;
                retorno = "filme2. Total " + (this.filme2 + this.filme2res) + ". "
                        + "Quantidade em reserva" + this.filme2res;
                break;
            case 3:
                this.filme3 = this.filme3 + b;
                retorno = "filme3. Total " + (this.filme3 + this.filme3res) + ". "
                        + "Quantidade em reserva" + this.filme3res;
                break;
            default:
                break;
        }
        return retorno;
    }
}

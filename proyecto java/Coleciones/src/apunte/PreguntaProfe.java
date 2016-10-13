package apunte;

import Set_HashSet.*;
import java.util.*;

/**
 *
 * @author jhone
 */
public class PreguntaProfe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cl1 = new Cliente("jhon joya", "00001", 2000);
        Cliente cl2 = new Cliente("marcela gonzles", "00002", 300000);
        Cliente cl3 = new Cliente("obtabio vera cruz", "00003", 30000000);
        Cliente cl4 = new Cliente("fernando vera cruz", "00004", 30000);
        Cliente cl5 = new Cliente("fernando vera cruz", "00004", 30000);

        @SuppressWarnings("Convert2Diamond")
        Set<Cliente> clientesBanco = new HashSet<Cliente>();
        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);
        clientesBanco.add(cl5);

        for (Cliente cliente : clientesBanco) {

            System.out.println(cliente.getName() + "||" + cliente.getN_Account()
                    + "||" + cliente.getCash());
            if (cliente.getName().equals("fernando vera cruz")) {
                clientesBanco.remove(cliente);
            }

        }
        System.out.println("/////////////////////////////////////");
        for (Cliente cliente : clientesBanco) {
            
            System.out.println(cliente.getName() + "||" + cliente.getN_Account()
                    + "||" + cliente.getCash());

        }
//        Iterator<Cliente> it = clientesBanco.iterator();
//        while (it.hasNext()) {
//            String nombre_cliente=it.next().getName();
//            System.out.println(nombre_cliente);
//            String n_cuenta=it.next().getN_Account();
//            System.out.println(n_cuenta);
//            double saldo=it.next().getCash();
//            System.out.println(saldo);
//        }

    }

}

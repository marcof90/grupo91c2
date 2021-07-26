package views;

import model.Movimiento;
import model.User;
import model.Wallet;

public class Vista {
    public static void main(String[] args) {

        try {            
            double resultado = 254/0;
        } catch (Exception e) {
            System.out.println("hubo un error");
            //TODO: handle exception
        }


        //crear un objeto de User
        User cliente = new User("Pedro");
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getBilletera().getSaldo());


        User persona = new User("Juan");
        System.out.println(persona.getBilletera().consultarSaldo());
        try {
            System.out.println(persona.getBilletera().guardarDinero(25000));            
            System.out.println(persona.getBilletera().guardarDinero(-20000));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
        for (Movimiento movimiento : persona.getBilletera().getMovimientos()) {
            System.out.println(movimiento);
        }



        //creamos objeto de Wallet
        // Wallet billetera1 = new Wallet();
        // Wallet miBilletera = new Wallet();

        // System.out.println(billetera1.consultarSaldo());
        // System.out.println(billetera1.guardarDinero(50000));
        // System.out.println(billetera1.consultarSaldo());
        // System.out.println(miBilletera.consultarSaldo());
        // System.out.println(miBilletera.guardarDinero(30000));
        // System.out.println(miBilletera.romperLimite());
        // System.out.println(miBilletera.romperLimite());
        // System.out.println(miBilletera.consultarSaldo());
        
    }
}

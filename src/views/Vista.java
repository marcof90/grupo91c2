package views;

import model.Movimiento;

import java.util.Date;

import model.Client;
import model.Wallet;

public class Vista {
    public static void main(String[] args) {

        try {            
            double resultado = 254/0;
        } catch (Exception e) {
            System.out.println("hubo un error");
            //TODO: handle exception
        }


        //crear un objeto de Client
        Client cliente = new Client("Pedro", new Date());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getWallet().getSaldo());


        Client persona = new Client("Juan", new Date());
        System.out.println(persona.getWallet().consultarSaldo());
        try {
            System.out.println(persona.getWallet().guardarDinero(25000));            
            System.out.println(persona.getWallet().guardarDinero(-20000));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
        for (Movimiento movimiento : persona.getWallet().getMovimientos()) {
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

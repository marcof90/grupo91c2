package views;

import model.User;
import model.Wallet;

public class Vista {
    public static void main(String[] args) {

        //crear un objeto de User
        User persona = new User("Juan");
        System.out.println(persona.getBilletera().consultarSaldo());
        System.out.println(persona.getBilletera().guardarDinero(25000));
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

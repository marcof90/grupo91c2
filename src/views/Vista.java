package views;

import model.Wallet;

public class Vista {
    public static void main(String[] args) {
        //creamos objeto de Wallet
        Wallet billetera1 = new Wallet();
        Wallet miBilletera = new Wallet();

        System.out.println(billetera1.consultarSaldo());
        System.out.println(billetera1.guardarDinero(50000));
        System.out.println(billetera1.consultarSaldo());
        System.out.println(miBilletera.consultarSaldo());
    }
}

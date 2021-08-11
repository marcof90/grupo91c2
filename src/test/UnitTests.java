package test;

import java.util.Date;

import model.Client;
import model.Wallet;

public class UnitTests {
    
    public static void main(String[] args) {
        UnitTests ut = new UnitTests();
        ut.escenarioCliente();
    }

    /**
     * ----------------------------Escenarios--------------------
     */
    public void escenarioCliente() {
        System.out.println("----------------escenario cliente---------------");
        Client cliente1 = new Client("Prueba1", new Date());

        boolean test1 = assertEquals("Prueba1", cliente1.getNombre());
        System.out.println( test1 ? "Paso prueba asignación nombre":"Error nombre no se asigna correctamente");
        
        cliente1.setNombre("Prueba 1");
        
        boolean test2 = assertEquals("Prueba 1", cliente1.getNombre());
        System.out.println( test2 ? "Paso prueba cambiar nombre":"Error nombre no se cambia correctamente");

        boolean test3 = assertNotNull(cliente1.getWallet());
        System.out.println( test3 ? "Paso, el cliente tiene una billetera":"Error no se creó la billetera");
    }

    public void escenarioWallet() {
        System.out.println("----------------escenario wallet------------------");
        Wallet wallet1 = new Wallet();

        boolean test1 = assertEquals(0, wallet1.getSaldo());
        System.out.println( test1 ? "Paso, la wallet inicia con saldo en 0":"Error, no se asigna el saldo inicial en 0");

        boolean test2 = assertTrue(wallet1.isTieneLimite());
        System.out.println( test2 ? "Paso, la wallet inicia con limites":"Error, la wallet no inicia con limites");

        try {
            wallet1.guardarDinero(20000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        boolean test3 = assertEquals(20000, wallet1.getSaldo());
        System.out.println(test3 ? "Paso, la wallet guardo el saldo correctamente":"Error, no se actualizo el saldo");

    }

    /**
     * -----------------------------Asserts-----------------------
     */

    public boolean assertEquals(String expected, String received) {
        if (expected.equals(received)) {
            return true;
        }
        return false;
    }

    public boolean assertEquals(int expected, int received) {
        if(expected == received){
            return true;
        }
        return false;
    }

    public boolean assertNotNull(Object objeto) {
        if (objeto != null) {
            return true;
        }
        return false;
    }

    public boolean assertNull(Object objeto){
        if (objeto == null) {
            return true;
        }
        return false;
    }

    public boolean assertTrue(boolean received) {
        if (received) {
            return true;
        }
        return false;
    }

    public boolean assertFalse(boolean received) {
        if (!received) {
            return true;
        }
        return false;
    }
}

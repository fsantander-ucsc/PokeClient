/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokeclient;

import irPokemon.irPokemon;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class PokeClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        pokeGUI ventana = new pokeGUI();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
        //poke = abreviatura de pokemon
        /*try {
        String nombre = "Pokemon";
        Registry registry = LocateRegistry.getRegistry("localhost");
        irPokemon poke = (irPokemon) registry.lookup(nombre);
        //System.out.println("Respuesta: "+ poke.consulaPokemon("1"));
        
        //LO DE ACÁ ABAJO ESTÁ PARA EJEMPLIFICAR, NO ES NECESARIO SEGUIRLO
        //ES PARA PROBAR ESTA FUNCIÓN
        System.out.println("Opción 1: Safari\nIngresar opción");
        // Declarar el objeto e inicializar con
        // el objeto de entrada estándar predefinido
        Scanner sc = new Scanner(System.in);
        
        // entrada de una cadena
        int opcion = sc.nextInt();
        
        switch (opcion) {
        case 1:
        System.out.println(poke.safariPokemon());
        
        boolean servidor = true;
        String respuesta = "";
        while (servidor) {
        System.out.println("1) Arrojar Pokebola\n2) Arrojar Piedra \n3) Arrojar Cebo \n4) Huir");
        opcion = sc.nextInt();
        switch (opcion) {
        case 1:
        System.out.println("Arrojaste Pokebola!");
        respuesta = poke.arrojarPokebola();
        servidor = booleanServidor(respuesta);
        System.out.println(stringServidor(respuesta));
        break;
        
        case 2:
        System.out.println("Arrojaste una piedra!");
        respuesta = poke.arrojarPiedra();
        servidor = booleanServidor(respuesta);
        System.out.println(stringServidor(respuesta));
        
        break;
        case 3:
        System.out.println("Arrojaste una cebo!");
        respuesta = poke.arrojarCebo();
        servidor = booleanServidor(respuesta);
        System.out.println(stringServidor(respuesta));
        break;
        case 4:
        System.out.println("Has huido");
        servidor = false;
        break;
        default:
        System.out.println("Opción no válida");
        break;
        }
        
        }
        break;
        }
        
        } catch (Exception e) {
        System.err.println("Error en el servidor");
        e.printStackTrace();
        }*/
    }

    private static Boolean booleanServidor(String respuesta) {

        return Boolean.valueOf(respuesta.split("-")[0]);

    }

    private static String stringServidor(String respuesta) {

        return respuesta.split("-")[1];

    }

}

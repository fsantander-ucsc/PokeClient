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
        ventana.setResizable(false);

        try {
            String nombre = "Pokemon";
            Registry registry = LocateRegistry.getRegistry("localhost");
            irPokemon poke = (irPokemon) registry.lookup(nombre);
            //System.out.println("Respuesta: " + poke.consultaPokemon("1"));
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}

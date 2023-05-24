/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author guerig
 */
public class Ficheros {
    public static List<Deportivo> leer(String nombre){
        // Fichero a leer con datos de ejemplo
        String idFichero = nombre;

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        
        List<Deportivo> lista = new ArrayList(); // Array para guardar los datos del fichero

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new File(idFichero), "ISO_8859_1")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            
            // Contador para saltarme la primera linea
            int contador = 0;
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(",");
                
                // Creamos una nueva instancia con cada repetición para añadir uno nuevo
                Deportivo d = new Deportivo();
                
                // Condicional para saltar la primera linea
                if(contador > 1){
                    // Insertamos los datos en la instancia de Deportivo
                    d.setCodigo(Integer.parseInt(tokens[0]));
                    d.setInstalacion(tokens[1]);
                    d.setProvincia(tokens[2]);
                    d.setMunicipio(tokens[3]);
                    
                    // COmprobamos si esta vacío
                    if(!tokens[4].isEmpty() || tokens[4].equalsIgnoreCase("" )){
                        d.setNombre(tokens[4]); 
                    }else{
                        d.setNombre("");
                    }
                    if(!tokens[5].isEmpty() || tokens[5].equalsIgnoreCase("")){
                        d.setCodPostal(tokens[5]);
                    }else{
                        d.setCodPostal("");
                    }
                    if(!tokens[6].isEmpty() || tokens[6].equalsIgnoreCase("")){
                        d.setEspacioDep(tokens[6].trim());
                    }else{
                        d.setEspacioDep("");
                    }
                    

                    lista.add(d);
                
                }else{
                    contador++;
                }
                
                System.out.println();
                
                for (String token : tokens) {
                System.out.println(token);
            }
            }

            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }
}

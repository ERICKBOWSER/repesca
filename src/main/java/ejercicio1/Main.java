/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author guerig
 */
public class Main {
    public static void main(String[] args) {
        
        // Lista para guardar los datos del fichero
        List<Deportivo> lista = Ficheros.leer("./censo_instalaciones_deportivas.csv");
        
        // Bucle para ver los datos
        System.out.println("Lista desde el main:");
        for (Deportivo deportivo : lista) {
            System.out.println(deportivo);
        }

        //Ficheros.leer("censo_instalaciones_deportivas.csv");
        
        // Map para almacenar municipios e instalaciones
        Map<String, Integer> numeroMunicipios = new HashMap();
        int numInstalaciones = 0;
        
        for (int i = 0; i < lista.size(); i++) {
            
            String municipios = lista.stream()
                    .filter(d -> d.getMunicipio().contains("Málaga"))
                    .toString();
                    
//            for (String municipio : municipios) {
//                numeroMunicipios.put(municipio , numInstalaciones);
//            }
//            
        }
        
    }
   
}

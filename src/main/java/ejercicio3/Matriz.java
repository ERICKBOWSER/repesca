/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author guerig
 */
public class Matriz {

    public static void main(String[] args) {
        int[][] matriz = crearMatriz(2, 4);
        
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[0][3] = 4;
        
        matriz[1][0] = 5;
        matriz[1][1] = 6;
        matriz[1][2] = 7;
        matriz[1][3] = 8;
        
        for (int[] is : matriz) {
            System.out.println("");
            for (int i : is) {
                System.out.print(i + " ");
            }
        }
         
        int[][] espejo = matrizEspejo(matriz, 2, 4);
        
        for (int[] is : espejo) {
            System.out.println("");
            for (int i : is) {
                System.out.print(i + " ");
            }
        }
        
    }    
    
    
    public static int[][] crearMatriz(int fila, int columna){
        int[][] matriz = new int[fila][columna];
        
        return matriz;        
    }
    
    public static int[][] matrizEspejo(int[][] m, int fila, int columna){
        
        int[][] reverso = new int[fila][columna];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = m[i].length; j > m[i].length; j--) {
                reverso[i][j] = m[0][j];
            }
        }
        
        return reverso;
    }
    
    
}

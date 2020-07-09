/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7_matriz;

import java.util.Scanner;

/**
 *
 * @author omarmora
 */
public class Actividad7_Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y, i, j, n;
        Scanner leer=new Scanner(System.in);
        System.out.println("Inserte el numero de columnas");
        x=leer.nextInt();
        System.out.println("Inserte el numero de filas");
        y=leer.nextInt();
        System.out.println("Inserte el limite de numeros aleatorios");
        n=leer.nextInt();
        int [][] Matriz =new int [x][y];
        System.out.println("Matriz Aleatoria generada\n");
        for(i=0; i<x; i++)
        {
            for(j=0;j<y;j++)
            {
                Matriz[i][j]=(int)(Math.random()*n+1);
                System.out.print(+Matriz[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("\nMatriz Transpuesta\n");
        for(j=0;j<y;j++)
        {
            for(i=0;i<x;i++)
            {
                System.out.print(+Matriz[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    
}

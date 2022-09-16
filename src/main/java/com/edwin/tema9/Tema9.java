/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.edwin.tema9;

import conexiones.Clsconexion;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Tema9 {
 private static int opcion = -1;
 private static int niv =0 ;
 private static int niv2 =0 ;
 private static final   Scanner scanner = new Scanner (System.in);   
 
    public static void main(String[] args) {
       Clsconexion me = new Clsconexion();
      
         while (opcion != 0) {
            try {
                System.out.println("Elige opcion:\n1.- Visualizar tabla de empreados"
                        + "\n2.- Consulta por numero\n"
                        + "3.- Ver todos los vendedore y totales\n"
                        + "4.- Elimininar un vendedor\n"
                        + "5.- Actualizar el Niv\n"
                        + "0.- Salir");

                opcion = Integer.parseInt(scanner.nextLine());

                //Ejemplo de switch case en Java
                switch (opcion) {
                    case 1:
                         me.tabla();
                        break;
                    case 2:
                        System.out.println("Ingrese el numero del Vendedor");
                         niv = Integer.parseInt(scanner.nextLine());
                        me.nombreYdatos(niv);
                        break;
                    case 3:
                        me.nombresyTotales();
                        break;
                    case 4:
                        System.out.println("Ingrese el numero del Vendedor");
                         niv = Integer.parseInt(scanner.nextLine());
                        me.delete(niv);
                        System.out.println("Ha sido eliminado");
                        break;
                    case 5:
                        System.out.println("Ingrese el numero del Vendedor a modificar");
                         niv = Integer.parseInt(scanner.nextLine());
                         me.nombreYdatos(niv);
                         System.out.println("Ingrese el nuevo numero del Vendedor");
                         niv2 = Integer.parseInt(scanner.nextLine());                      
                        me.cambiaNIV(niv,niv2);
                        me.nombreYdatos(niv2);
                        break;      
                    case 0:
                        System.out.println("!Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opcion no reconocida");
                        break;
                }
                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("Error!");
            }
        }
       
       
       
    }
    
    
    
}

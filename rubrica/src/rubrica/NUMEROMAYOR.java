/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rubrica;

import java.util.Scanner;

/**
 *
 * @author FACCI
 */
public class NUMEROMAYOR {
     public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n1, n2;
      System.out.println("Ingresar el 1er numero: ");
      n1 = in.nextInt();
      System.out.println("Ingresar el 2do numero: ");
      n2 = in.nextInt();
      if (n1>n2){
           System.out.println("El numero mayor es: "+n1);
      }
      else{
           System.out.println("El numero mayor es: "+n2);
        }
      if (n1==n2)
      {
          System.out.println("Los numeros son iguales");
      }
 }
}
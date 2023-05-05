/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2_uf5_pablo;

import java.util.Scanner;

public class Practica2_UF5_Pablo {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            EquacioGrau2 eq = new EquacioGrau2(0, 4, 8);
            double sol1 = eq.getSol1();
            double sol2 = eq.getSol2();
            
            System.out.println("Primer resultat: " + sol1 + " | Segon resultat: " + sol2);
        } catch (PrimerCoeficientZeroException e) {
            System.out.println(e.getMessage());
        } catch (NoArrelsRealsException e) {
            System.out.println(e.getMessage());
        }

    }

}

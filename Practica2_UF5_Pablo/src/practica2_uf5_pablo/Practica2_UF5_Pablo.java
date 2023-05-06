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
            EquacioGrau2 eq = new EquacioGrau2(0, 5, 6);
            eq.arrels();
            System.out.println("Solucions: " + eq.getSol1() + ", " + eq.getSol2());
        } catch (PrimerCoeficientZeroException e) {
            System.out.println(e.getMessage());
        } catch (NoArrelsRealsException e) {
            System.out.println(e.getMessage());
        }
    }

}

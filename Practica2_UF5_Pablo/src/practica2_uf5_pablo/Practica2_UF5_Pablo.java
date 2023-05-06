/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2_uf5_pablo;

import java.util.Scanner;

public class Practica2_UF5_Pablo {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            EquacioGrau2 eq = new EquacioGrau2(1, 3, 4);
            eq.arrels();
            System.out.println("Solucions: " + eq.getSol1() + ", " + eq.getSol2());
        } catch (PrimerCoeficientZeroException e) {
            System.out.println(e.getMessage());
        } catch (NoArrelsRealsException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Introdueix el coeficient a: ");
        double a = scan.nextDouble();
        System.out.print("Introdueix el coeficient b: ");
        double b = scan.nextDouble();
        System.out.print("Introdueix el coeficient c: ");
        double c = scan.nextDouble();

        EquacioGrau2 eq = new EquacioGrau2(a, b, c);
        try {
            eq.arrels();
            System.out.println("Les solucions són: " + eq.getSol1() + ", " + eq.getSol2());
        } catch (PrimerCoeficientZeroException e) {
            System.out.println(e.getMessage());
        } catch (NoArrelsRealsException e) {
            System.out.println(e.getMessage());
        }
    }

}

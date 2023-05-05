/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2_uf5_pablo;

/**
 *
 * @author ausias
 */
public class EquacioGrau2 {
    
    private double a;
    private double b;
    private double c;
    private double sol1;
    private double sol2;
    
    public EquacioGrau2(double a, double b, double c) throws PrimerCoeficientZeroException, NoArrelsRealsException{
        if (a == 0) {
            throw new PrimerCoeficientZeroException("El primer coeficient es cero");
        }
        if (b * b < 4 * a * c) {
            throw new NoArrelsRealsException("Error d'arrel");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        arrels();
    }
    
    public void arrels() {
        double operacio = b * b - 4 * a * c;
        sol1 = (-b + Math.sqrt(operacio)) / (2 * a);
        sol2 = (-b - Math.sqrt(operacio)) / (2 * a);
    }
    
    public double getSol1() {
        return sol1;
    }
    
    public double getSol2() {
        return sol2;
    }
    
}

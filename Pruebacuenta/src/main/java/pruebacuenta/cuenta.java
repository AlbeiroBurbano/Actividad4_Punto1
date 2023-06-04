/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebacuenta;

public class cuenta {
     protected float saldo; 
     protected float comisionMensual = 0;
     protected float tasaAnual;
     protected int numeroRetiros = 0;
     protected int numeroConsignaciones = 0;
     
     public cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
     
   public void consignar(float cantidad) {
        saldo = saldo + cantidad; /* Se actualiza el saldo con la cantidad
        consignada */
        // Se actualiza el número de consignaciones realizadas en la cuenta
        numeroConsignaciones = numeroConsignaciones + 1;
    }
   public void retirar(float cantidad) {
        float nuevoSaldo = saldo - cantidad;
        /* Si la cantidad a retirar no supera el saldo, el retiro no se puede
        realizar */
        if (nuevoSaldo >= 0) {
        saldo -= cantidad;
        numeroRetiros = numeroRetiros + 1;
        } else {
            System.out.println("La cantida a retirar excede el saldo actual.");
        }
    }
   
   public void calcularInteres() {
        float tasaMensual = tasaAnual / 12; /* Convierte la tasa anual en
        mensual */
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual; /* Actualiza el saldo aplicando el interés
        mensual */
    }
/**
* Método que genera un extracto aplicando al saldo actual una
* comisión y calculando sus intereses
*/
    public void extractoMensual() {
    saldo -= comisionMensual;
    calcularInteres();
    }
}

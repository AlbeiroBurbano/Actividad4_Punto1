/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebacuenta;

/**
 *
 * @author albei
 */
public class cuentaAhorros extends cuenta{
    private boolean activa;
    
    public cuentaAhorros(float saldo, float tasa) {
    super(saldo, tasa);
    if (saldo < 10000) /* Si el saldo es menor a 10000, la cuenta no
    se activa */
    activa = false;
    else
    activa = true;
    }
    public void retirar(float cantidad) {
        if (activa) // Si la cuenta está activa, se puede retirar dinero
        super.retirar(cantidad); /* Invoca al método retirar de la clase
        padre */
    }
    
    public void consignar(float cantidad) {
       if (activa) // Si la cuenta está activa, se puede consignar dinero
       super.consignar(cantidad); /* Invoca al método consignar de  la clase padre */
       }
    public void extractoMensual() {

        if (numeroRetiros > 4) {
        comisionMensual += (numeroRetiros - 4) * 1000;
        }
        super.extractoMensual(); // Invoca al método de la clase padre
        /* Si el saldo actualizado de la cuenta es menor a 10000, la
        cuenta no se activa */
        if ( saldo < 10000 )
        activa = false;
        }
/**
* Método que muestra en pantalla los datos de una cuenta de
ahorros
*/
        public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Comisión mensual = $ " + comisionMensual);
        System.out.println("Número de transacciones = " +(numeroConsignaciones + numeroRetiros));
        System.out.println();
        }

    
    
    
    
}

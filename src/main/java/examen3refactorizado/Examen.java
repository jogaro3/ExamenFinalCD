
package examen3refactorizado;

 /**
 * Esta clase es para el examen final de la tercera evaluacion. Simula el realizar por ejemplo  ingresos y retiradas de una cuenta.
 * 
 * @author Jorge Garea Rodriguez
 * @version 1.0
 * @since 2024-06-12
 * 
 * 
 * */

    public class Examen {
        //contructor
        
        /**
         * Saldo con el cual se realizaran las operaciones
         * 
         */
    public double dSaldo = 0.0;

    /**
     * Método principal para ejecutar la clase Examen.
     * @see operativa_cuenta
     * @param args Desarrollo de la clase
     */
    public static void main(String[] args) {
        Examen cuenta1 = new Examen();
        cuenta1.operativa_cuenta(200.0f);
    }
/**
     * Método para realizar operaciones con la cuenta.
     *
     * @param cantidad Cantidad a ingresar o retirar de la cuenta
     */
    public void operativa_cuenta(float cantidad) {
        System.out.println("Saldo Incial: " + dSaldo + " euros");
        ingresar(-100);
        System.out.println("Saldo Incial: " + dSaldo + " euros");
        ingresar(100);
        System.out.println("Saldo tras ingreso: " + dSaldo + " euros");
        ingresar(2000);
        System.out.println("Saldo tras ingreso: " + dSaldo + " euros");

        ingresar(300);
        System.out.println("Saldo tras ingreso: " + dSaldo + " euros");
        retirar(50);
        System.out.println("Saldo tras retirada: " + dSaldo + " euros");
    }
 /**
     * Método para ingresar cantidades en la cuenta. 
     * Que tambien modifica el saldo.
     * 
     * @param cantidad Cantidad a ingresar.
     * @see operativa_cuenta 
     * @return Devuelve el saldo
     */
    public int ingresar(double cantidad) {
        int iCodErr;

        if (cantidad < 0) {
            System.out.println("No se puede ingresar una cantidad negativa");
            iCodErr = 1;
        } else if (cantidad == 0) {
            System.out.println("No se puede ingresar una cantidad de 0€");
            iCodErr = 1;
        } else if (cantidad == 3000) {
            System.out.println(
                    "Le recordamos que estamos obligados a notificar a Hacienda dicho ingreso (superior o igual a 3000€)");
            dSaldo += cantidad;
            iCodErr = 0;
        } else if (cantidad > 3000) {
            System.out.println("No se puede ingresar una cantidad superior a 3000€");
            iCodErr = 1;
        } else {
            dSaldo += cantidad;
            iCodErr = 0;
        }

        return iCodErr;
    }

    /**
     * Método para retirar cantidades.
     * @param cantidad Cantidad de saldo
     * @see operativa_cuenta 
     */
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("No se puede retirar una cantidad negativa");
        } else if (dSaldo < cantidad) {
            System.out.println("No hay suficiente saldo");
        } else {
            dSaldo -= cantidad;
            System.out.println("Le quedan " + dSaldo + " en cuenta");
        }
    }
}
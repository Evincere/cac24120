package banco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // try - catch
        System.out.print("Ingrese el monto para abrir la cuenta: ");
        double montoIngresado = scanner.nextDouble();
        CuentaBancaria cuentaUno = new CuentaBancaria(montoIngresado);
        cuentaUno.depositar(7500.00);
        cuentaUno.retirar(20000.00);
        cuentaUno.retirar(10000.00);
    }
}

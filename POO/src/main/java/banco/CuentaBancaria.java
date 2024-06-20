package banco;

public class CuentaBancaria {

    private double saldo;

    // creamos un constructor parametrizado
    public CuentaBancaria(double saldoInicial) {
        // this.saldo = saldoInicial;
        setSaldo(saldoInicial);
    }

    public void depositar(double cantidad) {
        if(cantidad > 0) {
            // this.saldo = this.saldo + cantidad;
            setSaldo(getSaldo() + cantidad);
            System.out.println("Se ha depositado $" + cantidad + ". El nuevo saldo es: $ " + getSaldo());
        } else {
            System.out.println("La cantidad a depositar debe ser mayor a cero");
        }
    }

    public void retirar(double cantidad) {
        if(cantidad > 0 && cantidad <= getSaldo()) {
            // this.saldo = this.saldo + cantidad;
            setSaldo(getSaldo()-cantidad);
            System.out.println("Se ha retirado $" + cantidad + ". El nuevo saldo es: $ " + getSaldo());
        } else {
            System.out.println("Esa cantidad no puede ser retirada");
        }
    }

    // getter y setter (normalmente serán publicos)
    private double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

package internetBank.tipoDeConta;

public class ContaCorrente {
    private double saqueCorrente;
    private double depositoCorrente;
    private double transferenciaCorrente;
    private String recebedor;

    // Extrato
    public String extratoCorrente() {
        String extrato = String.format(
                "\n\tEXTRATO CONTA CORRENTE\n\nDeposito: %.2f\nSaque: %.2f\nSaldo: %.2f\n%s",
                getDepositoCorrente(), getSaqueCorrente(),
                saldoParaExtrato(), transferencias());
        return extrato;
    }

    // Depósito
    public void setDepositoCorrente(double depositoCorrente) {
        this.depositoCorrente = depositoCorrente;
    }
    
    private double getDepositoCorrente() {
        return depositoCorrente;
    }

    // Saldo
    public String saldoCorrente() {
        double saldo = 0L;
        saldo += getDepositoCorrente();
        saldo -= getSaqueCorrente();
        saldo -= this.transferenciaCorrente;
        String saldoCorrente = String.format("\n\tSALDO\nTotal: %.2f", saldo);
        return saldoCorrente;
    }

    // Saldo para extrato
    private double saldoParaExtrato() {
        double saldo = 0L;
        saldo += getDepositoCorrente();
        saldo -= getSaqueCorrente();
        saldo -= this.transferenciaCorrente;
        return saldo;
    }

    // Transferência
    private String transferencias() {
        return "Transferencia [ Valor: " + transferenciaCorrente + ", Recebedor: " + recebedor + " ]";
    }

    public void setTransferenciaCorrente(double transferenciaCorrente, String recebedor) {
        this.transferenciaCorrente = transferenciaCorrente;
        this.recebedor = recebedor;
    }

    // Saque
    private double getSaqueCorrente() {
        return saqueCorrente;
    }

    public void setSaqueCorrente(double saqueCorrente) {
        this.saqueCorrente = saqueCorrente;
    }
}

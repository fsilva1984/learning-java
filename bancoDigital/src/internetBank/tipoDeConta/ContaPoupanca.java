package internetBank.tipoDeConta;

public class ContaPoupanca {
	private double saquePoupanca;
	private double depositoPoupanca;
	private double transferenciaPoupanca;
	private String recebedor;

	//extrato
	public String extratoPoupanca() {
		String extrato = String.format(
				"\n\tEXTRATO CONTA POUPANCA\n\nDeposito: %.2f\nSaque: %.2f\nSaldo: %.2f\n%s", 
				getDepositoPoupanca(), getSaquePoupanca(),
				saldoParaExtrato(), transferencias());
		return extrato;
	}

	//deposito
	public void setDepositoPoupanca(double depositoPoupanca) {
		this.depositoPoupanca = depositoPoupanca;
	}
	 private double getDepositoPoupanca() {
		return depositoPoupanca;
	}

	// saldo
	public String saldoPoupanca() {
		double saldo = 0L;
		saldo+= getDepositoPoupanca();
		saldo-= getSaquePoupanca();
		saldo -= this.transferenciaPoupanca;
		String saldoPoupanca = String.format("\n\tSALDO\nTotal: %.2f",saldo);
		return saldoPoupanca;
	}

	//saldo para extrato
	private double saldoParaExtrato() {
		double saldo = 0L;
		saldo+= getDepositoPoupanca();
		saldo-= getSaquePoupanca();
		saldo -= this.transferenciaPoupanca;
		return saldo;
	}

	//tranferencia
	private String transferencias() {
		return "Tranferencia [ Valor: " + transferenciaPoupanca + ", Recebedor: "+ recebedor + " ]" ;
	}
	public void setTransferenciaPoupanca(double transferenciaPoupanca, String recebedor) {
		this.transferenciaPoupanca = transferenciaPoupanca;
		this.recebedor = recebedor;
	}

	//saque
	private double getSaquePoupanca() {
		return saquePoupanca;
	}
	public void setSaquePoupanca(double saquePoupanca) {
		this.saquePoupanca = saquePoupanca;
	}

}

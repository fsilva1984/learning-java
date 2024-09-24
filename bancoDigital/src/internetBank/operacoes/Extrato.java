package internetBank.operacoes;

public class Extrato {
	private float extrato;

	public Extrato(float extrato) {
		super();
		this.extrato = extrato;
	}

	public float getExtrato() {
		return extrato;
	}

	@Override
	public String toString() {
		return "Extrato [ " + extrato + " ]";
	}
	
}

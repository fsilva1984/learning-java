package internetBank.usuarios;
import internetBank.tipoDeConta.*;
public class CriadorDeUsuario {
	private String nome;
	private int senha;
	private long cpf;
	public CriadorDeUsuario(String nome, int senha, long cpf) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public int getSenha() {
		return senha;
	}
	public long getCpf() {
		return cpf;
	}
	@Override
	public String toString() {
		return "Usuario [Nome: " + nome + ", Senha: " + senha + ", CPF: " + cpf + "]";
	}
	
	ContaCorrente contaCorrente = new ContaCorrente();
	

}




















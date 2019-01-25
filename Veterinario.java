
public class Veterinario {
	private String nome;
	
	public  Veterinario(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String aplicarInjecao(Animal a) {
		return "O Dr."+ this.getNome()+" aplicou injeção em " + a.getNome();
	}
}	

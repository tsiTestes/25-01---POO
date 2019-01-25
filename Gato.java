
public class Gato extends Animal{
	private int salto;
	
	public Gato(String nome, double peso,int salto) {
		super(nome, peso);
		this.salto = salto;
	}
	
	public String emitirSom() {
		return "miau";
	}
	
	public String toString() {
		return super.toString()+salto;
	}

	public int getSalto() {
		return salto;
	}

	public void setSalto(int salto) {
		this.salto = salto;
	}
	

}

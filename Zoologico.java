/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * Programação Orientada a Objetos
 * Prof. Fausto Maranhão Ayres
 **********************************/
import java.util.ArrayList;

public class Zoologico {
	private String nome;
	private ArrayList<Animal> animais = new ArrayList<>();

	public Zoologico(String nome) {
		this.nome = nome;
	}

	public void adicionar(Animal p){
		animais.add(p);
	}
	public void remover(Animal p){
		animais.remove(p);
	}

	public Animal localizar(String nome){
		for(Animal p : animais){
			if(p.getNome().equals(nome))
				return p;
		}
		return null;
	}

	public ArrayList<Animal> getProdutos() {
		return animais;
	}
	/*************************************/


	public int getTotalAnimais(){
		return animais.size();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		String texto = "Zoologico:" + nome;
		if (animais.isEmpty())
			texto += "não tem animal";
		else
			for(Animal p: animais)  texto += "\n" + p; 

		return texto;
	}


	public int totalAnimaisPesoMenor(double valor) {
		int total=0;
		for(Animal a: animais) {
			if(a.getPeso()<valor)
				total++;
		}

		return total;
	}

	public int totalAnimaisPesoMaior(double valor) {
		int total=0;
		for(Animal a: animais) {
			if(a.getPeso()>valor)
				total++;
		}

		return total;
	}

	public ArrayList<Animal> getGordinhos() {
		ArrayList<Animal> gordinhos = new ArrayList<>();
		double media = this.getPesoMedio();
		for(Animal a : animais) {
			if(a.getPeso() > media)
				gordinhos.add(a);
		}

		return gordinhos;
	}

	public double getPesoMedio() {
		double soma=0;
		for(Animal a: animais) {
			soma += a.getPeso();
		}

		if(animais.isEmpty())
			return 0;
		else
			return soma/animais.size();
	}

	public ArrayList<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}

	public int contarGatos() {
		int i=0;
		for(Animal a : animais) {
			if(a instanceof Gato)
				i++;	
		}
		return i;
	}

	public int contarCachorro() {
		int i=0;
		for(Animal a : animais) {
			if(a instanceof Cachorro)
				i++;	
		}
		return i;
	}

	public Animal obterMaiorAninal() {
		Animal animal = animais.get(0);
		for(Animal a :animais) {
			if(a.getPeso()>animal.getPeso())
				animal = a;
		}
		return animal;
	}

	public ArrayList<Gato> obterGatos(){
	 ArrayList<Gato> gatos = new ArrayList<>();
		for(Animal a: animais) {
			if(a instanceof Gato)
				gatos.add((Gato)a);
		}
		return gatos;
	}
	
	public ArrayList<Gato> obterGatosSaltadores(){
		 ArrayList<Gato> gatosSaltadores = new ArrayList<>();
		 	
		 	for(Animal a: animais) {
		 		if(a instanceof Gato && ((Gato)a).getSalto()>3)
		 			gatosSaltadores.add((Gato)a);
		 	}
		 	return gatosSaltadores;
	}
}
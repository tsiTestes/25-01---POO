/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * Programação Orientada a Objetos
 * Prof. Fausto Maranhão Ayres
 **********************************/
 
public class Animal {
        private String nome;
        private double peso;
         
        public Animal(String nome, double peso) {
            super();
            this.nome = nome;
            this.peso = peso;
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public double getPeso() {
            return peso;
        }
        public void setPeso(double peso) {
            this.peso = peso;
        }
        
        public String emitirSom() {
        	return "nenhum";
        }
        
        
        @Override
        public String toString() {
            return (nome != null ? "Nome=" + nome + ", " : "") + "peso=" + peso;
        }
         
         
     
}
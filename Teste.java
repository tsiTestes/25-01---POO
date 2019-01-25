import java.util.ArrayList;

/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * Programação Orientada a Objetos
 * Prof. Fausto Maranhão Ayres
 * 
 * exemplo usado nos slides
 **********************************/
 
public class Teste {
 
    public static void main(String[] args){
    	Zoologico z = new Zoologico("Zoologico PB");
    	
       Gato g1 = new Gato("Francisca",7,4);
       Gato g2 = new Gato("Sivirina",5,2);
       Gato g3 = new Gato("Belinha",2.4,6);
       Gato g4 = new Gato("Bigode",6.4,3);


       Cachorro c1 = new Cachorro("Lua",30.5);
       Cachorro c2 = new Cachorro("Marley",40.5);
       Cachorro c3 = new Cachorro("Bob",70.5);

//       Animal a1 = new Animal("Macaco",2.5);
//       Animal a2 = new Animal("Onça",30.5);
//       Animal a3 = new Animal("Cobra",4.35);


       z.adicionar(g1);
       z.adicionar(g2);
       z.adicionar(g3);
       z.adicionar(g4);

       z.adicionar(c1);
       z.adicionar(c2);
       z.adicionar(c3);
       
       
       Veterinario v1 = new Veterinario("Roberto");
       
       System.out.println("A gata "+g1.getNome()+" faz " + g1.emitirSom()+"!");
       System.out.println(v1.aplicarInjecao(g1));
       System.out.println(c1.getNome()+" faz "+c1.emitirSom());
       System.out.println("Quantidade de gatos: "+z.contarGatos());
       System.out.println("Quantidade de gatos: "+z.contarCachorro());
       System.out.println("Maior animal: "+z.obterMaiorAninal());
       System.out.println("Gatos do zoológico: "+z.obterGatos());
       System.out.println("Gatos saltadores: "+z.obterGatosSaltadores());

    }
}
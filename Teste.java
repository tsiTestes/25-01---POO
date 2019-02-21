import java.util.ArrayList;

/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * Programa��o Orientada a Objetos
 * Prof. Fausto Maranh�o Ayres
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
       Cachorro c4 = new Cachorro("Phiphi",5.2);


       z.adicionar(g1);
       z.adicionar(g2);
       z.adicionar(g3);
       z.adicionar(g4);

       z.adicionar(c1);
       z.adicionar(c2);
       z.adicionar(c3);
       z.adicionar(c4);
       
       
       Veterinario v1 = new Veterinario("Roberto");
       Veterinario v1 = new Veterinario("Amanda");
        Veterinario v1 = new Veterinario("Taysa");


       
       System.out.println("A gata "+g1.getNome()+" faz " + g1.emitirSom()+"!");
       System.out.println(v1.aplicarInjecao(g1));
       System.out.println(c1.getNome()+" faz "+c1.emitirSom());
       System.out.println("Quantidade de gatos: "+z.contarGatos());
       System.out.println("Quantidade de gatos: "+z.contarCachorro());
       System.out.println("Maior animal: "+z.obterMaiorAninal());
       System.out.println("Gatos do zool�gico: "+z.obterGatos());
       System.out.println("Gatos saltadores: "+z.obterGatosSaltadores());

    }
}
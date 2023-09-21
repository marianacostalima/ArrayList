import java.util.ArrayList;

public class Sout {
    public static void main(String[] args){
        ArrayList<String> cor = new ArrayList<String>();
       
        cor.add("Mariana");
        cor.add("Maria");

        //remove 
        //cor.remove(1); //1 = a posição 

        //remove todos os itens de uma so vez
        //cor.clear();

        //Mostra todos os valores
        //System.out.println(cor.toString());

        //Mostra o item de uma posição especifica
        //System.out.println(cor.get(1));

        //testa se o array esta vazio ou não, e vai retorna um valor verdadeiro ou falso 
        //falso ele nao ta vazio
        //verdadeiro ele esta vazio 
        //System.out.println(cor.isEmpty());

        //testa se algum item esta dentro do array
        //System.out.println(cor.contains("Mariana"));

        //mostra o tamanho do array
        //System.out.println(cor.size());

        //retorna a posição do item
        System.out.println(cor.indexOf("Aline"));


    }
}
import java.util.Scanner;
import java.util.ArrayList; 

public class Main {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> adicionar = new ArrayList<String>();

        String novoElemento = null;

        adicionar.add("Vermelho");
        adicionar.add("Verde");
        adicionar.add("Azul");
       
        adicionar.add(0, novoElemento);

        System.out.println(adicionar);
    }
    public static String lerTexto(String novoElemento){
        novoElemento = LER.nextLine();
        return novoElemento;
    }
}
import java.util.Scanner;
import java.util.ArrayList; 

public class a {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> cor = new ArrayList<String>();
        String texto = null;

        //solicite que o usuário adicione algumas cores
        cor.add(lerTexto(texto));

        //imprima toda a lista na tela;
        System.out.println(cor);
    }

    //le a resposta do usuario
    public static String lerTexto(String texto){
        texto = LER.nextLine();
        return texto;
    }
}


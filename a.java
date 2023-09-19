import java.util.Scanner;
import java.util.ArrayList; 

public class a {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> cor = new ArrayList<String>();
        String texto = null;

        cor.add(lerTexto(texto));
        System.out.println(cor);
    }

    public static String lerTexto(String texto){
        texto = LER.nextLine();
        return texto;
    }
}
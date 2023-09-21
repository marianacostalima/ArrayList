import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        String texto = null
        int n = lerN();
        int k = lerK();
        
        for (int i = 0; i < n; i++) {

            alunos.add(lerTexto(texto));
            
        }

        Collections.sort(alunos);

        System.out.println(alunos.get(k - 1));
    }

    public static String lerTexto(String texto){
        texto = LER.nextLine();
        return texto;
    }
    
    public static int lerK(int k){

        do{
            k = LER.nextInt();
        } while (k < 1);

        return k;
    }

    public static int lerN(int n){

        do{
            n = LER.nextInt();
        } while (n < 1 || n > 100);

        return n;
    }
}
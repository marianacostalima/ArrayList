import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        while (LER.hasNext()) {
            ArrayList<Integer> notas = new ArrayList<>();
            ArrayList<Integer> resultados = new ArrayList<>();

            int n = 0; 
            int q = 0; 

            n = lerN(n);
            q = lerQ(q);

            int posicao = 0;

            
            for (int i = 0; i < n; i++) {
                notas.add(lerNota());
            }
          
            Collections.sort(notas, Collections.reverseOrder());

            for (int i = 0; i < q; i++) {
                posicao = lerPosicao(posicao);
                resultados.add(notas.get(posicao - 1));
            }
            
            for (Integer resultado : resultados) {
                System.out.println(resultado);
            }
        }
    }

    public static int lerPosicao(int posicao) {
        posicao = LER.nextInt();
        return posicao;
    }

    public static int lerNota() {
        int nota = LER.nextInt();
        return nota;
    }

    public static int lerN(int n) {
        do {
            n = LER.nextInt();
        } while (n < 1 || n > 100);

        return n;
    }

    public static int lerQ(int q) {
        do {
            q = LER.nextInt();
        } while (q < 1 || q > 100);
        return q;
    }
}

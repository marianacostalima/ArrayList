import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> vitoria = new ArrayList<>();
        ArrayList<Integer> pontuacaoTotal = new ArrayList<>();


        int j = 0; 
        int r = 0; 

        j = lerJ(j);
        r = lerR(r);

        for (int i = 0; i < j * r; i++) {
            vitoria.add(lerJogo());
        }

        for (int i = 0; i < j; i++) {
            pontuacaoTotal.add(0);
        }

        for (int i = 0; i < j * r; i++) {
            int jogadorAtual = i % j;
            pontuacaoTotal.set(jogadorAtual, pontuacaoTotal.get(jogadorAtual) + vitoria.get(i));
        }

        int jogadorVencedor = 0;
        int pontuacaoMaxima = pontuacaoTotal.get(0);

        for (int i = 1; i < j; i++) {
            if (pontuacaoTotal.get(i) >= pontuacaoMaxima) {
                pontuacaoMaxima = pontuacaoTotal.get(i);
                jogadorVencedor = i;
            }
        }
        
        System.out.println(jogadorVencedor + 1);
    }
    public static int lerJ(int j){
        do{
            j = LER.nextInt();
        }while(j < 1 || j > 500);
        return j;
    }

    public static int lerR(int r){
        do{
            r = LER.nextInt();
        }while(r < 1 || r > 500);
        return r;
    }

    public static int lerJogo() {
        int jogo = LER.nextInt();
        return jogo;
    }
}

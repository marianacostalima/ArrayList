import java.util.Scanner;
import java.util.ArrayList; 
import java.util.Collections;

public class a {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> recupere = new ArrayList<String>();

        recupere.add(2);  //0
        recupere.add(5);  //1
        recupere.add(7);  //2
        recupere.add(12); //3
        recupere.add(46); //4

        //coloca a lista em crescente
        Collections.sort(recupere);
       
        //imprime o ultimo elemento
        System.out.println(recupere.get(recupere.size()-1));
        //imprime o primeiro elemnto 
        System.out.println(recupere.get(0));
    }

}
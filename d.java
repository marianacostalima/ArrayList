import java.util.Scanner;
import java.util.ArrayList; 
import java.util.Collections;

public class a {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> remover = new ArrayList<String>();
        String elemento = null;

        remover.add("Mariana"); //0
        remover.add("Rani");    //1
        remover.add("Iza");     //2
        remover.add("Heitor");  //3
        remover.add("Helena");  //4

        //remove o terceiro elemento 
        remover.remove(2); 

        //reverte o intem removido
        Collections. reverse(remover);
        
        //imprime a lista com o elemeto removido
        System.out.println(remover);
    }
}
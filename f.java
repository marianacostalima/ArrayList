import java.util.Scanner;
import java.util.ArrayList; 
import java.util.Collections;

public class a {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> media = new ArrayList<String>();
        double calcula = 0;

        media.add(2);  //0
        media.add(5);  //1
        media.add(7);  //2
        media.add(12); //3
        media.add(46); //4

        for(int i = 0; i < media.size(); i++ ){
            calcula += media.get(i);
        }
        
        calcula = calcula / media.size();
        System.out.println(calcula);
    }

}
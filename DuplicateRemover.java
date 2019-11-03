import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayList;

public class DuplicateRemover {
    public static String uniqueWord="";
    public static void remove(FileInputStream dataFile){
        Scanner input = new Scanner(dataFile);
        ArrayList<String> words = new ArrayList<String>();

        while(input.hasNext()){
            words.add(input.next());
        }

        int i, j;
        for(i=0; i<words.size(); i++){
            for(j=0; j<i; j++){
                if(words.get(i).equals(words.get(j))){
                    words.remove(j);
                }
            }
        }
        for(i=0; i<words.size(); i++) {
            uniqueWord = uniqueWord.concat(words.get(i) + " ");
        }
    }

    public static void write(FileOutputStream outputFile){
        PrintWriter output = new PrintWriter(outputFile);
        output.println(uniqueWord);
        output.flush();
    }
}

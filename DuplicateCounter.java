import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateCounter {
    public static int wordCounter[] = new int[1000];
    public static int num=0;
    public static String uniqueWords[] = new String[1000];
    public static void count(FileInputStream dataFile){
        Scanner input = new Scanner(dataFile);

        while(input.hasNext()){
            uniqueWords[num] = input.next();
            num++;
        }

        int i, j;
        int k=0;
        for (i = 0; i < num; i++) {
            for (j = 0; j < i; j++) {
                if (uniqueWords[i].equals(uniqueWords[j])) {
                    wordCounter[i]++;
                }
            }
        }
    }

    public static void write(FileOutputStream outputFile){
        PrintWriter output = new PrintWriter(outputFile);
        int i;
        for(i=0; i<num; ++i) {
            output.println(uniqueWords[i] + " " + wordCounter[i]);
        }
        output.flush();
    }
}

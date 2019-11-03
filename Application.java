import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application {
    public static void main (String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("problem1.txt");
        FileOutputStream outputStream = new FileOutputStream("unique_words.txt");

        DuplicateRemover.remove(inputStream);
        DuplicateRemover.write(outputStream);

        inputStream.close();
        outputStream.close();
    }
}
